package com.jsp.SpringHibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonService {

	@Autowired
	PersonDao dao;
	
	public Person savePerson(Person person)
	{
		return dao.savePerson(person);
	}
}
