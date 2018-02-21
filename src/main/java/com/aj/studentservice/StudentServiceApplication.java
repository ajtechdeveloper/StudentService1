package com.aj.studentservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@SpringBootApplication
public class StudentServiceApplication {

    private static final Logger logger = LoggerFactory.getLogger(StudentServiceApplication.class);

	public static void main(String[] args) throws Exception {
		SpringApplication.run(StudentServiceApplication.class,args);
	}
}
