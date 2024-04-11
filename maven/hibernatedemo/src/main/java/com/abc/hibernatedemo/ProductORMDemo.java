package com.abc.hibernatedemo;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.abc.hibernatedemo.entity.Products;

public class ProductORMDemo {
	public static void main(String[] args) {
		Products product1 = new Products();
		product1.setId(102);
		product1.setProductName("Samsung Galaxy Ultra");
		product1.setPrice(78000);
		product1.setMfd(LocalDate.of(2024, 04, 8));
		product1.setCategory("Mobile");
		
		//how to persist ( save to database)
		
		 // Create registry
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		// Create MetadataSources
       MetadataSources sources = new MetadataSources(registry);
       
       // Create Metadata
       Metadata metadata = sources.getMetadataBuilder().build();
       
       // Create SessionFactory
       SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
       
       Session session = sessionFactory.openSession();
       
       Transaction txn = session.beginTransaction();
       
       session.save(product1);
       
       txn.commit();
       
       System.out.println("new product saved");
       
       sessionFactory.close();           
		
	}
	
}
