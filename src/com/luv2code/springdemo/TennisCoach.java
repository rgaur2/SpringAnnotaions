package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")// annotation to tell the bean this is my javabean
@Component  // inversion of control //use @Component instead  of define id in xml
//@Scope("prototype")
public class TennisCoach implements Coach {
     
	@Autowired   // BY using Field Injection rest all work is done by spring automatically
    //@Qualifier("happyFortuneService")// tell spring we want to load this bean
	@Qualifier("randomFortuneService")
	private FortuneService fortuneservice;
	
	
	//define my init method
	public TennisCoach()
	{
	 System.out.println(">>Tennis coach inside of default constructor");
	}
	

	@PostConstruct  //run initially after constructor is defined by object
	public void domyStartupStuff()
	{
		System.out.println(">> TennisCoach:inside of  domyStartupStuff");
	}
	//define  my destroy method
	

	//domy destroy method
	@PreDestroy   // run at the end of program 
	public void domyCleanStuff()
	{
		System.out.println(">>> TennisCoach:inside of domyCleanStuff");
	}
	
	/*
	@Autowired // tell spring i want autowire spring dependency by settter
	public void setFortuneService(FortuneService thefortuneservice )
	{
		System.out.println(">> TennisCoach:inside seteFortune() method");
		fortuneservice = thefortuneservice;
		
	}
	*/
	
	
	/*
	@Autowired // tell spring i want autowire spring dependency 
	public void doSomecrazystuff(FortuneService thefortuneservice )
	{
		System.out.println(">> TennisCoach:inside docrwazystuff method");
		fortuneservice = thefortuneservice;
		
	}
	/*
	
	construtor injection of autowired by calling constructor
	@Autowired  // call FortuneService interface and call class which implements FortuneService and print body
	public TennisCoach(FortuneService thefortuneservice )
	{
		fortuneservice=thefortuneservice;
	}
	
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneservice.getFortune();    //HappyFortuneService implemetaion class 
		//RandomFortuneService implementation class
	}

}
