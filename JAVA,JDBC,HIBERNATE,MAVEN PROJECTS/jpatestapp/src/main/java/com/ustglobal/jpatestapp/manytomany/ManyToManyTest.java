package com.ustglobal.jpatestapp.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpatestapp.onttoont.VoterCard;

public class ManyToManyTest {

	public static void main(String[] args) {
		Course course=new Course();
		course.setCid(4);
		course.setCname("Computer");
		
		Course course1=new Course();
		course1.setCid(5);
		course1.setCname("java");
		ArrayList<Course> arr=new ArrayList<Course>();
		arr.add(course);
		arr.add(course1);
		
		Student s1=new Student();
		s1.setSid(10);
		s1.setSname("shweta");
		s1.setCourse(arr);
		
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			//entityManager.persist(s1);
			Course c=entityManager.find(Course.class, 4);
			System.out.println(c.getStudent().get(0).getSid());
			System.out.println("saved");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
	}

}
