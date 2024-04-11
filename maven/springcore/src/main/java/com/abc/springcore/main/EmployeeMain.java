package com.abc.springcore.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.springcore.bean.Address;
import com.abc.springcore.bean.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
		
		Employee employee1 = (Employee) context.getBean("emp1");
		
		System.out.println("id: "+ employee1.getEmpId());
		System.out.println("name: "+ employee1.getName());
		System.out.println("skills: "+ employee1.getSkills());
		
		Address address = employee1.getAddress();
		System.out.println("Address Details: ");
		System.out.println("DoorNo: "+ address.getDoorNo());
		System.out.println("City: "+ address.getCity());
		System.out.println("State: "+ address.getState());
		
		context.close();
		

	}

}
