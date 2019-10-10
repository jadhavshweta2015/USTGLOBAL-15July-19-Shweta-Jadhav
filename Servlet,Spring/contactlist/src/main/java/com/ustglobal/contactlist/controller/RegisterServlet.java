package com.ustglobal.contactlist.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.contactlist.dao.ContactListImpl;
import com.ustglobal.contactlist.dao.ContactListInterface;
import com.ustglobal.contactlist.dto.ContactList;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	ContactListInterface cont=new ContactListImpl();
	ContactList contact=new ContactList();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher=req.getRequestDispatcher("/register.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String number=req.getParameter("number");
		String group=req.getParameter("group");
		String password=req.getParameter("password");
		
		contact.setName(name);
		contact.setNumber(number);
		contact.setGroup(group);
		contact.setPassword(password);
		
		cont.add(contact);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("/login.jsp");
		dispatcher.forward(req, resp);
		
	}
}
