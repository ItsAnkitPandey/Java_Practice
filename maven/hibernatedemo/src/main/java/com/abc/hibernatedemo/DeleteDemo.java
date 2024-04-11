package com.abc.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.abc.hibernatedemo.entity.Products;
import com.abc.hibernatedemo.util.HibernateUtil;


public class DeleteDemo {

	public static void main(String[] args) {
		int productId = 101;
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Products product = session.get(Products.class, productId);
		
		Transaction txn = session.beginTransaction();
		
		session.remove(product);
		txn.commit();
		
		System.out.println("product deleted");
		
		session.close();
		sessionFactory.close();
		

	}

}
