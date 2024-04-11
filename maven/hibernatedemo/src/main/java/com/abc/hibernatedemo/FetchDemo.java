package com.abc.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.abc.hibernatedemo.entity.Products;
import com.abc.hibernatedemo.util.HibernateUtil;

public class FetchDemo {

	public static void main(String[] args) {
		int productId = 101;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Products products = session.find(Products.class, productId);
		
		if(products!=null) {
			System.out.println("Name: "+products.getProductName());
			System.out.println("Price: "+products.getPrice());
			System.out.println("MFD: "+products.getMfd());
			System.out.println("Category: "+products.getCategory());
		}else {
			System.out.println("product not exist with id: "+productId);
		}
		session.close();
		sessionFactory.close();

	}

}
