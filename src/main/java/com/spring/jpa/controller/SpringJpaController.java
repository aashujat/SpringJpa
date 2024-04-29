package com.spring.jpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringJpaController {
	
	@GetMapping("/home")
	public String get() {
	
		return "Demo page";
	}

}
