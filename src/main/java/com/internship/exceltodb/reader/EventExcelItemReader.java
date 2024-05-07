package com.internship.exceltodb.reader;

import com.internship.exceltodb.dto.EventDto;
import org.apache.poi.ss.usermodel.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.util.Iterator;

public class EventExcelItemReader implements ItemReader<EventDto> {
    private static final Logger logger = LoggerFactory.getLogger(EventExcelItemReader.class);
    private Iterator<Row> rowIterator;

    public EventExcelItemReader() throws Exception {
        InputStream inputStream = new ClassPathResource("data/events.xlsx").getInputStream();
        Workbook workbook = WorkbookFactory.create(inputStream);
        // Select the `events` sheet
        Sheet sheet = workbook.getSheet("events");
        this.rowIterator = sheet.iterator();
        rowIterator.next(); // Skip header
        logger.info("Event Excel Item Reader initialized on the `events` sheet.");
    }

    @Override
    public EventDto read() {
        if (!rowIterator.hasNext()) {
            logger.info("No more events to read.");
            return null; // End of data
        }

        Row row = rowIterator.next();
        EventDto event = new EventDto();
        event.setEventId(getNumericValueFromCell(row.getCell(0)));
        event.setEventName(row.getCell(1).getStringCellValue());
        event.setEventCity(row.getCell(2).getStringCellValue());
        event.setEventYear(getNumericValueFromCell(row.getCell(3)));
        event.setEventMonth(getNumericValueFromCell(row.getCell(4)));
        event.setEventDay(getNumericValueFromCell(row.getCell(5)));
        event.setEventTime(convertTime(row.getCell(6)));
        event.setEventUsersCount(getNumericValueFromCell(row.getCell(7)));

        logger.debug("Read Event: {}", event);
        return event;
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

    private LocalTime convertTime(Cell cell) {
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        switch (cell.getCellType()) {
            case NUMERIC:
                return LocalTime.parse(new SimpleDateFormat("HH:mm:ss").format(cell.getDateCellValue()), timeFormat);
            case STRING:
                return LocalTime.parse(cell.getStringCellValue().replace('.', ':'), timeFormat);
            default:
                throw new IllegalArgumentException("Invalid cell type for time value: " + cell.getCellType());
        }
    }
}
