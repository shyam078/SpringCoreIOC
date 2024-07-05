package com.spring.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestField {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("testFiels.xml");
	Car car=(Car)context.getBean("car");
	car.test();
	}
}
