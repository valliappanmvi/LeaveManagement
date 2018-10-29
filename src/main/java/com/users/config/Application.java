/**
 * 
 */
package com.users.config;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

// Test for GIT Commit
@SpringBootApplication
@ComponentScan("com.users")
public class Application extends SpringBootServletInitializer  {
		
	private static Logger logger = Logger.getLogger(Application.class);
		
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(Application.class);
	}
		
	public static void main(String[] args) {		
		logger.info("Starting executing springBoot.....");
		SpringApplication.run(Application.class, args);
	}

}
