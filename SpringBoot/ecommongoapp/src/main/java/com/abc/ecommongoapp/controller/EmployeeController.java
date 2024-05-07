package com.abc.ecommongoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.ecommongoapp.entity.Employee;
import com.abc.ecommongoapp.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/{id}")
	public ResponseEntity<Employee> fetchEmploeeById(@PathVariable("id") int empId) {
		Employee employee = employeeService.getEmployeeById(empId);
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}

	@GetMapping("/all")
	public List<Employee> fetchAllEmployees() {
		List<Employee> employee = employeeService.getAllEmployees();
		return employee;
	}

	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		ResponseEntity<Employee> responseEntity = new ResponseEntity<>(employee, HttpStatus.CREATED);
		return responseEntity;

	}

	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);

		ResponseEntity<Employee> responseEntity = new ResponseEntity<>(employee, HttpStatus.OK);
		return responseEntity;

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable("id") int empId) {
		employeeService.deleteEmployee(empId);

		ResponseEntity<Void> responseEntity = new ResponseEntity<>(HttpStatus.OK);
		return responseEntity;

	}

}
