package com.abc.springcore2.bean;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Employee {
	private int empId;
	private String name;
	private Set<String> skills;
	private Address address;
	public Employee() {
	}
	@Autowired
	public Employee(int empId, String name, Set<String> skills, Address address) {
		super();
		this.empId = empId;
		this.name = name;
		this.skills = skills;
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getSkills() {
		return skills;
	}
	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}
	public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
}