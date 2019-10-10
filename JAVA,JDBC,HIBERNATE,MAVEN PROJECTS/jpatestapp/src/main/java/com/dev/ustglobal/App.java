package com.dev.ustglobal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpatestapp.dto.Movie;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
		Movie movie = new Movie();
		movie.setId(101);
		movie.setName("hero");
		movie.setRating("good");
		Movie movie1 = new Movie();
		movie1.setId(102);
		movie1.setName("hero");
		movie1.setRating("good");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(movie);
		entityManager.persist(movie1);

		System.out.println("saved...");

		transaction.commit();
		}
		catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
			entityManager.close();
		}
	}
}
