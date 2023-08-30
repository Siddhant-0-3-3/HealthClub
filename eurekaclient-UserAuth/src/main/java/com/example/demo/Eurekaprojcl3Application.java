package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Eurekaprojcl3Application {

	public static void main(String[] args) {
		SpringApplication.run(Eurekaprojcl3Application.class, args);
	}

}
/* insert into course values(101,5000,'sandip','advance java',200,300);
insert into course values(102,6000,'Kiran','Micro Services',200,300);
insert into course values(103,7000,'Madhu','Python',400,600);
*/

