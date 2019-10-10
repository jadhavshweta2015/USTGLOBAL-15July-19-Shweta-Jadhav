package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readCookie")
public class ReadCookie extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies=req.getCookies();
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		
		out.println("<html>");
		out.println("<head>");
		out.println("<body>");
		if(cookies!=null) {
		for (Cookie cookie : cookies) {
			out.println("<h3>cookie name:"+cookie.getName()+"</h3><br>");
			out.println("<h3>cookie name:"+cookie.getValue()+"</h3><br>");
		}
		}else {
			out.println("<h3>not found</h3>");
		}
		
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");
	}
}
