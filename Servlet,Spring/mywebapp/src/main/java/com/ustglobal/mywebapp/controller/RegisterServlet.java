package com.ustglobal.mywebapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.mywebapp.dao.EmployeDao;
import com.ustglobal.mywebapp.dao.EmployeeDaoJpaImp;
import com.ustglobal.mywebapp.dto.EmpInfoBean;
@WebServlet("/register1")
public class RegisterServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher=req.getRequestDispatcher("/register1.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EmpInfoBean empInfoBean =new EmpInfoBean();
		
		String eid=req.getParameter("eid");
		int id=Integer.parseInt(eid);
		String ename=req.getParameter("ename");
		String eage=req.getParameter("eage");
		int age=Integer.parseInt(eage);
		String esal=req.getParameter("esal");
		double sal=Double.parseDouble(esal);
		String edesignation=req.getParameter("edesignation");
		String pass=req.getParameter("epassword");
		
		empInfoBean.setEmp_id(id);
		empInfoBean.setEmp_name(ename);
		empInfoBean.setEmp_age(age);
		empInfoBean.setEmp_sal(sal);
		empInfoBean.setDesignation(edesignation);
		empInfoBean.setPassword(pass);
		
		EmployeDao dao=new EmployeeDaoJpaImp();
		
		dao.addEmp(empInfoBean);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("/login1.jsp");
		dispatcher.forward(req, resp);
	}
}
