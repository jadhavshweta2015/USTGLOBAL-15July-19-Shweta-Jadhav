<%@page import="java.util.List"%>
<%@page import="com.ustglobal.ustspringmvc.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%
	List<Employee> employee=(List)request.getAttribute("list");
	Employee emp=(Employee)session.getAttribute("emp");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Employee</title>
</head>
<body>
	<div align="right">
		<span><a href="./update">Update Profile</a></span>
		<span><a href="./delete?id=<%=emp.getId()%>">Delete Profile</a></span>
		<span><a href="./logout">LogOut</a></span>
	</div>
	<div>
		<a href="./home">Home</a>
	</div>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>DOB</th>
			<th>EMAIL</th>
		</tr>
		<%
			for (Employee empl : employee) {
		%>
		<tr>
			<td><%=empl.getId()%></td>
			<td><%=empl.getName()%></td>
			<td><%=empl.getDob()%></td>
			<td><%=empl.getEmail()%></td>
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>