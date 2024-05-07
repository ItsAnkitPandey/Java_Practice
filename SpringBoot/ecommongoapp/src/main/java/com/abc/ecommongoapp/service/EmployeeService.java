package com.abc.ecommongoapp.service;

import java.util.List;

import com.abc.ecommongoapp.entity.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	Employee getEmployeeById(int empId);
	Employee updateEmployee(Employee employee);
	void deleteEmployee (int empId);
	List<Employee> getAllEmployees();

}
