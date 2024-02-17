package org.shequal.jobportal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JobPortalApplication {
	static Logger logger = LoggerFactory.getLogger(JobPortalApplication.class);

	public static void main(String[] args) {
		logger.trace("Trace Log");
		logger.debug("Debug Log");
		logger.info("Info Log");
		logger.warn("Warning Log");
		logger.error("Error Log");
		SpringApplication.run(JobPortalApplication.class, args);
	}

}
