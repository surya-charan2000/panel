package com.SpringBoot.Tourist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class TouristDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouristDataApplication.class, args);
	}

}
