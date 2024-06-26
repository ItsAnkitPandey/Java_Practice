package com.abc.abcmart.service;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.abcmart.entity.Customer;
import com.abc.abcmart.entity.Order;
import com.abc.abcmart.entity.OrderItem;
import com.abc.abcmart.entity.Product;
import com.abc.abcmart.payload.OrderItemPayload;
import com.abc.abcmart.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService  {
	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private ProductService productService;
	
	@Autowired
	private CustomerService customerService;
	
	@Override
	public Order saveOrder(Order order) {
		orderRepository.save(order);
		return order;
	}

	@Override
	public Order getOrderDetails(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getAllOrderByCustomer(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order createOrder(int customerId, List<OrderItemPayload> selectedProducts) {
		Customer customer = customerService.getCustomerById(customerId);
		
		Order order = new Order();
		order.setOrderDate(LocalDate.now());
		order.setOrderStatus("pending");
		order.setCustomer(customer);
		
		List<OrderItem> orderItems = new ArrayList<>();
		
		double orderTotal = 0;
		
		for(OrderItemPayload po: selectedProducts) {
			int productId = po.getProductId();
			int qty = po.getQuantity();
			Product product = productService.getProductById(productId);
			System.out.println("ItemTotal: " + product.getProductPrice()*qty);
			
			OrderItem orderItem = new OrderItem();
			orderItem.setProduct(product);
			orderItem.setItemTotal(product.getProductPrice()*qty);
			orderItem.setQuantity(qty);
			orderItems.add(orderItem);
			
			orderTotal = orderTotal+(product.getProductPrice()*qty);
			orderItem.setOrder(order);
			
		}
		order.setOrderTotal(orderTotal);
		order.setOrderItems(orderItems);
		
		return order;
	}

}
