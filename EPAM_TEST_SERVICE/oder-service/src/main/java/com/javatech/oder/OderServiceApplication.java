package com.javatech.oder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.javatech.oder")
public class OderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OderServiceApplication.class, args);
	}

}
