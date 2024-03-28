package abcmart.main;

import java.util.Scanner;

import abcmart.controller.OrderController;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product id: ");
		int productId = sc.nextInt();
		
		System.out.println("Enter quantity: ");
		int quantity = sc.nextInt();
		
		sc.close();
		
		OrderController ordercontroller = new OrderController();
		String msg = ordercontroller.buyProduct(productId, quantity);
		
		System.out.println(msg);

	}

}
