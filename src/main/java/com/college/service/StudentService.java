package com.college.service;

import java.util.List;

import com.college.model.Student;

public interface StudentService {

	
	public List<Student> getStudents();
	public String addStudent(Student student);
}
