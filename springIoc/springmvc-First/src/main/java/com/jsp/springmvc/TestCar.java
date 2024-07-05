package com.jsp.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestCar {

	@RequestMapping("/run")
	public String display()
	{
		return "car.jsp";
	}
}
