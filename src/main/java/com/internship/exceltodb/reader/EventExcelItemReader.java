package com.internship.exceltodb.reader;

import com.internship.exceltodb.dto.EventDto;
import org.apache.poi.ss.usermodel.*;
import org.springframework.batch.item.ItemReader;
import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;
import java.util.Iterator;

public class EventExcelItemReader implements ItemReader<EventDto> {
    private Iterator<Row> rowIterator;

    public EventExcelItemReader() throws Exception {
        InputStream inputStream = new ClassPathResource("data/events.xlsx").getInputStream();
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);
        this.rowIterator = sheet.iterator();
        rowIterator.next(); // Skip header
    }

    @Override
    public EventDto read() {
        if (!rowIterator.hasNext()) {
            return null; // End of data
        }

        Row row = rowIterator.next();
        EventDto event = new EventDto();
        event.setEventId((int) row.getCell(0).getNumericCellValue());
        event.setEventName(row.getCell(1).getStringCellValue());
        event.setEventCity(row.getCell(2).getStringCellValue());
        event.setEventYear((int) row.getCell(3).getNumericCellValue());
        event.setEventMonth((int) row.getCell(4).getNumericCellValue());
        event.setEventDay((int) row.getCell(5).getNumericCellValue());
        event.setEventTime(row.getCell(6).getStringCellValue());
        event.setEventUsersCount((int) row.getCell(7).getNumericCellValue());
        return event;
    }
}
