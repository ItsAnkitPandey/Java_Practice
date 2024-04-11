package com.abc.milestone3.bean;

import java.util.Map;

public class Employee {
	private int empId;
	private String firstName;
	private Map<String, Integer> skillRatings;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Map<String, Integer> getSkillRatings() {
		return skillRatings;
	}
	public void setSkillRatings(Map<String, Integer> skillRatings) {
		this.skillRatings = skillRatings;
	}
}
