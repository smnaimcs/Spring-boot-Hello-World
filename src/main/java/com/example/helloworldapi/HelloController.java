package com.example.helloworldapi;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Value("${app.greeting.message:Hello}")
	public String greetingmessage;
	
	@GetMapping("/")
	public String helloWorld() {
		return "Hello, World!";
	}
	
	@GetMapping("/greet")
	public String greet(@RequestParam(defaultValue = "Guest") String name) {
		return "Hello, " + name + "!";
	}

	@GetMapping("/time")
	public String currentTime() {
		return "Current server time: " + LocalDateTime.now();
	}

	@GetMapping("/greet/{name}")
	public String greetWithPath(@PathVariable String name) {
		return "Hello, " + name + "! Welcome to our API!";
	}

	@GetMapping("/custom")
	public String customGreeting() {
		return greetingmessage;
	}
}	
