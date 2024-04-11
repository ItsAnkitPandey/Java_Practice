package com.abc.springcore.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.springcore.bean.Student;

public class StudentMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
		
		Student student1 = (Student) context.getBean("stu1");
		
		
		System.out.println("id: "+ student1.getStudentId());;
		System.out.println("name: "+ student1.getStudentName());;
		System.out.println("age: "+ student1.getAge());;
		context.close();
	}
}
