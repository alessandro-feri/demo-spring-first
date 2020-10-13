package com.examples.spring.demo.first.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingsServiceDefaultImpl implements GreetingsService {

	private GreetingPreProcessor preProcessor;
	
	@Autowired
	public GreetingsServiceDefaultImpl(GreetingPreProcessor grePreProcessor) {
		// TODO Auto-generated constructor stub
		this.preProcessor = preProcessor;
	}
	
	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return preProcessor.preprocess("Hello");
	}

}
