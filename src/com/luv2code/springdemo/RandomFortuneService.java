package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	
	
	//create an array of String
	private String []data = {"Beware of sheep in wolf's cloth,"
			                 + "Diligences is the mother of good luck",
			                 "The journey is reward"
			
			
	};
	
	//create random numbere generator 
	private Random myRandom = new Random();
	
	
	@Override
	public String getFortune() {
		// PICK a random string from array
		int index = myRandom.nextInt(data.length);
		String theFortune= data[index];
		return theFortune;
	}

}
