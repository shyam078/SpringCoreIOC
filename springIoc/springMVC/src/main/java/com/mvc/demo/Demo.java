package com.mvc.demo;

import org.springframework.stereotype.Controller;
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
}
