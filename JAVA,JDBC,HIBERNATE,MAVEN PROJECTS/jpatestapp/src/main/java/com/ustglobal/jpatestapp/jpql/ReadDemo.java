package com.ustglobal.jpatestapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
import com.ustglobal.jpatestapp.dto.Movie;



public class ReadDemo {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		Movie movie=new Movie();
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			
			transaction.begin();
			String jpql="delete from Movie where id=101";
			Query query=entityManager.createQuery(jpql);
			int rs=query.executeUpdate();
			System.out.println("delete"+rs);
			transaction.commit();
			
			/*transaction.begin();										
			String jpql="update Movie set name='hero' where id=101";
			Query query=entityManager.createQuery(jpql);
			int rs=query.executeUpdate();
			System.out.println("updated "+rs);
			transaction.commit();*/
			
			
			/*String jpql="select name from Movie";
			Query query=entityManager.createQuery(jpql);
			List<String> resultSet=query.getResultList();
			for(String str:resultSet) {

				System.out.println(str);

			}*/
			
			/*String jpql="from Movie";
			Query query=entityManager.createQuery(jpql);
			List<Movie> resultSet=query.getResultList();
			for(Movie movie:resultSet) {
				System.out.println(movie.getId());
				System.out.println(movie.getName());
				System.out.println(movie.getRating());
			}*/
			
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
	}

}
