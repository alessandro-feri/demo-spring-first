package com.examples.spring.demo.first;

import org.springframework.stereotype.Component;

import com.examples.spring.demo.first.service.GreetingsService;

@Component
public class GreetingsServiceAlternativeImpl implements GreetingsService {

	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "Hi";
	}

}
