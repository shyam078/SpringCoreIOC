package com.SpringMvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import com.SpringMvc.dto.Demo;

@Component
public class DemoDao {

	public Demo save(Demo demo)
	{
		EntityManagerFactory  factory=Persistence.createEntityManagerFactory("shyam");
		EntityManager  manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.persist(demo);
		transaction.commit();
		return demo;
	}
}
