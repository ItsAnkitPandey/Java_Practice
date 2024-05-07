package com.abc.oservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.oservice.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {

}