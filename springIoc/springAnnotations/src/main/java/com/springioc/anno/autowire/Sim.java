package com.springioc.anno.autowire;

import org.springframework.stereotype.Component;

@Component
public class Sim {

	public void connect() {
		System.out.println("in sim class");
	}

}
