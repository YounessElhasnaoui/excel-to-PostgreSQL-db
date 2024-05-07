package com.internship.exceltodb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.Date;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.internship.exceltodb.repository")
@EntityScan(basePackages = "com.internship.exceltodb.model")
public class ExcelToDbApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(ExcelToDbApplication.class);

	@Autowired
	private JobLauncher jobLauncher;

	@Autowired
	private Job importExcelJob;

	public static void main(String[] args) {
		SpringApplication.run(ExcelToDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Starting Excel to DB import job.");
		jobLauncher.run(importExcelJob, new JobParametersBuilder()
				.addDate("timestamp", new Date())
				.toJobParameters());
		logger.info("Finished Excel to DB import job.");
	}
}
