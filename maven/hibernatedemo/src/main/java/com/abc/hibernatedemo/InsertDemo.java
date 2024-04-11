package com.abc.hibernatedemo;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.abc.hibernatedemo.entity.Products;
import com.abc.hibernatedemo.util.HibernateUtil;



public class InsertDemo {
	public static void main(String []args) {
		Products product1 = new Products();
		product1.setId(105);
		product1.setProductName("Samsung GalaxyM50");
		product1.setPrice(38000);
		product1.setMfd(LocalDate.of(2024, 04, 8));
		product1.setCategory("Mobile");
		
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction txn = session.beginTransaction();
		session.persist(product1);
		txn.commit();
		System.out.println("product saved");
		
		session.close();
		sessionFactory.close();
	}
}
