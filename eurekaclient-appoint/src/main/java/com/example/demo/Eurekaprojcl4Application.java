package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Eurekaprojcl4Application {

	public static void main(String[] args) {
		SpringApplication.run(Eurekaprojcl4Application.class, args);
	}

}
