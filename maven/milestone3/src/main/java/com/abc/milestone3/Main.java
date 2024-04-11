package com.abc.milestone3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.milestone3.bean.Employee;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");

		Employee employee = (Employee) context.getBean("emp1");

		Map<String, Integer> skillRatings = employee.getSkillRatings();

		List<String> highRatedSkills = new ArrayList<>();

		for (Map.Entry<String, Integer> entry : skillRatings.entrySet()) {
			if (entry.getValue() >= 8) {
				highRatedSkills.add(entry.getKey());
			}
		}
		System.out.println("Employee Name: " + employee.getFirstName());
		System.out.println("Skills with rating greater than 8:");
		System.out.println(highRatedSkills);

		context.close();
	}
}
