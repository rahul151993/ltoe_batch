package com.ltoe.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(scanBasePackages = {"com.ltoe"}, exclude = {SecurityAutoConfiguration.class, DataSourceAutoConfiguration.class})
public class LtoeApplication {

	private static final Logger logger = LoggerFactory.getLogger(LtoeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LtoeApplication.class, args);
	}
}
