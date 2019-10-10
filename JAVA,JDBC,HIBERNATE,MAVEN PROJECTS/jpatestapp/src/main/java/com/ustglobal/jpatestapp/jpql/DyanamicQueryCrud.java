package com.ustglobal.jpatestapp.jpql;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

public class DyanamicQueryCrud {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		Scanner s=new Scanner(System.in);
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			/*String jpql="update Movie set name=:nm where id=:id";
			Query query=entityManager.createQuery(jpql);
			System.out.println("name:");
			String name=s.nextLine();
			System.out.println("id:");
			int id=s.nextInt();
			query.setParameter("nm", name);
			query.setParameter("id", id);
			int rs=query.executeUpdate();
			System.out.println("updated"+rs);
			transaction.commit();*/
			
			String jpql="delete from Movie where id=:id";
			Query query=entityManager.createQuery(jpql);
			
			System.out.println("id:");
			int id=s.nextInt();
			query.setParameter("id", id);
			int rs=query.executeUpdate();
			System.out.println("delete"+rs);
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
