package com.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchColumn {

	public static void main(String[] args) 
	{

		EntityManagerFactory emf=  Persistence.createEntityManagerFactory("Student");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Query q = em.createNamedQuery("find sname");
		@SuppressWarnings("unchecked")
		List<String> l1 = q.getResultList();
		System.out.println("Student List");
		for(String s:l1)
		{
			System.out.println(s);
		}
		em.close();
        emf.close();
	}

	}


