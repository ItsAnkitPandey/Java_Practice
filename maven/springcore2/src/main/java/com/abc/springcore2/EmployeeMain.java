package com.abc.springcore2;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.abc.springcore2.bean.Address;
import com.abc.springcore2.bean.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");

		Employee employee1 = (Employee) context.getBean("emp1");

		System.out.println("Id: " + employee1.getEmpId());
		System.out.println("Name: " + employee1.getName());
		System.out.println("Skills: " + employee1.getSkills());

		Address address = employee1.getAddress();

		System.out.println("Address: ");
		System.out.println("DoorNo: " + address.getDoorNo());
		System.out.println("City: " + address.getCity());
		System.out.println("State: " + address.getState());
		context.close();

	}

}