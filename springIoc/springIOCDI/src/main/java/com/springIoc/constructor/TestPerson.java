package com.springIoc.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ConDI.xml");
	Person person=(Person)applicationContext.getBean("per1");
	person.test();
}
}
