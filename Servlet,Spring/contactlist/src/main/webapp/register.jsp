<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./register" method="post">
		<table>
		  <tr>
		    <td>Name:</td>
		    <td><input type="text" name="name"></td>
		  </tr>
		  <tr>
		    <td>Number:</td>
		    <td><input type="text" name="number"></td>
		  </tr>
		  <tr>
		    <td>Group:</td>
		    <td><input type="text" name="group"></td>
		  </tr>
		  <tr>
		    <td>password:</td>
		    <td><input type="password" name="password"></td>
		  </tr>
		  <tr>
		    
		    <td><input type="submit" value="submit"></td>
		    <td><input type="reset" value="Reset"></td>
		  </tr>
		</table>

	</form>
</body>
</html>