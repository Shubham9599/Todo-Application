package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoAppApplication {

	public static void main(String[] args) {
		System.out.println("Start");
		SpringApplication.run(ToDoAppApplication.class, args);
	}

}
