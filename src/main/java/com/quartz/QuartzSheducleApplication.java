package com.quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class QuartzSheducleApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuartzSheducleApplication.class, args);
	}

}
