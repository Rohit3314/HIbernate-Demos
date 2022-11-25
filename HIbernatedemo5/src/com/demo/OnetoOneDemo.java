package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class OnetoOneDemo
{
	public static void main(String[] args)
	{
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");   
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Student s1 = new Student(); Student s3 = new Student();
		Subject s2 = new Subject(); Subject s4 = new Subject();
		
		Transaction tx = session.beginTransaction();
		s1.setSid(101); s1.setSname("Amar"); s1.setSage(28);      // one record
		s1.setSub(s2);                session.save(s1); 
		
		s2.setSubid(111);s2.setSubject("Physics"); s2.setMarks(88); 
		s2.setStud(s1);
		 session.save(s2);
	    tx.commit();
	    
	    Transaction tx1 = session.beginTransaction();
	    s3.setSid(102); s3.setSname("Rohan"); s3.setSage(28); 
		s3.setSub(s4);  session.save(s3);
		s4.setSubid(222); s4.setSubject("chemistry"); s4.setMarks(88); 
		s4.setStud(s3);
		 session.save(s4);
		 
         tx1.commit();
	}

}
