package com.springioc.anno.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component(value = "mobile")
public class Mobile {
	
	@Autowired
	Sim sim;
	
//	@Bean
	public void call()
	{
		System.out.println("in mobile class");
		sim.connect();
	}
}
