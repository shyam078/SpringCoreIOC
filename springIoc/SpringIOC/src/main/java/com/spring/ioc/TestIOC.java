package com.spring.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestIOC {
public static void main(String[] args) {
	ClassPathResource pathResource=new ClassPathResource("springioc.xml");
	BeanFactory beanFactory=new XmlBeanFactory(pathResource);
	Student student=(Student)beanFactory.getBean("test");
	student.test();
}
}

