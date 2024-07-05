package com.springioc.anno.au;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "student")
public class Student {
	
	@Value("shyam")
	String name;
	
	public void study()
	{
		System.out.println("name is :"+name);
	}
}
