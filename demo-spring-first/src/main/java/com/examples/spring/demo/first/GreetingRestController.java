package com.examples.spring.demo.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.spring.demo.first.service.GreetingsService;

@RestController
public class GreetingRestController {

	private GreetingsService greetingsService;
	
	@Autowired
	public GreetingRestController(GreetingsService greetingsService) {
		// TODO Auto-generated constructor stub
		this.greetingsService = greetingsService;
	}
	
	@GetMapping("/hi")
	public String sayHi() {
		return greetingsService.getGreeting();
	}
}
