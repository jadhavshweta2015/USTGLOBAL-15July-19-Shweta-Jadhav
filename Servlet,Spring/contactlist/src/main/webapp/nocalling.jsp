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
		<fieldset>
		<legend>LogIn</legend>
		<form action="./call" method="post" >
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
				    <td><input type="submit" value="call"></td>
				  </tr>
				</table>

		</form>
	</fieldset>
</body>
</html>