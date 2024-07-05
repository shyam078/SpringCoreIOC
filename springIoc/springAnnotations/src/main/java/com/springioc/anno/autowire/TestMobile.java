package com.springioc.anno.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springioc.anno.MyConfig;

public class TestMobile {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
	Mobile mobile=(Mobile)context.getBean("mobile");
	mobile.call();
}
}
