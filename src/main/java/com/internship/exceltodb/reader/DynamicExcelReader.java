package com.internship.exceltodb.reader;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.core.io.ClassPathResource;

import com.internship.exceltodb.annotation.ExcelColumn;

import org.apache.poi.ss.usermodel.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.InputStream;

public class DynamicExcelReader {

    private static final Logger logger = LoggerFactory.getLogger(DynamicExcelReader.class);

    public <T> List<T> readExcel(Class<T> clazz, String excelFilePath, String sheetName) throws Exception {
        logger.info("Reading Excel file: {} from sheet: {}", excelFilePath, sheetName);

        // Load the Excel file
        InputStream inputStream = new ClassPathResource(excelFilePath).getInputStream();
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheet(sheetName);
        List<T> result = new ArrayList<>();

        // Get the row iterator
        Iterator<Row> rowIterator = sheet.iterator();

        // Skip the header row
        if (rowIterator.hasNext()) {
            logger.debug("Skipping header row(0)");
            rowIterator.next();
            if (rowIterator.hasNext()) {
                logger.debug("Skipping header row(1)");
                rowIterator.next();
            }
        }

        // Iterate over rows
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            logger.debug("Reading row number: {}", row.getRowNum());

            // Create a new instance of the class
            T instance = clazz.getDeclaredConstructor().newInstance();

            // Iterate over cells in the row
            for (Cell cell : row) {
                int columnIndex = cell.getColumnIndex();

                // Find the field annotated with @ExcelColumn with matching index
                for (Field field : clazz.getDeclaredFields()) {
                    if (field.isAnnotationPresent(ExcelColumn.class) &&
                            field.getAnnotation(ExcelColumn.class).value() == columnIndex) {
                        String setterName = "set" + capitalize(field.getName());
                        Method setter = clazz.getMethod(setterName, field.getType());
                        Object cellValue = convertCellValue(cell, field.getType());

                        logger.debug("Setting field: {} with value: {}", field.getName(), cellValue);
                        setter.invoke(instance, cellValue);
                    }
                }
            }

            // Add the populated instance to the result list
            result.add(instance);
            logger.debug("Added instance: {}", instance);
        }

        logger.info("Finished reading Excel file: {} from sheet: {}", excelFilePath, sheetName);
        return result;
    }

    private Object convertCellValue(Cell cell, Class<?> fieldType) {
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return cell.getDateCellValue();
                } else {
                    if (fieldType == Long.class || fieldType == long.class) {
                        return (long) cell.getNumericCellValue();
                    } else {
                        return cell.getNumericCellValue();
                    }
                }
            case BOOLEAN:
                return cell.getBooleanCellValue();
            default:
                return null;
        }
    }

    private String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
