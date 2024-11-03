package com.dyma_tuto.tennis;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TennisApplication {

	private static final Logger log = LogManager.getLogger(TennisApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TennisApplication.class, args);
		log.info("http://localhost:8080/swagger-ui/index.html");
	}

}
