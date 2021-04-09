package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.entity.User;

public class UserAnswerQuestionBankDao {
	public void fetchanswers() {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("oracleTest");
			em = emf.createEntityManager();
			String jpql="Select u from useranswer u inner join q.questionbank";
			Query q = em.createQuery(jpql);
		}
			finally {
			em.close();
			emf.close();
		}	
		
	}

}
