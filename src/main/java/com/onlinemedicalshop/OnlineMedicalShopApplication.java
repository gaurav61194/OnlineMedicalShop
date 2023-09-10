package com.onlinemedicalshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineMedicalShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineMedicalShopApplication.class, args);
		System.out.println("Connected to database...!");
	}
	
	
}