package com.abc.milestone4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.milestone4.entity.Employee;
import com.abc.milestone4.exception.EmployeeNotFoundException;
import com.abc.milestone4.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(int empId) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(empId);
        if (optionalEmployee.isEmpty()) {
			throw new EmployeeNotFoundException("Employee Not found with id "+empId);

		}
		Employee employee = optionalEmployee.get();
		return employee;
        
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
    	Optional<Employee> optionalEmployee = employeeRepository.findById(employee.getEmpid());
		if (optionalEmployee.isEmpty()) {
			throw new EmployeeNotFoundException("Employee Not found with id "+employee.getEmpid());
		}
		employeeRepository.save(employee);
		return employee;
       
    }

    @Override
    public void deleteEmployee(int empId) {
    	Optional<Employee> optionalEmployee = employeeRepository.findById(empId);
		if (optionalEmployee.isEmpty()) {
			throw new EmployeeNotFoundException("Employee Not found with id "+empId);

		}
		Employee employee =optionalEmployee.get();
		employeeRepository.delete(employee);
   
    }
}
