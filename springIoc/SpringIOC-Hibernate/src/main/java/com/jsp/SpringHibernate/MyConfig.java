package com.jsp.SpringHibernate;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jsp")
public class MyConfig {

	public EntityManagerFactory getentitymanagerfactory()
	{
		return Persistence.createEntityManagerFactory("shyam");
	}
}
