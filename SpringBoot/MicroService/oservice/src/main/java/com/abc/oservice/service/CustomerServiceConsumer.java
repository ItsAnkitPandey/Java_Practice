
package com.abc.oservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.abc.oservice.model.Customer;

@FeignClient(name="CUSTOMER-SERVICE")
public interface CustomerServiceConsumer { 

	@GetMapping("/customer/{id}")
	Customer getCustomerDetails(@PathVariable("id") int customerId);
}
