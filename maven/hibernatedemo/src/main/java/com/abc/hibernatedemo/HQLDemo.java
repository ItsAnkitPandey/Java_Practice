package com.abc.hibernatedemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.abc.hibernatedemo.entity.Products;
import com.abc.hibernatedemo.util.HibernateUtil;

import jakarta.persistence.Query;

public class HQLDemo {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		//fetch all products from database
		
		Query q1 = session.createQuery("from Products p");
		List<Products> productList = q1.getResultList();
		productList.forEach(p-> System.out.println(p.getId()+ " "+p.getProductName()+" "+p.getPrice()+" "+p.getCategory()));
		
		Query q2 = session.createQuery("select p.productName, p.price from Products p");
		List<Object[]> products = q2.getResultList();
		products.forEach(p-> System.out.println(p[0]+ " " +p[1]));
		
		Query q3 = session.createQuery("from Products p where p.category = 'mobile'", Products.class);
		List<Products> productsByCategory = q3.getResultList();
		productsByCategory.forEach(p-> System.out.println(p.getId()+" "+p.getProductName()+" "+p.getPrice()+" "+ p.getCategory()));
		
		//positional Paramters
//		Query<Product> q4 = session.createQuery("From Product p where p.productPrice > ?1 and p.productPrice < ?2 ",Product.class);
//		q4.setParameter(1, 30000);
//		q4.setParameter(2, 100000);
		
		Query q4 = session.createQuery("from Products p where p.price > :lowerp and p.price < :upperp", Products.class);
		q4.setParameter("lowerp", 30000);
		q4.setParameter("upperp", 100000);
		
		List<Products> productsWithinPriceRange = q4.getResultList();
		productsWithinPriceRange.forEach(p-> System.out.println(p.getProductName()+" "+p.getPrice()+" "+p.getCategory()));
		
		session.close();
		sessionFactory.close();
		

	}

}
