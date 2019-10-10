package com.ustglobal.ustspringmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ustglobal.ustspringmvc.dto.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@PersistenceUnit
	EntityManagerFactory emf;
	
	@Override
	public Employee auth(String email, String password) {
		String jpql="from Employee where email=:email and password=:password";
		EntityManager em=emf.createEntityManager();
		Query query=em.createQuery(jpql);
		query.setParameter("email", email);
		query.setParameter("password", password);
		
		try {
			return (Employee)query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
		
	}

	@Override
	public boolean register(Employee employee) {
		if(checkMail(employee.getEmail())) {
			return false;
		}
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		try {
			transaction.begin();
			em.persist(employee);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	private boolean checkMail(String email) {
		String jpql="from Employee where email=:email";
		EntityManager em=emf.createEntityManager();
		Query query=em.createQuery(jpql);
		query.setParameter("email", email);
		try {
			query.getSingleResult();
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	@Override
	public boolean deleteEmployee(int id) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		Employee emp=em.find(Employee.class, id);
		if(emp==null) {
			return false;
		}
		em.remove(emp);
		transaction.commit();
		return true;
	}

	@Override
	public boolean update(Employee employee) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		Employee emp=em.find(Employee.class, employee.getId());
		if(emp==null) {
			return false;
		}
		emp.setName(employee.getName());
		emp.setPassword(employee.getPassword());
		emp.setDob(employee.getDob());
		transaction.commit();
		return true;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployee() {
		String jpql="from Employee";
		EntityManager em=emf.createEntityManager();
		Query query=em.createQuery(jpql);
		List<Employee> emp=query.getResultList();
		return emp;
	}//End of getAllEmployee

}//End of class
