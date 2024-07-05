package com.jsp.SpringHibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonController {
	
	
public static void main(String[] args) {
	Person person=new Person();
	person.setId(1);
	person.setAge(22);
	person.setName("shyam");

	ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
	PersonService service=(PersonService)context.getBean("personservice");
	Person p=service.savePerson(person);
	if(p!=null)
	{
		System.out.println("done");
	}else {
		System.out.println("not done");
	}
}
}
