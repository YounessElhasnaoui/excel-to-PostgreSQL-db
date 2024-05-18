package com.internship.exceltodb.config;

import com.internship.exceltodb.dto.*;
import com.internship.exceltodb.reader.DynamicExcelReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

import java.util.Iterator;
import java.util.List;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(BatchConfiguration.class);

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private PlatformTransactionManager transactionManager;

    @Value("${excel.file.path}")
    private String excelFilePath;

    @Value("${batch.chunk.size}")
    private int chunkSize;

    @Bean
    public ItemReader<ApplicationsDto> applicationsItemReader() throws Exception {
        return createReader(ApplicationsDto.class, "Applications");
    }

    @Bean
    public ItemReader<AppOwnerDto> appOwnerItemReader() throws Exception {
        return createReader(AppOwnerDto.class, "App_Owner");
    }

    @Bean
    public ItemReader<AppTagDto> appTagItemReader() throws Exception {
        return createReader(AppTagDto.class, "App_Tag");
    }

    @Bean
    public ItemReader<AppRTPODto> appRtpoItemReader() throws Exception {
        return createReader(AppRTPODto.class, "App_RTPO");
    }

    @Bean
    public ItemReader<PersonnesDto> personnesItemReader() throws Exception {
        return createReader(PersonnesDto.class, "Personnes");
    }

    @Bean
    public ItemReader<AppTechnoDto> appTechnoItemReader() throws Exception {
        return createReader(AppTechnoDto.class, "App_Techno");
    }

    @Bean
    public ItemReader<TechnoTypeDto> technoTypeItemReader() throws Exception {
        return createReader(TechnoTypeDto.class, "Techno_Type");
    }

    @Bean
    public ItemReader<TypeAllDto> typeItemReader() throws Exception {
        return createReader(TypeAllDto.class, "Types");
    }

    @Bean
    public ItemReader<CapacityDto> capacityItemReader() throws Exception {
        return createReader(CapacityDto.class, "Capacite");
    }

    private <T> ItemReader<T> createReader(Class<T> clazz, String sheetName) throws Exception {
        DynamicExcelReader reader = new DynamicExcelReader();
        List<T> dataList = reader.readExcel(clazz, excelFilePath, sheetName);
        Iterator<T> iterator = dataList.iterator();

        return new ItemReader<T>() {
            @Override
            public T read() {
                if (iterator.hasNext()) {
                    return iterator.next();
                } else {
                    return null;
                }
            }
        };
    }

    @Bean
    public ItemWriter<ApplicationsDto> applicationsItemWriter() {
        return createWriter();
    }

    @Bean
    public ItemWriter<AppOwnerDto> appOwnerItemWriter() {
        return createWriter();
    }

    @Bean
    public ItemWriter<AppTagDto> appTagItemWriter() {
        return createWriter();
    }

    @Bean
    public ItemWriter<AppRTPODto> appRtpoItemWriter() {
        return createWriter();
    }

    @Bean
    public ItemWriter<PersonnesDto> personnesItemWriter() {
        return createWriter();
    }

    @Bean
    public ItemWriter<AppTechnoDto> appTechnoItemWriter() {
        return createWriter();
    }

    @Bean
    public ItemWriter<TechnoTypeDto> technoTypeItemWriter() {
        return createWriter();
    }

    @Bean
    public ItemWriter<TypeAllDto> typeItemWriter() {
        return createWriter();
    }

    @Bean
    public ItemWriter<CapacityDto> capacityItemWriter() {
        return createWriter();
    }

    private <T> ItemWriter<T> createWriter() {
        return items -> {
            for (T item : items) {
                logger.info("Read data: {}", item);
            }
        };
    }

    @Bean
    public Step applicationsStep() throws Exception {
        return createStep("applicationsStep", applicationsItemReader(), applicationsItemWriter());
    }

    @Bean
    public Step appOwnerStep() throws Exception {
        return createStep("appOwnerStep", appOwnerItemReader(), appOwnerItemWriter());
    }

    @Bean
    public Step appTagStep() throws Exception {
        return createStep("appTagStep", appTagItemReader(), appTagItemWriter());
    }

    @Bean
    public Step appRtpoStep() throws Exception {
        return createStep("appRtpoStep", appRtpoItemReader(), appRtpoItemWriter());
    }

    @Bean
    public Step personnesStep() throws Exception {
        return createStep("personnesStep", personnesItemReader(), personnesItemWriter());
    }

    @Bean
    public Step appTechnoStep() throws Exception {
        return createStep("appTechnoStep", appTechnoItemReader(), appTechnoItemWriter());
    }

    @Bean
    public Step technoTypeStep() throws Exception {
        return createStep("technoTypeStep", technoTypeItemReader(), technoTypeItemWriter());
    }

    @Bean
    public Step typeStep() throws Exception {
        return createStep("typeStep", typeItemReader(), typeItemWriter());
    }

    @Bean
    public Step capacityStep() throws Exception {
        return createStep("capacityStep", capacityItemReader(), capacityItemWriter());
    }

    private <T, R> Step createStep(String stepName, ItemReader<T> reader, ItemWriter<R> writer) throws Exception {
        return new StepBuilder(stepName, jobRepository)
                .<T, R>chunk(chunkSize, transactionManager)
                .reader(reader)
                .writer(writer)
                .listener(new StepListener())
                .build();
    }

    @Bean
    public Job readExcelJob() throws Exception {
        return new JobBuilder("readExcelJob", jobRepository)
                .start(applicationsStep())
                .next(appOwnerStep())
                .next(appTagStep())
                .next(appRtpoStep())
                .next(personnesStep())
                .next(appTechnoStep())
                .next(technoTypeStep())
                .next(typeStep())
                .next(capacityStep())
                .listener(new JobListener())
                .preventRestart()
                .build();
    }
}
