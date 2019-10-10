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
@WebServlet("/delete1")
public class DeleteServlet extends HttpServlet {

	EmployeDao dao=new EmployeeDaoJpaImp();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String eid=req.getParameter("id");
		
		
		dao.deleteEmp(Integer.parseInt(eid));
		
		HttpSession session=req.getSession(false);
		session.invalidate();
		
		resp.sendRedirect("./login1");
	}
}
