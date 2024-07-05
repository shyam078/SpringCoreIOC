package com.jsp.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDaoo {

	public void save(Student student)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("shyam");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.persist(student);
		transaction.commit();
	}
}
