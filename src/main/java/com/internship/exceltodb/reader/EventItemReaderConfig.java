package com.internship.exceltodb.reader;

import com.internship.exceltodb.model.Event;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.extensions.excel.poi.PoiItemReader;
import org.springframework.batch.extensions.excel.RowMapper;
import org.springframework.batch.extensions.excel.support.rowset.RowSet;

@Configuration
public class EventItemReaderConfig {

    @Bean
    public ItemReader<Event> eventItemReader() {
        PoiItemReader<Event> reader = new PoiItemReader<>();
        reader.setResource(new ClassPathResource("data/events.xlsx"));
        reader.setRowMapper(new EventExcelRowMapper());
        reader.setLinesToSkip(1); // Skip header row
        return reader;
    }

    static class EventExcelRowMapper implements RowMapper<Event> {
        @Override
        public Event mapRow(RowSet rs) throws Exception {
            Event event = new Event();
            event.setEventId(Integer.parseInt(rs.getCurrentRow()[0]));
            event.setEventName(rs.getCurrentRow()[1]);
            event.setEventCity(rs.getCurrentRow()[2]);
            event.setEventYear(Integer.parseInt(rs.getCurrentRow()[3]));
            event.setEventMonth(Integer.parseInt(rs.getCurrentRow()[4]));
            event.setEventDay(Integer.parseInt(rs.getCurrentRow()[5]));
            event.setEventTime(rs.getCurrentRow()[6]);
            event.setEventUsersCount(Integer.parseInt(rs.getCurrentRow()[7]));
            return event;
        }
    }
}
