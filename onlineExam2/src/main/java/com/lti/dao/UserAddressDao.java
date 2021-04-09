package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.entity.User;

public class UserAddressDao extends GenericDao{
	public void  fetchuseraddress(int id){
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("oracleTest");
			em = emf.createEntityManager();
			String jpql="Select u.*,a.* from user u inner join u.address a ";
		 }
		finally {
			em.close();
			emf.close();
		}	
		}
	}
	


