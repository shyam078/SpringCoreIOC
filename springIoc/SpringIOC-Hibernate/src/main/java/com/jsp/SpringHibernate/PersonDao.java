package com.jsp.SpringHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDao {

	@Autowired
	EntityManagerFactory factory;
	
	public Person savePerson(Person person)
	{
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		if(person!=null)
		{
			transaction.begin();
			manager.persist(person);
			transaction.commit();
			return person;
		}
		return null;
	}
}
