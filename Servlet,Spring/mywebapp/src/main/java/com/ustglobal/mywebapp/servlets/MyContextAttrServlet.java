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
@WebServlet("/contextattr")
public class MyContextAttrServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmpInfoBean empInfoBean=new EmpInfoBean();
		empInfoBean.setEmp_id(999);
		empInfoBean.setEmp_name("shweta");
		empInfoBean.setEmp_age(22);
		empInfoBean.setEmp_sal(37409367);
		empInfoBean.setDesignation("hgadkh");
		empInfoBean.setPassword("hfhmfsh");
		
		
		ServletContext context=getServletContext();
		context.setAttribute("emp", empInfoBean);
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>context atrribute has been set...</h3>");
		out.println("</body>");
		out.println("</html>");
	}
}
