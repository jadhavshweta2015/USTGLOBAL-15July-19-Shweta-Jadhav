package com.ustglobal.jpatestapp.onttoont;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpatestapp.dto.Movie;

public class OneToOneTest {

	public static void main(String[] args) {
		Person p=new Person();
		p.setId(1);
		p.setName("shweta");
		
		VoterCard v=new VoterCard();
		v.setV_id(1);
		v.setV_name("shweta");
		p.setVc(v);
		
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			//entityManager.persist(p);
			VoterCard vc=entityManager.find(VoterCard.class, 1);
			System.out.println(vc.getPerson().getName());
			transaction.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
	}

}
