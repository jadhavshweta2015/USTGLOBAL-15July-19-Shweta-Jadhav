<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:useBean id="empInfoBean"  class="com.ustglobal.mywebapp.dto.EmpInfoBean" scope="session"></jsp:useBean>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<div align="right">
	<a href="./delete1?id=<%=empInfoBean.getEmp_id()%>">Delete Profile</a>
</div>
<div align="right">
	<a href="./logout1">Logout</a>
</div>
	<h1>
		Welcome <%=empInfoBean.getEmp_name() %>
	</h1>
</body>
</html>