package com.example.charity_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CharityAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CharityAppApplication.class, args);
	}

}
