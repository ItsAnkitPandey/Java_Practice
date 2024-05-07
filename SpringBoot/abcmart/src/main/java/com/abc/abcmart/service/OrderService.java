package com.abc.abcmart.service;

import java.util.List;

import com.abc.abcmart.entity.Order;
import com.abc.abcmart.payload.OrderItemPayload;

public interface OrderService {
	Order saveOrder(Order order);
	Order getOrderDetails(int orderId);
	Order createOrder(int customerId, List<OrderItemPayload> selectedProducts);
	List<Order> getAllOrderByCustomer(int customerId);
}
