package com.educloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EducloudEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EducloudEurekaApplication.class, args);
	}
}
