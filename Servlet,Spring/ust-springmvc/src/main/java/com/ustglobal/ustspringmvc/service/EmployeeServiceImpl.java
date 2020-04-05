package com.ustglobal.ustspringmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.ustspringmvc.dao.EmployeeDao;
import com.ustglobal.ustspringmvc.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public Employee auth(String email, String password) {
		return dao.auth(email, password);
	}

	@Override
	public boolean register(Employee employee) {
		if(employee.getName()==null||employee.getEmail()==null||employee.getPassword()==null) {
			return false;
		}
		return dao.register(employee);
	}

	@Override
	public boolean deleteEmployee(int id) {
		return dao.deleteEmployee(id);
	}

	@Override
	public boolean update(Employee employee) {
		if(employee.getName()==null||employee.getEmail()==null||employee.getPassword()==null) {
			return false;
		}
		return dao.update(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return dao.getAllEmployee();
	}

}