<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="MyServlet2" method = "post">
	
	<table>
	
	<tr>
		<td><label for="firstName">First Name:</label></td>
		<td><input type="text" name="firstName" value = "${firstName}" disabled="disabled"/></td>
	</tr>
	<tr>
		<td><label for="lastName">Last Name:</label></td>
		<td><input type="text" name="lastName" value="${lastName}" disabled="disabled"/></td>
	</tr>
	
	<tr>
		<td><label for="gamil">Gmail:</label></td>
		<td><input id ="gamil" type = "text" name ="gmail"></td>
	</tr>
	
	<tr>
		<td><label for="phone">Phone:</label></td>
		<td><input id="phone" type = "text" name ="phone"></td>
	</tr>
	
	</table>
	<input type ="submit" value ="Submit">
	</form>
</body>
</html>