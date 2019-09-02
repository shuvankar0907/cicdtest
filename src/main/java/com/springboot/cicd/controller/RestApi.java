package com.springboot.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {
	
	@GetMapping("/hello")
	public String getHello() {
		return "Hello World 12345";
	}

}
