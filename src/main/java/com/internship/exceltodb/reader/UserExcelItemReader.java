package com.internship.exceltodb.reader;

import com.internship.exceltodb.dto.UserDto;
import org.apache.poi.ss.usermodel.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;
import java.util.Iterator;

public class UserExcelItemReader implements ItemReader<UserDto> {
    private static final Logger logger = LoggerFactory.getLogger(UserExcelItemReader.class);
    private Iterator<Row> rowIterator;

    public UserExcelItemReader() throws Exception {
        InputStream inputStream = new ClassPathResource("data/events.xlsx").getInputStream();
        Workbook workbook = WorkbookFactory.create(inputStream);
        // Select the `users` sheet
        Sheet sheet = workbook.getSheet("users");
        this.rowIterator = sheet.iterator();
        rowIterator.next(); // Skip header
        logger.info("User Excel Item Reader initialized on the `users` sheet.");
    }

    @Override
    public UserDto read() {
        if (!rowIterator.hasNext()) {
            logger.info("No more users to read.");
            return null; // End of data
        }

        Row row = rowIterator.next();
        UserDto user = new UserDto();
        user.setUserId(getNumericValueFromCell(row.getCell(0)));
        user.setFirstName(row.getCell(1).getStringCellValue());
        user.setLastName(row.getCell(2).getStringCellValue());
        user.setEmail(row.getCell(3).getStringCellValue());
        user.setDobYear(getNumericValueFromCell(row.getCell(4)));
        user.setDobMonth(getNumericValueFromCell(row.getCell(5)));
        user.setDobDay(getNumericValueFromCell(row.getCell(6)));
        user.setGender(row.getCell(7).getStringCellValue());
        user.setCity(row.getCell(8).getStringCellValue());
        user.setEventId(getNumericValueFromCell(row.getCell(9)));
        user.setRole(row.getCell(10).getStringCellValue());

        logger.debug("Read User: {}", user);
        return user;
    }

    private int getNumericValueFromCell(Cell cell) {
        switch (cell.getCellType()) {
            case NUMERIC:
                return (int) cell.getNumericCellValue();
            case STRING:
                return Integer.parseInt(cell.getStringCellValue().trim());
            default:
                throw new IllegalArgumentException("Invalid cell type for numeric value: " + cell.getCellType());
        }
    }
}