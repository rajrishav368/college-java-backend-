package com.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.model.Student;
import com.college.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentservice;
	
	
	@GetMapping("/hello")
	public String hello()
	{
		return "Welcome to the future";
				
	}
	
	@GetMapping("/student")
	public List<Student> getStudentData()
	{
		return studentservice.getStudents();
	}
	@PostMapping("/addstudent")
	public String addStudent(@RequestBody Student student) {
		return studentservice.addStudent(student);
	}
	
}
