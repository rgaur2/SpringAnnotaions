package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config java class
		AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext(SportConfig.class);
		// get the bean from spring container
		
		
		SwimCoach thecoach = context.getBean("swimCoach",SwimCoach.class);//inversion of control by annotation
		//call method on a bean
		
		System.out.println(thecoach.getDailyWorkout());
		// call the method to get daily Fortune 
		
		System.out.println(thecoach.getDailyFortune());
		//call our new methods .. has the prop values injected
		
		System.out.println("email" + thecoach.getEmail());
		System.out.println("team" + thecoach.getTeam());
		 
		
		//close the context
		
		
		context.close();

	}

}
