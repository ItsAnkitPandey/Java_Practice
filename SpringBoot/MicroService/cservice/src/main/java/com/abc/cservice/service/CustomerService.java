package com.abc.cservice.service;

import java.util.List;

import com.abc.cservice.entity.Customer;


public interface CustomerService {
	Customer saveCustomer(Customer customer);
	Customer getCustomerById(int customerId);
	List<Customer> getAllCustomers();
	Customer updateCustomer(Customer customer);
	void deleteCustomer (int customerId);
}
