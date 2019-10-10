<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h3>${msg}</h3>
	<fieldset>
		<legend>LoginForm</legend>
		<form action="./login" method="post">
			<table>
				<tr>
					<td>Email:</td>
					<td><input type="email" name="email" required></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password" required></td>
				</tr>
				<tr>
					<td><input type="submit" value="Login"></td>
					<td><a href="./register">Sign Up</a></td>
				</tr>
			</table>
		</form>
		
	</fieldset>
</body>
</html>