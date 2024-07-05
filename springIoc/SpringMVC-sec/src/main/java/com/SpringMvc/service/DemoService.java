package com.SpringMvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SpringMvc.dao.DemoDao;
import com.SpringMvc.dto.Demo;

@Component
public class DemoService {

	@Autowired
	DemoDao dao;
	
	public Demo save(Demo demo)
	{
		return dao.save(demo);
	}
}
