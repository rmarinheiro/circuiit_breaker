package com.rafael.pubication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PubicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PubicationApplication.class, args);
	}

}
