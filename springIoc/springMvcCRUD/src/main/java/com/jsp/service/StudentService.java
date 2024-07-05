package com.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

@Controller
public class StudentService {

	@Autowired
	StudentDao dao;
	public Student saveStudentser(Student student)
	{
		return dao.saveStudent(student);
	}
}
