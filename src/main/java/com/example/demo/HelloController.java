package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	Environment environment;
	
	@GetMapping("/hello")
	public String test() {
		return "PORT: " + environment.getProperty("PORT");
	}
	
}


