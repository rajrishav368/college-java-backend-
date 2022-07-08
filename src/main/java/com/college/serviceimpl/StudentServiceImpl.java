package com.college.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.college.database.DBUtil;
import com.college.model.Student;
import com.college.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	ArrayList<Student> studentlist = new ArrayList<Student>();
	
	Connection connection;
	
	public StudentServiceImpl() throws Exception{
		connection=DBUtil.getConnection();
		System.out.println("connection----"+ connection);
	}
	
	
	@Override
	public List<Student> getStudents() {
		studentlist.clear();
		 try {
			PreparedStatement stmt=connection.prepareStatement("SELECT *FROM student");
			ResultSet rs = stmt.executeQuery();
			while(rs.next())
			{
				Student stud= new Student();
				stud.setName(rs.getString(1));
				stud.setRollno(rs.getInt(2));
				stud.setBranch(rs.getString(3));
				stud.setMailid(rs.getString(4));
				stud.setGender(rs.getString(5));
				stud.setAddress(rs.getString(6));
				studentlist.add(stud);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return studentlist;
	}


	@Override
	public String addStudent(Student student){
		String name=student.getName();
		int rollno=student.getRollno();
		String branch=student.getBranch();
		String mailid=student.getMailid();
		String gender=student.getGender();
		String address=student.getAddress();
		

		String addStudentQuery="INSERT INTO student VALUES('"+name+"',"+rollno+",'"+branch+"','"+mailid+"','"+gender+"','"+address+"')";
		
		try {
			PreparedStatement stmt=connection.prepareStatement(addStudentQuery);
			stmt.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return "Student added";
	}

}
