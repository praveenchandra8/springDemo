package com.luv2code.springDemo;

import org.springframework.stereotype.Component;

@Component
public class BadFortune implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "lage hue hain tere";
	}

}
