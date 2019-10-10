package com.ust.MavenPractise.practise;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.action.internal.EntityIdentityInsertAction;
import org.jboss.jandex.ClassInfo.NestingType;

import com.ust.practice.dto.Car;

public class getData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			Car car=entityManager.find(Car.class,1);
			System.out.println("id:"+car.getId());
			System.out.println("name:"+car.getName());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
