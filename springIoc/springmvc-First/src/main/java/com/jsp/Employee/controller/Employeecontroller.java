package com.jsp.Employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.Employee.dto.Employee;
import com.jsp.Employee.service.EmployeeService;

@Controller
public class Employeecontroller {

	@Autowired
	EmployeeService service;
	
	@RequestMapping("/loademployee")
	public ModelAndView loade()
	{
		ModelAndView andView=new ModelAndView("saveemployee.jsp");
		andView.addObject("loads",new Employee());
		return andView;
	}
	@RequestMapping("/saveemployee")
	public ModelAndView saveemployee(@ModelAttribute Employee employee)
	{
		Employee employee2=service.saveEmpService(employee);
		if(employee2!=null)
		{
			ModelAndView andView=new ModelAndView("index.jsp");
			andView.addObject("done","data saved");
			return andView;
		}
		else {
			ModelAndView andView=new ModelAndView("/loademployee");
			return andView;
		}
	}
	@RequestMapping("/displayall")
	public ModelAndView displayEmployee()
	{
		ModelAndView andView=new  ModelAndView("displayemployye.jsp");
		andView.addObject("liste",service.getAllEmpService());
		return andView;
	}
	
	@RequestMapping("/editbyid")
		public ModelAndView editEmployee(@RequestParam int id)
		{
			ModelAndView andView=new ModelAndView("updateemployee.jsp");
			andView.addObject("emp",service.getByIdEmp(id));
			return andView;
		}
	@RequestMapping("/updateemp")
	public ModelAndView updateEmployee(@ModelAttribute Employee employee)
	{
		Employee employee2=service.updateEmpService(employee);
		ModelAndView andView=new ModelAndView("/displayall");
		return andView;
	}
	@RequestMapping("/deletebyid")
	public ModelAndView deletebyid(@RequestParam int id)
	{
		service.deleteEmpService(id);
		ModelAndView andView=new ModelAndView("/displayall");
		return andView;
	}
}
