package com.springIoc.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSDI {
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ConDI.xml");
	Person2 person=(Person2)applicationContext.getBean("per");
	person.test();
}
}
