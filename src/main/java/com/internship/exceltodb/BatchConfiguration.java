package com.internship.exceltodb;


import com.internship.exceltodb.model.User;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.extensions.excel.poi.PoiItemReader;
import org.springframework.batch.extensions.excel.RowMapper;
import org.springframework.batch.extensions.excel.support.rowset.RowSet;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

    @Bean
    public ItemReader<User> userItemReader() {
        PoiItemReader<User> reader = new PoiItemReader<>();
        reader.setResource(new FileSystemResource("path/to/your/excel/users.xlsx"));
        reader.setRowMapper(new UserExcelRowMapper());
        reader.setLinesToSkip(1);
        return reader;
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

}
