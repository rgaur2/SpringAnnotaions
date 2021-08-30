package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;

//The Following class is used to replace application.xml file
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration //tell the sping hey this is java spring configuration to load beans we are  not  using  xml file
@ComponentScan("com.luv2code.springdemo") //This works Excatly like component scanning we usedin xml file 
@PropertySource("classpath:sport.properties")//load properties file  
public class SportConfig {

	//@Configuration
	//@ComponentScan
	//@Bean
	
	
	//define a bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService()
	{
		return new SadFortuneService();
	}
	
	
	
	//define a bean for our swim coach and inject dependency
	@Bean
	public Coach swimCoach()
	
	{
		return new SwimCoach(sadFortuneService());
	}
	
	
	//Behind the sean it works like this
	/* @Bean 
  public Coach swimCoach() {   
   SwimCoach mySwimCoach = new SwimCoach();   
   return mySwimCoach; 
  }
  
  */
}
