package com.ustglobal.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.mywebapp.dao.EmployeDao;
import com.ustglobal.mywebapp.dao.EmployeeDaoJpaImp;
import com.ustglobal.mywebapp.dto.EmpInfoBean;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	EmployeDao dao=new EmployeeDaoJpaImp();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empId=req.getParameter("empId");
		int id=Integer.parseInt(empId);
		String password=req.getParameter("password");
		
		EmpInfoBean empInfoBean=dao.login(id, password);
		if(empInfoBean!=null) {
			HttpSession session=req.getSession(true);
			session.setAttribute("empinfo", empInfoBean);
			resp.sendRedirect("./Home.html");
		}else {
			resp.sendRedirect("./loginForm.html");
		}
	}
}