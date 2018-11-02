package com.greetings.messageApp.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class messageAppController {
	
	@Value("${message.name}")
	private String message;	
	
	@GetMapping("/message")
	public String sendMessage() {
		String sample = "Hi " + message + " : Message posted on - " + new Date();
		System.out.println(sample);
		return sample;
	}
}
