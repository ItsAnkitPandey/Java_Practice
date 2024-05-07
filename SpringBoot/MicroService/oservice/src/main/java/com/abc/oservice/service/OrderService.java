
package com.abc.oservice.service;

import java.util.List;

import com.abc.oservice.model.OrderResponse;
import com.abc.oservice.entity.Order;
import com.abc.oservice.payload.OrderItemPayload;

public interface OrderService {
	
	Order createOrder(int customerId, List<OrderItemPayload> selectedProducts);

	Order saveOrder(Order order);
	
	OrderResponse getOrderDetails(int orderId);
	
	List<OrderResponse> getAllOrders();
	
//	List<Order> getAllOrdersByCustomer(int customerId);
}
