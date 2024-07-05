package com.springioc.anno;

import org.springframework.stereotype.Component;

@Component(value = "person")
public class People {

	public void run()
	{
		System.out.println("run run");
	}
}