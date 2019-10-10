package com.ustglobal.jpatestapp.onetomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpatestapp.onttoont.VoterCard;

public class OneToManyTest {

	public static void main(String[] args) {
		Pencil p=new Pencil();
		p.setPid(1);
		p.setPname("apsara");
		
		Pencil p1=new Pencil();
		p1.setPid(2);
		p1.setPname("natraj");
		ArrayList<Pencil> ape=new ArrayList<Pencil>();
		ape.add(p);
		ape.add(p1);
		
		PencilBox pb=new PencilBox();
		pb.setBid(1);
		pb.setBname("camlin");
		pb.setPencil(ape);
		
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(pb);
			System.out.println("unidirectional");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
	}

}
