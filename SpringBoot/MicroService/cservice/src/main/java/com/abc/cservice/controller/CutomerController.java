package com.abc.cservice.controller;

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

import com.abc.cservice.entity.Customer;
import com.abc.cservice.service.CustomerService;


@RestController
@RequestMapping("/customer")
public class CutomerController {
	
	@Autowired
	private CustomerService customerService; 
	
	@GetMapping("/all")
	public List<Customer> fetchAllProduct() {
		List<Customer> customers = customerService.getAllCustomers();
		return customers;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Customer> fetchCustomerDetails(@PathVariable("id") int customerId){
		Customer customer = customerService.getCustomerById(customerId);
		return new ResponseEntity<>(customer, HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
		customerService.saveCustomer(customer);
		ResponseEntity<Customer> responseEntity = new ResponseEntity<>(customer, HttpStatus.CREATED);
		return responseEntity;
	}
	
	@PutMapping("/update")
	public ResponseEntity<Customer> editProduct(@RequestBody Customer customer) {
		customerService.updateCustomer(customer);
		ResponseEntity<Customer> responseEntity = new ResponseEntity<>(customer, HttpStatus.OK);
		return responseEntity;
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable("id") int customerId) {
		String msg = "Deleted Seccessfully";
		customerService.deleteCustomer(customerId);
		ResponseEntity<String> responseEntity = new ResponseEntity<>(msg, HttpStatus.OK);
		return responseEntity;
	}

}
