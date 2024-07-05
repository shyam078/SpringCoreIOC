package com.springioc.anno.au;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springioc.anno.MyConfig;

public class TestStudent {
public static void main(String[] args) {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
	Student student=(Student)applicationContext.getBean("student");
	student.study();
}
}
