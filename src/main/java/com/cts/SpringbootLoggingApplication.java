package com.cts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootLoggingApplication {
	

	Logger logger = LoggerFactory.getLogger(SpringbootLoggingApplication.class);

	@GetMapping("api/{name}")
	public String greetings(@PathVariable String name) {
		logger.debug("Request {}", name);
		String response = "<h1>Hi " + name + ", Welcome to SLF4J</h1>";
		logger.debug("Response {}", response);
		return response;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLoggingApplication.class, args);
	}

}

// SLF4J: Its abstraction over several logging frameworks e.g. log4j, JUL, logback
