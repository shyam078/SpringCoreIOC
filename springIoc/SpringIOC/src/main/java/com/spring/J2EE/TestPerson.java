package com.spring.J2EE;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springioc.xml");
	Person person=(Person)applicationContext.getBean("per");
	person.Run();
}
}
