package com.setter.springDemo;

public class CricketCoach implements Coach {

	private Fortune fortune;
	
	public CricketCoach() {
		System.out.println("inside contructor");
	}
	
	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
		System.out.println("inside setter method");
	}

	@Override
	public String getDaily() {
		
		return "hit a four on a length a ball..";
	}

	@Override
	public String getDailyFortune() {
	
		return fortune.happyFortune() ;
	}

}
