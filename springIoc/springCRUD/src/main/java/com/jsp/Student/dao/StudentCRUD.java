package com.jsp.Student.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.Student.dto.Student;

@Component(value = "student")
public class StudentCRUD {

	@Autowired
	Student student;
	
	public Student saveStudent(Student student)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.persist(student);
		transaction.commit();
		
		return student;
	}
}
