package com.edumark.edumarkservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EdumarkServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdumarkServiceApplication.class, args);
	}

}
