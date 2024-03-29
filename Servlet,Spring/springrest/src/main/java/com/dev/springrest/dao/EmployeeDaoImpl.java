package com.dev.springrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.dev.springrest.dto.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public boolean addEmployee(Employee employee) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		try {
			transaction.begin();
			em.persist(employee);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public boolean removeEmployee(int id) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		Employee employee=em.find(Employee.class,id);
		if(employee==null) {
			return false;
		}
		em.remove(employee);
		transaction.commit();
		
		return true;
	}

	@Override
	public boolean modifyEmployee(Employee employee) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		Employee emp=em.find(Employee.class,employee.getId());
		if(emp==null) {
			return false;
		}
		emp.setName(employee.getName());
		emp.setDob(employee.getDob());
		emp.setPassword(employee.getPassword());
		transaction.commit();
		return true;
	}

	@Override
	public Employee getEmployee(int id) {
		EntityManager em=factory.createEntityManager();
		return em.find(Employee.class, id);
	}

	@Override
	public List<Employee> getAllEmployee() {
		EntityManager em=factory.createEntityManager();
		String jpql="From Employee";
		Query query=em.createQuery(jpql);
		List<Employee> emp=(List<Employee>) query.getResultList();
		return emp;
	}

}
