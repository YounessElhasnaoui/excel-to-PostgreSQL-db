package com.internship.exceltodb.config;

import com.internship.exceltodb.dto.UserDto;
import com.internship.exceltodb.dto.EventDto;
import com.internship.exceltodb.reader.UserExcelItemReader;
import com.internship.exceltodb.reader.EventExcelItemReader;
import com.internship.exceltodb.service.UserService;
import com.internship.exceltodb.service.EventService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {
    private static final Logger logger = LoggerFactory.getLogger(BatchConfiguration.class);

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private PlatformTransactionManager transactionManager;

    @Autowired
    private UserService userService;

    @Autowired
    private EventService eventService;

    @Bean
    public ItemReader<UserDto> userItemReader() throws Exception {
        return new UserExcelItemReader();
    }

    @Bean
    public ItemReader<EventDto> eventItemReader() throws Exception {
        return new EventExcelItemReader();
    }

    @Bean
    public ItemWriter<UserDto> userItemWriter() {
        return items -> {
            for (UserDto userDto : items) {
                userService.saveUser(userDto);
                logger.info("User written to database: {}", userDto);
            }
        };
    }

    @Bean
    public ItemWriter<EventDto> eventItemWriter() {
        return items -> {
            for (EventDto eventDto : items) {
                eventService.saveEvent(eventDto);
                logger.info("Event written to database: {}", eventDto);
            }
        };
    }

    @Bean
    public Step eventStep() throws Exception {
        return new StepBuilder("eventStep", jobRepository)
                .<EventDto, EventDto>chunk(10, transactionManager)
                .reader(eventItemReader())
                .writer(eventItemWriter())
                .listener(new StepListener())
                .build();
    }

    @Bean
    public Step userStep() throws Exception {
        return new StepBuilder("userStep", jobRepository)
                .<UserDto, UserDto>chunk(10, transactionManager)
                .reader(userItemReader())
                .writer(userItemWriter())
                .listener(new StepListener())
                .build();
    }

    @Bean
    public Job importExcelJob() throws Exception {
        return new JobBuilder("importExcelJob", jobRepository)
                .start(eventStep())
                .next(userStep())
                .listener(new JobListener())
                .preventRestart()
                .build();
    }
}