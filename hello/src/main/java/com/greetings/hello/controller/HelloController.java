package com.greetings.hello.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${configure.name}")
	private String name;	
	
	@GetMapping("/hello")
	public String helloMessage() {
		String sample = "Hi " + name + " : responded on - " + new Date();
		System.out.println(sample);
		return sample;
	}
}
