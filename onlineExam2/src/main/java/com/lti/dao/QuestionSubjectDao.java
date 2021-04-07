package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.entity.QuestionBank;

public class QuestionSubjectDao extends GenericDao{

	public List<QuestionBank> fetchQuestions(int id){
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("oracleTest");
			em = emf.createEntityManager();
			String jpql = "select s.subject_name,q.question, q.option_1,q.option_2,q.option_3,q.option_4 from QuestionBank q inner join q.QuestionBank s where s.subjct_id <= :id";
			Query q = em.createQuery(jpql);
			q.setParameter("id",id);
			List<QuestionBank> list = q.getResultList();
			return list;
		}
		finally {
			em.close();
			emf.close();
		}	
}
}