package com.SpringMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.SpringMvc.dto.Demo;
import com.SpringMvc.service.DemoService;

@RestController
public class DemoController {

	@Autowired
	DemoService service;
	
	@RequestMapping("/loademo")
	public ModelAndView loademo()
	{
		ModelAndView andView=new ModelAndView("savedemo.jsp");
		andView.addObject("loads",new Demo());
		return andView;
	}
	@RequestMapping("/savedemo")
	public ModelAndView savedemo(@ModelAttribute Demo demo)
	{
		Demo demo2=service.save(demo);
		if(demo2!=null)
		{
			ModelAndView andView=new ModelAndView("index.jsp");
			andView.addObject("result","done");
			return andView;
		}
		else {
			ModelAndView andView=new ModelAndView("/loademo");
			return andView;
		}
	}
}
