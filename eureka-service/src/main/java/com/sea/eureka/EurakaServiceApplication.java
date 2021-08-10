package com.sea.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EurakaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurakaServiceApplication.class, args);
	}

}
