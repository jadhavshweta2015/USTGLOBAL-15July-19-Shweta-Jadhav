package com.ust.MavenPractise.jpql;

import javax.persistence.Query;

import com.ust.practice.dto.Car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			/*String jpql="from Car";
			Query query=entityManager.createQuery(jpql);
			List<Car> rs=query.getResultList();
			for (Car car : rs) {
				System.out.println(car.getId());
				System.out.println(car.getName());
			}*/
			
			/*String jpql1="select name from Car";
			Query query1=entityManager.createQuery(jpql1);
			List<String> rs1=query1.getResultList();
			for (String str : rs1) {
				
				System.out.println(str);
			}*/
			
			/*transaction.begin();										
			String jpql="update Car set name='hero' where id=1";
			Query query=entityManager.createQuery(jpql);
			int rs=query.executeUpdate();
			System.out.println("updated "+rs);
			transaction.commit();*/
			
			transaction.begin();										
			String jpql="delete from Car where id=1";
			Query query=entityManager.createQuery(jpql);
			int rs=query.executeUpdate();
			System.out.println("updated "+rs);
			transaction.commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
