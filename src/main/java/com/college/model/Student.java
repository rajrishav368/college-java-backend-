package com.college.model;

public class Student {

	String name;
	int rollno;
	String branch;
	String mailid;
	String gender;
	String address;
	
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", branch=" + branch + ", mailid=" + mailid
				+ ", gender=" + gender + ", address=" + address + "]";
	}


	public Student() {
		super();
	}


	public Student(String name, int rollno, String branch, String mailid, String gender, String address) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.branch = branch;
		this.mailid = mailid;
		this.gender = gender;
		this.address = address;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
