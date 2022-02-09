package com.setter.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach=context.getBean("myCoach",CricketCoach.class);
		
		System.out.println(coach.getDaily());
		System.out.println(coach.getDailyFortune());
		
		context.close();
		
	}
	
}
