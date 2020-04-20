package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation-applicationContext.xml");
		
		Coach baseBallCoach = context.getBean("baseballCoach", Coach.class);
		CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
		System.out.println(baseBallCoach.getDailyWorkout());
		System.out.println(baseBallCoach.getDailyFortune());
		
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.getTeam());
	}

}
