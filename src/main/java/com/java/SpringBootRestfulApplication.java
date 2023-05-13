package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestfulApplication {

	public static void main(String[] args) {
		System.out.println("Restful service");
		SpringApplication.run(SpringBootRestfulApplication.class, args);
	}

}
