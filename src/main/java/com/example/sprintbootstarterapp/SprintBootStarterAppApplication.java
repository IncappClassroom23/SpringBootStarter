package com.example.sprintbootstarterapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SprintBootStarterAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintBootStarterAppApplication.class, args);
	}

}
