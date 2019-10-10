package com.ustglobal.mywebapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.mywebapp.dao.EmployeDao;
import com.ustglobal.mywebapp.dao.EmployeeDaoJpaImp;
import com.ustglobal.mywebapp.dto.EmpInfoBean;
@WebServlet("/login1")
public class LoginServlet extends HttpServlet {
	EmployeDao dao=new EmployeeDaoJpaImp();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher=req.getRequestDispatcher("/login1.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empId=req.getParameter("id");
		int id=Integer.parseInt(empId);
		String password=req.getParameter("password");
		
		EmpInfoBean empInfoBean=dao.login(id, password);
		
		String url=null;
		if(empInfoBean!=null) {
			HttpSession session=req.getSession(true);
			session.setAttribute("empInfoBean", empInfoBean);
			url="/home1.jsp";
			
		}else {
			
			url="/login1.jsp";
		}
		RequestDispatcher dispatcher=req.getRequestDispatcher(url);
		dispatcher.forward(req, resp);
	}
}
