<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
	<form method="post" action="./register1">
		<table>
  			<tr>
    			<td>Id:</td>
    			<td><input type="number" name="eid" placeholder="Enter id"></td>
  			</tr>
  			<tr>
    			<td>Name:</td>
    			<td><input type="text" name="ename" placeholder="Enter name"></td>
  			</tr>
  			<tr>
    			<td>Age:</td>
    			<td><input type="number" name="eage" placeholder="Enter age"></td>
  			</tr>
  			<tr>
    			<td>Salary:</td>
    			<td><input type="number" name="esal" placeholder="Enter salary"></td>
  			</tr>
  			<tr>
    			<td>Designation:</td>
    			<td><input type="text" name="edesignation" placeholder="Enter designation"></td>
  			</tr>
   			<tr>
    			<td>Password:</td>
    			<td><input type="text" name="epassword" placeholder="Enter designation"><br></td>
  			</tr>
   			<tr>
    			<td><input type="submit" value="Submit"></td>
    			<td><input type="reset" value="Reset"></td>
 			</tr>
	</table>
</form>
</body>
</html>