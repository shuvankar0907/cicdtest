package com.springboot.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application /*extends SpringBootServletInitializer*/{

	public static void main(String[] args) {
		System.out.println("Application stating...");
		SpringApplication.run(Application.class, args);
		System.out.println("Application stated...");

	}

}
