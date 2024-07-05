package com.jsp.Employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.Employee.dao.EmployeeDao;
import com.jsp.Employee.dto.Employee;

@Component
public class EmployeeService {

	@Autowired
	EmployeeDao dao;
	
	public Employee saveEmpService(Employee employee)
	{
		return dao.saveEmployee(employee);
	}
	public Employee updateEmpService(Employee employee)
	{
		return dao.UpdateEmployee(employee);
	}
	public Employee deleteEmpService(int id)
	{
		return dao.deleteEmployee(id);
	}
	public List<Employee> getAllEmpService()
	{
		return dao.getAll();
	}
	public Employee getByIdEmp(int id)
	{
		return dao.getById(id);
	}
}
