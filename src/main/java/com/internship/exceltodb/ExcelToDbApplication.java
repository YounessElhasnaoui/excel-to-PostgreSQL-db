package com.internship.exceltodb;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class ExcelToDbApplication {

	@Autowired
	private JobLauncher jobLauncher;

	@Autowired
	private Job readExcelJob;

	public static void main(String[] args) {
		SpringApplication.run(ExcelToDbApplication.class, args);
	}

	@PostConstruct
	public void run() throws Exception {
		JobExecution jobExecution = jobLauncher.run(readExcelJob, new JobParametersBuilder().addLong("run.id", System.currentTimeMillis()).toJobParameters());
		if (jobExecution.getStatus().isUnsuccessful()) {
			System.err.println("Job failed");
		} else {
			System.out.println("Job completed successfully");
		}
	}
}
