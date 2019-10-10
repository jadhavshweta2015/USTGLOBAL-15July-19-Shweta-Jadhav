package com.ustglobal.mywebapp.dao;

import com.ustglobal.mywebapp.dto.EmpInfoBean;

public interface EmployeDao {
	public EmpInfoBean searchEmp(int id);
	public boolean addEmp(EmpInfoBean e);
	public boolean deleteEmp(int id);
	public EmpInfoBean login(int empId,String password);
	public boolean updateEmp(int id,String name,int age,double salary,String designation,String password);

}
