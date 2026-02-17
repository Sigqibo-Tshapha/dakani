package com.logitech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@Profile("dev")
@SpringBootApplication
public class LogisticsApplication {
	public static void main(String[] args) {
		SpringApplication.run(LogisticsApplication.class, args);
	}

}
