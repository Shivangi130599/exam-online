package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.lti.entity.User;

public class UserAddressResultSubjectExamDao extends GenericDao{
	public List<User> fetchresults(int id , String state , String city , int score){
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("oracleTest");
			em = emf.createEntityManager();
			String jpql="Select u.first_name,u.email,u.phone_no,a.state,a.city from users u inner join u.address a inner join a.subjects s inner join s.results r where r.sub_id= :id & a.state :state & a.city :city & r.score =:score";
			Query q = em.createQuery(jpql);
			q.setParameter("id",id);
			List<User> list = q.getResultList();
			return list;
		}
		finally {
			em.close();
			emf.close();
		}	
		}
}
