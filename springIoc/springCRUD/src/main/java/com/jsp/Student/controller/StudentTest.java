package com.jsp.Student.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.Student.MyConfig;
import com.jsp.Student.dao.StudentCRUD;
import com.jsp.Student.dto.Student;

public class StudentTest {

	@Bean
	public Student saveStudent(Student student)
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		Student student2=(Student)context.getBean("");
		student2.setId(1);
		student2.setName("shyam");
		student2.setAge(22);
		StudentCRUD crud=new StudentCRUD();
		return crud.saveStudent(student2);
	}
}
