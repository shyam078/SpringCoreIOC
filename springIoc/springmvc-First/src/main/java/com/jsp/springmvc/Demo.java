package com.jsp.springmvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Demo {
	@RequestMapping("/test1")
	public ModelAndView test1()
	{
		ModelAndView andView=new ModelAndView("FirstClass.jsp");
		andView.addObject("asd","hello");
		return andView;
	}
	@RequestMapping("/test2")
	public ModelAndView test2()
	{
		Studentst student=new Studentst();
		student.setId(1);
		student.setAge(22);
		student.setName("shyam");
		
		ModelAndView andView=new ModelAndView("printObject.jsp");
		andView.addObject("stu",student);
		return andView;
		
	}
	@RequestMapping("/load")
	public ModelAndView load()
	{
		ModelAndView andView=new ModelAndView("form.jsp");
		andView.addObject("new",new Studentst());
		return andView;
	}
	
	@RequestMapping("/savedata")
	public ModelAndView test3(@ModelAttribute Studentst student)
	{
		ModelAndView andView=new ModelAndView("printObject2.jsp");
		andView.addObject("stu2",student);
		return andView;
	}
	
	@RequestMapping("/getall")
	public ModelAndView getAll()
	{
		List<Studentst> s=new ArrayList<Studentst>();
		Studentst student=new Studentst();
		student.setId(2);
		student.setName("prasad");
		student.setAge(22);
		
		Studentst student1=new Studentst();
		student1.setId(3);
		student1.setName("prasad");
		student1.setAge(22);
		
		Studentst student2=new Studentst();
		student2.setId(4);
		student2.setName("prasad");
		student2.setAge(22);
		
		s.add(student);
		s.add(student1);
		s.add(student2);
		
		ModelAndView andView=new ModelAndView("display.jsp");
		andView.addObject("list",s);
		return andView;
	}
}
