package com.luv2code.springDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.luv2code.springDemo")
public class ConfigurationClass {

	
	@Bean
	public SwimCoach swimCoach()
	{
		return new SwimCoach(happyFortune());
	}
	
	@Bean
	public FortuneService happyFortune()
	{
		return new HappyFortune();
	}
	
}
