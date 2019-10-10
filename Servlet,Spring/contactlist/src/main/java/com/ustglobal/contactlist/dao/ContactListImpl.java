package com.ustglobal.contactlist.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.contactlist.dto.ContactList;

public class ContactListImpl implements ContactListInterface {

	ContactList cont=new ContactList();
	@Override
	public ContactList login(String name, String password) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Persistence");
		EntityManager em=entityManagerFactory.createEntityManager();
		EntityTransaction ts=em.getTransaction();
		ContactList contact=null;
		String jpql="from ContactList where name=:name and password=:password";
		Query query=em.createQuery(jpql);
		query.setParameter("name", name);
		query.setParameter("password", password);
		try {
			contact=(ContactList)query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return contact;
	}
	@Override
	public boolean add(ContactList contact) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Persistence");
		EntityManager em=entityManagerFactory.createEntityManager();
		EntityTransaction ts=em.getTransaction();
		
		try {
			ts.begin();
			em.persist(contact);
			ts.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return true;
	}
	@Override
	public ContactList call(String name, String number) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Persistence");
		EntityManager em=entityManagerFactory.createEntityManager();
		EntityTransaction ts=em.getTransaction();
		ContactList contact=null;
		String jpql="from ContactList where name=:name and no=:no";
		Query query=em.createQuery(jpql);
		query.setParameter("name", name);
		query.setParameter("no", number);
		try {
			contact=(ContactList)query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return contact;
	}

}
