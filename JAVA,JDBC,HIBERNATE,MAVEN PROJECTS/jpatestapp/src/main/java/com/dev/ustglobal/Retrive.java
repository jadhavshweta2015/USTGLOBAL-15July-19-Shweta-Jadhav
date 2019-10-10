package com.dev.ustglobal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpatestapp.dto.Movie;

public class Retrive {
	static EntityManagerFactory entityManagerFactory = null;
	static EntityManager entityManager = null;
	static EntityTransaction transaction = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie = new Movie();

		entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		movie = entityManager.find(Movie.class, 101);
		System.out.println(movie.getClass());
		
		/*System.out.println("Id:" + movie.getId());
		System.out.println("name:" + movie.getName());
		System.out.println("rating:" + movie.getRating());*/
		entityManager.close();
	}

}
