package com.abc.abcmart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.abcmart.entity.Order;
import com.abc.abcmart.payload.OrderItemPayload;
import com.abc.abcmart.payload.OrderPayload;
import com.abc.abcmart.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/save")
	public ResponseEntity<Order> placeOrder(@RequestBody OrderPayload orderPayload){
		int customerId = orderPayload.getCustomerId();
		List<OrderItemPayload> productOrders = orderPayload.getOrderItems();
		
		Order order = orderService.createOrder(customerId, productOrders);
		Order newOrder = orderService.saveOrder(order);
		return new ResponseEntity<>(newOrder, HttpStatus.CREATED);
		
	}

}
