package com.luv2code.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Autowired
	@Qualifier("badFortune")
	private FortuneService fortuneService;
	private String team;
	
	public CricketCoach() {
	// TODO Auto-generated constructor stub
	}


	
	public String getTeam() {
	return team;
}



public void setTeam(String team) {
	this.team = team;
}


	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Bowl for 4 min after a 1k run";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "From Crciket Coach"+fortuneService.getFortune();
	}

}
