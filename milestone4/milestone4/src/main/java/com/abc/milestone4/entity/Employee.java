package com.abc.milestone4.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_tbl")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;

	private String name;

	private String basicSalary;

	private char grade;

	// Constructor
	public Employee() {
	}

	// Getters and setters
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(String basicSalary) {
		this.basicSalary = basicSalary;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	// toString(), hashCode(), and equals() methods
	@Override
	public String toString() {
		return "Employee{" + "empid=" + empid + ", name='" + name + '\'' + ", basicSalary='" + basicSalary + '\''
				+ ", grade=" + grade + '}';
	}

	@Override
	public int hashCode() {
		return Objects.hash(empid, name, basicSalary, grade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Employee employee = (Employee) obj;
		return Objects.equals(basicSalary, employee.basicSalary) && empid == employee.empid && grade == employee.grade
				&& Objects.equals(name, employee.name);
	}
}
