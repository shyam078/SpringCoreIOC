package com.spring.listconst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestList {
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("questioanswer.xml");
	Question question=(Question)applicationContext.getBean("qa");
	question.display();
}
}
