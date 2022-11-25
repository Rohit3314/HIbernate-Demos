package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {

	public static void main(String[] args) 
	{
	
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");   
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setEid(111);
		e1.setEname("Ajay");
		e1.setEsalary(20000.00);
		
		session.save(e1);
		tx.commit();
		

	}

}
