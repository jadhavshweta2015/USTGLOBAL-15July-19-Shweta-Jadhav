package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.mywebapp.dao.EmployeeDaoJpaImp;
import com.ustglobal.mywebapp.dto.EmpInfoBean;
@WebServlet("/delete")
public class DeleteEmpServlet extends HttpServlet {
	private EmployeeDaoJpaImp dao=new EmployeeDaoJpaImp();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
		String empIdVal=req.getParameter("empId");
		int e=Integer.parseInt(empIdVal);
		
		boolean empInfoBean=dao.deleteEmp(e);
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<body>");
		if(empInfoBean!=false) {
			out.println("<h3>deleteed</h3>");
			
		}else {
			out.println("<h2>not deleteed</h2>");
		}
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");
		}
		else {
			resp.sendRedirect("./loginForm.html");
		}
	}
}
