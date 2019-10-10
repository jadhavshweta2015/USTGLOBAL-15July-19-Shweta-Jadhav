package com.ustglobal.contactlist.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.contactlist.dao.ContactListImpl;
import com.ustglobal.contactlist.dao.ContactListInterface;
import com.ustglobal.contactlist.dto.ContactList;
@WebServlet("/call")
public class CallServlet extends HttpServlet {
	ContactListInterface cont=new ContactListImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher=req.getRequestDispatcher("/nocalling.jsp");
		dispatcher.forward(req, resp);
	}
	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String name=req.getParameter("name");
			String password=req.getParameter("number");
			
			ContactList contact=cont.login(name, password);
			
			String url=null;
			
			if(contact!=null) {
				HttpSession session=req.getSession(true);
				session.setAttribute("contact", contact);
				url="/calling.jsp";
			}else {
				url="/call.jsp";
			}
			
			RequestDispatcher dispatcher=req.getRequestDispatcher(url);
			dispatcher.forward(req, resp);
	}
}
