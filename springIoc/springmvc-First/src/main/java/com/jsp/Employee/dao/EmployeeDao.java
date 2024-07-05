	package com.jsp.Employee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.Employee.dto.Employee;

@Component
	public class EmployeeDao {
	
		static EntityManagerFactory factory=Persistence.createEntityManagerFactory("shyam");
		static EntityManager manager=factory.createEntityManager();
		static EntityTransaction transaction=manager.getTransaction();

		public Employee saveEmployee(Employee employee)
		{
			if(employee!=null) {
			transaction.begin();
			manager.persist(employee);
			transaction.commit();
			
			return employee;
			}
		return null;
		}
		public Employee UpdateEmployee(Employee employee)
		{
			Employee employee2=manager.find(Employee.class, employee.getId());
			
			if(employee2!=null) {
			transaction.begin();
			manager.merge(employee);
			transaction.commit();
			
			return employee2;
			}
		return null;
		}
		public Employee deleteEmployee(int id)
		{
			Employee employee=manager.find(Employee.class, id);
			if(employee!=null) {
			transaction.begin();
			manager.remove(employee);
			transaction.commit();
			
			return employee;
			}
			return null;	
		}
		public Employee getById(int id)
		{
			return manager.find(Employee.class, id);
		}
		public List<Employee> getAll()
		{
			Query query=manager.createQuery("select p from Employee p");
			return query.getResultList();
		}
}
