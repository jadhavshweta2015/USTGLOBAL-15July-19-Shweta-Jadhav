package com.ustglobal.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.mywebapp.dto.EmpInfoBean;
@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmpInfoBean empInfoBean=new EmpInfoBean();
		empInfoBean.setEmp_id(999);
		empInfoBean.setEmp_name("sgs");
		empInfoBean.setEmp_age(22);
		
		req.setAttribute("employee", empInfoBean);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("/reqAttribute");
		dispatcher.forward(req, resp);
	}
}
