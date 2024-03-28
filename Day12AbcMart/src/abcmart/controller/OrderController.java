package abcmart.controller;

import abcmart.service.OrderService;

public class OrderController {

	public String buyProduct (int productId, int quantity) {
	OrderService orderService = new OrderService();
	double orderAmount = orderService.placeOrder(productId, quantity);
	
	return "Order placed successfully. Order Amount = " + orderAmount;
	}

}
