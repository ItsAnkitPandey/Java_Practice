package com.abc.ecommongoapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.ecommongoapp.entity.Employee;
import com.abc.ecommongoapp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		employeeRepository.save(employee);
		return employee;
	}

	@Override
	public Employee getEmployeeById(int empId) {
		Optional<Employee> optionalEmployee = employeeRepository.findById(empId);
		if(optionalEmployee.isEmpty()) {
			System.out.println("No Match Found");
		}
		
		Employee employee = optionalEmployee.get();
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Optional<Employee> optionalEmployee = employeeRepository.findById(employee.getEmpId());
		if(optionalEmployee.isEmpty()) {
			System.out.println("No Match Found");
		}
		
		employeeRepository.save(employee);
		return employee;
	}

	@Override
	public void deleteEmployee(int empId) {
		Optional<Employee> optionalEmployee = employeeRepository.findById(empId);
		if(optionalEmployee.isEmpty()) {
			System.out.println("No Match Found");
		}
		
		Employee employee = optionalEmployee.get();
		employeeRepository.delete(employee);
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employee = employeeRepository.findAll();
		return employee;
	}

}
