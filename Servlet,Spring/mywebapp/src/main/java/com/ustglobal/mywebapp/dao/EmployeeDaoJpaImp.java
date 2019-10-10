package com.ustglobal.mywebapp.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.mywebapp.dto.EmpInfoBean;

public class EmployeeDaoJpaImp implements EmployeDao {
Scanner s=new Scanner(System.in);
	@Override
	public EmpInfoBean searchEmp(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Persistence");
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		EmpInfoBean empInfoBean = null;
		try {
			empInfoBean=em.find(EmpInfoBean.class,id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return empInfoBean;
	}

	@Override
	public boolean addEmp(EmpInfoBean e) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Persistence");
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		EmpInfoBean empInfoBean = null;
		try {
			transaction.begin();
			/*e.setEmp_id(e.getEmp_id());
			e.setEmp_name(e.getEmp_name());
			e.setEmp_age(e.getEmp_age());
			e.setEmp_sal(e.getEmp_sal());
			e.setDesignation(e.getDesignation());
			e.setPassword(e.getPassword());*/
			em.persist(e);
			transaction.commit();
		}catch(Exception ee) {
			ee.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean deleteEmp(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Persistence");
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		EmpInfoBean empInfoBean = null;
		try {
			transaction.begin();
			empInfoBean=em.find(EmpInfoBean.class,id);
			em.remove(empInfoBean);
			transaction.commit();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return true;
		
	}

	@Override
	public EmpInfoBean login(int empId, String password) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Persistence");
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		EmpInfoBean empInfoBean = null;
		String jpql="from EmpInfoBean where emp_id=:id and password=:pass";
		Query query=em.createQuery(jpql);
		query.setParameter("id", empId);
		query.setParameter("pass", password);
		try {
			empInfoBean=(EmpInfoBean) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return empInfoBean;
	}

	@Override
	public boolean updateEmp(int id,String name,int age,double salary,String designation,String password) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Persistence");
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		EmpInfoBean empInfoBean = null;
		try {
			
			empInfoBean=em.find(EmpInfoBean.class,id);
			empInfoBean.setEmp_id(id);
			empInfoBean.setEmp_name(name);
			empInfoBean.setEmp_age(age);
			empInfoBean.setEmp_sal(salary);
			empInfoBean.setDesignation(designation);
			empInfoBean.setPassword(password);
			if(em!=null) {
				transaction.begin();
				em.persist(empInfoBean);
				transaction.commit();
				return true;
			}
				
		} catch (Exception ee) {
			ee.printStackTrace();
		}
		
		return false;
	}

}
