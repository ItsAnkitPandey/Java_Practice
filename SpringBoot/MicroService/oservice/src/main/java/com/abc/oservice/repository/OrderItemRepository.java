package com.abc.oservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.oservice.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Integer>{

}