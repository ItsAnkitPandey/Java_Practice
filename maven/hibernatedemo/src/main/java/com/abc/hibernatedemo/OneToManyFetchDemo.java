package com.abc.hibernatedemo;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.abc.hibernatedemo.entity.Department;
import com.abc.hibernatedemo.entity.Employee;
import com.abc.hibernatedemo.util.HibernateUtil;

public class OneToManyFetchDemo {

	public static void main(String[] args) {
		int dept_id = 1003;
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Department dept = session.get(Department.class, dept_id);
		
		if(dept!=null) {
			System.out.println("Dept Details: ");
			int deptId = dept.getDeptId();
			String deptName = dept.getDeptName();
			Set<Employee> deptEmps = dept.getEmployees();
			
			System.out.println("Dept id: "+deptId);
			System.out.println("Dept name: "+deptName);
			
			deptEmps.forEach(emp-> {System.out.println(emp.getEmpId()+ " "+ emp.getEmpName()+ " "+emp.getEmail()+" "+emp.getMob());});
			
		}else {
			System.out.println("no match found!");
		}
		session.close();
		sessionFactory.close();
	}

}
