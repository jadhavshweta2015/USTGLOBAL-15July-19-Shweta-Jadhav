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
@WebServlet("/searchEmp")
public class SearchEmpServlet extends HttpServlet {
	private EmployeeDaoJpaImp dao=new EmployeeDaoJpaImp();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			//get from data
			String empIdVal=req.getParameter("empId");
			int e=Integer.parseInt(empIdVal);
			
			EmpInfoBean empInfoBean=dao.searchEmp(e);
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<body>");
			if(empInfoBean!=null) {
				out.println("<h3>Empoyee data for employee"+e+"</h3>");
				out.println("emp id:"+empInfoBean.getEmp_id());
				out.println("emp name:"+empInfoBean.getEmp_name());
				out.println("emp age:"+empInfoBean.getEmp_age());
				out.println("emp salary:"+empInfoBean.getEmp_sal());
				out.println("emp designation:"+empInfoBean.getDesignation());
			}else {
				out.println("<h2>emp record for id "+e+"not found</h2>");
			}
			out.println("</body>");
			out.println("</head>");
			out.println("</html>");
			
		}else {
			resp.sendRedirect("./loginForm.html");
		}

		
	}
}
