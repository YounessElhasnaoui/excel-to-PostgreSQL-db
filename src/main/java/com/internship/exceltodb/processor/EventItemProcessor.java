package com.internship.exceltodb.processor;

import com.internship.exceltodb.model.Event;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Component
public class EventItemProcessor implements ItemProcessor<Event, Event> {
    private final DateTimeFormatter excelFormatter = DateTimeFormatter.ofPattern("HH.mm.ss");
    private final DateTimeFormatter dbFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Override
    public Event process(Event item) throws Exception {
        if (item.getEventTime() != null && !item.getEventTime().isEmpty()) {
            LocalTime time = LocalTime.parse(item.getEventTime(), excelFormatter);
            item.setEventTime(time.format(dbFormatter));
        }
        return item;
    }
}
