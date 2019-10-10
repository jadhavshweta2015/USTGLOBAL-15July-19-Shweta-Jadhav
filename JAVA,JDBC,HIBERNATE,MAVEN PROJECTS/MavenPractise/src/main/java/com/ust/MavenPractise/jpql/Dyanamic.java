package com.ust.MavenPractise.jpql;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ust.practice.dto.Car;

public class Dyanamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		Scanner s=new Scanner(System.in);
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			String jpql="from Car where id=:id";
			Query query=entityManager.createQuery(jpql);
			System.out.println("id:");
			int id=s.nextInt();
			query.setParameter("id", id);
			List<Car> rs=query.getResultList();
			for (Car car : rs) {
				System.out.println(car.getId());
				System.out.println(car.getName());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
