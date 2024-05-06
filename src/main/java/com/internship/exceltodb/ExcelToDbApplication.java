package com.internship.exceltodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.internship.exceltodb.repository")
@EntityScan(basePackages = "com.internship.exceltodb.model")
public class ExcelToDbApplication implements CommandLineRunner {

	@Autowired
	private JobLauncher jobLauncher;

	@Autowired
	private Job importExcelJob;

	public static void main(String[] args) {
		SpringApplication.run(ExcelToDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		jobLauncher.run(importExcelJob, new JobParametersBuilder().toJobParameters());
	}
}
