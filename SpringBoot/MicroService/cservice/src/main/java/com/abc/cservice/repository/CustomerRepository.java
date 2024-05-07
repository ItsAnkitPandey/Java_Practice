package com.abc.cservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.cservice.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{
Customer findByCustomerName(String CustomerName);
	
	

}
