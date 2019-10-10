package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.mywebapp.dao.EmployeDao;
import com.ustglobal.mywebapp.dao.EmployeeDaoJpaImp;
import com.ustglobal.mywebapp.dto.EmpInfoBean;
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private EmployeDao  imp=new EmployeeDaoJpaImp();
	@Override
	protected  void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
		EmpInfoBean bean =new EmpInfoBean();
		
		String eid=req.getParameter("eid");
		int id=Integer.parseInt(eid);
		String ename=req.getParameter("ename");
		String eage=req.getParameter("eage");
		int age=Integer.parseInt(eage);
		String esal=req.getParameter("esal");
		double sal=Double.parseDouble(esal);
		String edesignation=req.getParameter("edesignation");
		String pass=req.getParameter("password");

		/*bean.setEmp_id(id);
		bean.setEmp_name(ename);
		bean.setEmp_age(age);
		bean.setEmp_sal(sal);
		bean.setDesignation(edesignation);
		bean.setPassword(pass);*/
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		boolean b=imp.updateEmp(id,ename,age,sal,edesignation,pass);
		if(b==true) {
			out.println("<h2>updated</h2>");
		}else {
			out.println("<h2>u cant update id "+id+"bcoz id is primary</h2>");
		}
		}else {
			resp.sendRedirect("./loginForm.html");

		}
	}
}
