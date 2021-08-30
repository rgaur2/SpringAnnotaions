package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
        //load spring config file
		ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
 
		
		//retrive bean from the spring container
		Coach thecoach = context.getBean("tennisCoach", Coach.class);
		Coach alphacoach = context.getBean("tennisCoach", Coach.class);
		
		//check to see  they are same
		
		boolean result = (thecoach == alphacoach);
		
		//prinout the result 
		System.out.println("\n Pointing to the sama object" + result);
		System.out.println("\nMemory location of theCoach "+ thecoach);
		
		System.out.println("\nMemory location of theCoach "+ alphacoach );
		
		context.close();

	}

}
