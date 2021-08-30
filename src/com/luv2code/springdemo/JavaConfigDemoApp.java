package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config java class
		
		AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext(SportConfig.class);
		// get the bean from spring container
		
		
		Coach thecoach = context.getBean("tennisCoach",Coach.class);//inversion of control by annotation
		//call method on a bean
		System.out.println(thecoach.getDailyWorkout());
		// call the method to get daily Fortune 
		System.out.println(thecoach.getDailyFortune()  + "Here");
		
		//close the context
		
		
		context.close();

	}

}
