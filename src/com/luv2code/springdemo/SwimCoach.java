 package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneservice;
	
	@Value("${foo.email}")      //this is field level injection 
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	//dependecy injection by using constructor 
	public SwimCoach(FortuneService thefortuneservice)
	{
		fortuneservice = thefortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warmup";
	}

	@Override
	public String getDailyFortune() {//SadFortuneService
		return fortuneservice.getFortune() ;
	}

}
