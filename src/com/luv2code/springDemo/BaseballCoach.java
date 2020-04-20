package com.luv2code.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	@Autowired
	@Qualifier("happyFortune")
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Bat for 1 hour";
	}
	public BaseballCoach() {
		// TODO Auto-generated constructor stub
	}
	
	
	
//	public BaseballCoach(@Qualifier("happyFortune")FortuneService fortuneService) {
//		//super();
//		this.fortuneService = fortuneService;
//	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
