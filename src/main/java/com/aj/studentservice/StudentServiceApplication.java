package com.aj.studentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class StudentServiceApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(StudentServiceApplication.class,args);
	}
}
