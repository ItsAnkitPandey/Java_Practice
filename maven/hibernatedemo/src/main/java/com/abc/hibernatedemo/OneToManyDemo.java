package com.abc.hibernatedemo;

import java.util.LinkedHashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.abc.hibernatedemo.entity.Department;
import com.abc.hibernatedemo.entity.Employee;
import com.abc.hibernatedemo.util.HibernateUtil;

public class OneToManyDemo {

	public static void main(String[] args) {

			Employee emp3 = new Employee();
			emp3.setEmpId(103);
			emp3.setEmpName("Adarsh");
			emp3.setEmail("adarsh@rtmail.com");
			emp3.setMob("6391735294");
			
			
			Employee emp4 = new Employee();
			emp4.setEmpId(104);
			emp4.setEmpName("Alok");
			emp4.setEmail("alok@tmail.com");
			emp4.setMob("7054015294");
			
			Set<Employee> emps = new LinkedHashSet<>();
			emps.add(emp3);
			emps.add(emp4);
			
			Department dept2 = new Department();
			dept2.setDeptId(1003);
			dept2.setDeptName("IT");
			dept2.setEmployees(emps);
			
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			
			Transaction txn = session.beginTransaction();
			
			session.save(dept2);
			session.save(emp3);
			session.save(emp4);
			
			txn.commit();
			System.out.println("departmetn is added with employees");
			session.close();
			sessionFactory.close();
			
	}
}
