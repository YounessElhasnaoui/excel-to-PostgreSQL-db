package com.internship.exceltodb.config;


import com.internship.exceltodb.model.User;
import com.internship.exceltodb.model.Event;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.extensions.excel.poi.PoiItemReader;
import org.springframework.batch.extensions.excel.RowMapper;
import org.springframework.batch.extensions.excel.support.rowset.RowSet;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

    @Bean
    public ItemReader<User> userItemReader() {
        PoiItemReader<User> readerUser = new PoiItemReader<>();
        readerUser.setResource(new ClassPathResource("data/events.xlsx"));
        readerUser.setRowMapper(new UserExcelRowMapper());
        readerUser.setLinesToSkip(1);
        return readerUser;
    }

    public static class UserExcelRowMapper implements RowMapper<User> {
        @Override
        public User mapRow(RowSet rs) throws Exception {
            User user = new User();
            user.setUserId(Integer.parseInt(rs.getCurrentRow()[0]));
            user.setFirstName(rs.getCurrentRow()[1]);
            user.setLastName(rs.getCurrentRow()[2]);
            user.setEmail(rs.getCurrentRow()[3]);
            user.setDobYear(Integer.parseInt(rs.getCurrentRow()[4]));
            user.setDobMonth(Integer.parseInt(rs.getCurrentRow()[5]));
            user.setDobDay(Integer.parseInt(rs.getCurrentRow()[6]));
            user.setGender(rs.getCurrentRow()[7]);
            user.setCity(rs.getCurrentRow()[8]);
            user.setEventId(Integer.parseInt(rs.getCurrentRow()[9]));
            user.setRole(rs.getCurrentRow()[10]);
            return user;
        }
    }


    @Bean
    public ItemReader<Event> eventItemReader() {
        PoiItemReader<Event> readerEvent = new PoiItemReader<>();
        readerEvent.setResource(new ClassPathResource("data/events.xlsx"));
        readerEvent.setRowMapper(new EventExcelRowMapper());
        readerEvent.setLinesToSkip(1);
        return readerEvent;
    }

    public static class EventExcelRowMapper implements RowMapper<Event> {
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
