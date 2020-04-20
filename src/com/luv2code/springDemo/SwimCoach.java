package com.luv2code.springDemo;

public class SwimCoach implements Coach{
	
	private FortuneService fortuneService;

	public SwimCoach(FortuneService happyFortune) {
		// TODO Auto-generated constructor stub
		 fortuneService = happyFortune;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Workout of Swimmers";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	
	
}
