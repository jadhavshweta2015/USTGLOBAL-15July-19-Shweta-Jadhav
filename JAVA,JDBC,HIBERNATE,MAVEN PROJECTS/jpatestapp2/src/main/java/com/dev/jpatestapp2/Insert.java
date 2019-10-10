package com.dev.jpatestapp2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dev.newjpatestapp.Student;


/**
 * Hello world!
 *
 */
public class Insert 
{
    public static void main( String[] args )
    {
    	EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
//		Student student = new Student();
//		student.setRollNo(1);
//		student.setName("shweta");
//		student.setAge(22);
		
		Student student1 = new Student();
		student1.setRollNo(3);
		student1.setName("simran");
		student1.setAge(22);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(student1);

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
