package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		
		
		Coach thecoach = context.getBean("tennisCoach",Coach.class);//inversion of control by annotation
		//call method on a bean
		System.out.println(thecoach.getDailyWorkout());
		// call the method to get daily Fortune 
		System.out.println(thecoach.getDailyFortune());
		
		//close the context
		
		context.close();

	}

}
