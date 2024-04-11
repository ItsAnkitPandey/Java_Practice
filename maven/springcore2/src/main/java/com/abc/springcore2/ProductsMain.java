package com.abc.springcore2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.springcore2.bean.Product;

public class ProductsMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
	
		Product product1 = (Product) context.getBean("p1");
		System.out.println("product id: "+product1.getpId());
		System.out.println("product name: "+product1.getPrice());
		System.out.println("product id: "+product1.getPname());
		
		context.close();		
	}

}
