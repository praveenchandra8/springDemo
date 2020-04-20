package com.luv2code.springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppJavaConfiguration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		//context.refresh();
	
		Coach swimCoach = context.getBean("swimCoach" ,Coach.class);
		Coach footballCoach = context.getBean("footballCoach" ,Coach.class);
		Coach baseBallCoach = context.getBean("baseballCoach", Coach.class);
		CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
		System.out.println(baseBallCoach.getDailyWorkout());
		System.out.println(baseBallCoach.getDailyFortune());
		
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());
		
		System.out.println(footballCoach.getDailyWorkout());
		System.out.println(footballCoach.getDailyFortune());
		
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());

	}

}
