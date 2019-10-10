<%@page import="com.ustglobal.mywebapp.dto.EmpInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ include file="loginForm.html" %>
<%@page errorPage="error.jsp" %>
<jsp:useBean id="emp" class="com.ustglobal.mywebapp.dto.EmpInfoBean" scope="application"></jsp:useBean>
<%
int i=1/0; 
%>

<%-- <%
EmpInfoBean bean=(EmpInfoBean)application.getAttribute("emp");
%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1><%=emp.getEmp_name() %></h1>
	<h1><%=emp.getEmp_id() %></h1>
</body>
</html>