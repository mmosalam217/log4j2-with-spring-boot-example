package com.loggers.logdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogdemoApplication implements ApplicationRunner{

	private static final Logger logger = LogManager.getLogger(LogdemoApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(LogdemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.info("LOGGER STARTED");
		logger.warn("DUMMY WARNING");
		logger.error("BLOODY ERROR");
	}

}
