package com.ltoe.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication(
		scanBasePackages = {"com.ltoe"},
		exclude = {SecurityAutoConfiguration.class, DataSourceAutoConfiguration.class})
public class LtoeApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(LtoeApplication.class);

	private JobLauncher jobLauncher;
	private Job job;

	public LtoeApplication(JobLauncher jobLauncher, Job job) {
		this.jobLauncher = jobLauncher;
		this.job = job;
	}

	public static void main(String[] args) {
		SpringApplication.run(LtoeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		JobParameters jobParameters = new JobParametersBuilder()
//				.addDate("date", new Date())
//				.addString("uuid", UUID.randomUUID().toString())
//				.toJobParameters();
//		long startTime = System.currentTimeMillis();
//		this.jobLauncher.run(this.job, jobParameters);
//		long endTime = System.currentTimeMillis();
//		endTime = (endTime - startTime)/1000;
//		logger.info("total execution time(seconds): {}", endTime);
	}
}
