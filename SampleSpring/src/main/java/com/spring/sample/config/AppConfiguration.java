package com.spring.sample.config;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Configuration
 * 
 * @author Sekhar
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.spring.sample.*")
public class AppConfiguration {
	private static final Logger logger = Logger.getLogger(AppConfiguration.class);

	public AppConfiguration() {
		logger.info("AppConfiguration loading..");

	}

}