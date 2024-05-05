package com.internship.exceltodb.reader;

import com.internship.exceltodb.dto.UserDto;
import org.apache.poi.ss.usermodel.*;
import org.springframework.batch.item.ItemReader;
import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;
import java.util.Iterator;

public class UserExcelItemReader implements ItemReader<UserDto> {
    private Iterator<Row> rowIterator;

    public UserExcelItemReader() throws Exception {
        InputStream inputStream = new ClassPathResource("data/users.xlsx").getInputStream();
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);
        this.rowIterator = sheet.iterator();
        rowIterator.next(); // Skip header
    }

    @Override
    public UserDto read() {
        if (!rowIterator.hasNext()) {
            return null; // End of data
        }

        Row row = rowIterator.next();
        UserDto user = new UserDto();
        user.setUserId((int) row.getCell(0).getNumericCellValue());
        user.setFirstName(row.getCell(1).getStringCellValue());
        user.setLastName(row.getCell(2).getStringCellValue());
        user.setEmail(row.getCell(3).getStringCellValue());
        user.setDobYear((int) row.getCell(4).getNumericCellValue());
        user.setDobMonth((int) row.getCell(5).getNumericCellValue());
        user.setDobDay((int) row.getCell(6).getNumericCellValue());
        user.setGender(row.getCell(7).getStringCellValue());
        user.setCity(row.getCell(8).getStringCellValue());
        user.setEventId((int) row.getCell(9).getNumericCellValue());
        user.setRole(row.getCell(10).getStringCellValue());
        return user;
    }
}
