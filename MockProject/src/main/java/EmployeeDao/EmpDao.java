package EmployeeDao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import EmployeeDto.Employee;

@Component
public class EmpDao {

	static EntityManagerFactory factory=Persistence.createEntityManagerFactory("unit");
	static EntityManager manager=factory.createEntityManager();
	static EntityTransaction transaction=manager.getTransaction();
	public Employee SaveEmp(Employee employee) {
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
		return employee;
	}
	public void delete(int id) {
		Employee e=manager.find(Employee.class, id);
		if(e!=null) {
			transaction.begin();
			manager.remove(e);
			transaction.commit();
		}
		else {
			System.out.println("check");
		}
	}
	public Employee login(Employee employee) {
		Employee email=manager.find(Employee.class, employee.getEmail());
		Employee password=manager.find(Employee.class, employee.getPassword());
		if(email!=null&&password!=null) {
			return employee;
		}
		else {
			System.out.println("check the condition");
		}
		return employee;
		
	}
	public Employee update(Employee employee) {
		Employee e=manager.find(Employee.class, employee.getId());
		if(e!=null) {
		transaction.begin();	
		manager.merge(employee);
		transaction.commit();
		return e;
	}
		else {
			System.out.println("check the condition");
		}
		return employee;
	}
	public Employee getbyid(int id) {
		return manager.find(Employee.class, id);
	}
	public List<Employee> getAll(){
		Query query=manager.createQuery("select e from Employee");
		return query.getResultList();
	}
}
