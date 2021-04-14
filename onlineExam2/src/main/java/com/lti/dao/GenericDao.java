package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GenericDao {
public Object save(Object e) {
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {	
			
			emf = Persistence.createEntityManagerFactory("oracleTest");
			em = emf.createEntityManager();
			
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			
			Object obj = em.merge(e);

			tx.commit();
			
			return obj;
		
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
		finally {
			em.close();
			emf.close();
		}
		
	}
	
	public <E> E fetch(Class<E> clazz, Object pk) {
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
	
		try {	
			emf = Persistence.createEntityManagerFactory("oracleTest");
			em = emf.createEntityManager();
		
			E e = em.find(clazz, pk);
			return e;
		}
	
		catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	
		finally {
			em.close();
			emf.close();
		}
	
	}

}
