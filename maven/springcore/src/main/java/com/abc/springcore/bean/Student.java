package com.abc.springcore.bean;

public class Student {
	private int studentId;
	private String studentName;
	private int age;
	
	private Student(int studentId, String studentName, int age) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
