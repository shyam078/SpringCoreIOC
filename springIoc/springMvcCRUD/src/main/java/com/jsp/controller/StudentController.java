package com.jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService service;
	
	@RequestMapping("/loadstudent")
	public ModelAndView load1()
	{
		ModelAndView andView=new ModelAndView("studentsave.jsp");
		andView.addObject("load",new Student());
		return andView;
	}
	@RequestMapping("/studentsave")
	public ModelAndView saveStudent(@ModelAttribute Student student)
	{
		Student student2=service.saveStudentser(student);
		if(student2!=null) {
		ModelAndView andView=new ModelAndView("index.jsp");
		andView.addObject("msg","data saves");
		return andView;
		}
		else {
			ModelAndView andView=new ModelAndView("/loadstudent");
			return andView;
		}
	}
}
