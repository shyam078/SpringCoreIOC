package com.springioc.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPerson {
public static void main(String[] args) {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
	People person=(People)applicationContext.getBean("person");
	person.run();
	}
}
