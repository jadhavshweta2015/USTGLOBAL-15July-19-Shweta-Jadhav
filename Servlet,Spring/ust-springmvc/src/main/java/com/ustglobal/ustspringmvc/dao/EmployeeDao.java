package com.ustglobal.ustspringmvc.dao;

import java.util.List;

import com.ustglobal.ustspringmvc.dto.Employee;

public interface EmployeeDao {

	public Employee auth(String email, String password);

	public boolean register(Employee employee);

	public boolean deleteEmployee(int id);

	public boolean update(Employee employee);

	public List<Employee> getAllEmployee();
}
