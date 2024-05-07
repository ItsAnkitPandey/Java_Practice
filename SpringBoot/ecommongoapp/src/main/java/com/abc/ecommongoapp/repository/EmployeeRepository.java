package com.abc.ecommongoapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.abc.ecommongoapp.entity.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer>{

}
