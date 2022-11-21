package com.first.rest.api.firstRestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class FirstRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstRestApiApplication.class, args);
		System.out.println("welcome ayham");
	}

}
