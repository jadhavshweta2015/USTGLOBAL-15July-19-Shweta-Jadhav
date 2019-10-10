package com.ust.MavenPractise.practise;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.practice.dto.Car;

public class Reattach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			Car car=entityManager.find(Car.class,1);
			System.out.println(entityManager.contains(car));
			entityManager.detach(car);
			System.out.println(entityManager.contains(car));
			car.setName("abc");
			entityManager.merge(car);
			System.out.println(entityManager.contains(car));
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
