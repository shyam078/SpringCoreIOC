package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.jsp.dto.Student;


@Component
public class StudentDao {

	public Student saveStudent(Student student)
	{
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("dbinfo");
		EntityManager manager=managerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		if(student!=null) {
		transaction.begin();
		manager.persist(student);
		transaction.commit();
		}
		return student;
	}
}
