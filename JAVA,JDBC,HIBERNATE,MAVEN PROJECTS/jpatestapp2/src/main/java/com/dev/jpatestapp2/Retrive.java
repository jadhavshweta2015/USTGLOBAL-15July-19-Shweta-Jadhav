package com.dev.jpatestapp2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dev.newjpatestapp.Student;

public class Retrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			Student student=entityManager.find(Student.class, 1);
			System.out.println("id:"+student.getRollNo());
			System.out.println("name:"+student.getName());
			System.out.println("age:"+student.getAge());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
