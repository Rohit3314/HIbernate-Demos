package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Ondedemo {

	public static void main(String[] args) 
	{
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");   
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Student s1 = new Student();
		Subject s2 = new Subject();
		
		s1.setSid(101); s1.setSname("Amar"); s1.setSage(25);
		s1.setSub(s2);
		session.save(s1);
		s2.setSubname("Physics"); s2.setMarks(80);
		s2.setSid(s1.getSid());
		session.save(s2);
		tx.commit();

	}

}
