package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.mywebapp.dto.EmpInfoBean;
@WebServlet("/myAtrributeValue")
public class MyAttributeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context=getServletContext();
		EmpInfoBean empInfoBean=(EmpInfoBean) context.getAttribute("emp");
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>Employee Details:</h3>");
		out.println("Id-"+empInfoBean.getEmp_id());
		out.println("name-"+empInfoBean.getEmp_name());
		out.println("age-"+empInfoBean.getEmp_age());
		out.println("salary"+empInfoBean.getEmp_sal());
		out.println("designation-"+empInfoBean.getDesignation());
		out.println("</body>");
		out.println("</html>");
	}
}
