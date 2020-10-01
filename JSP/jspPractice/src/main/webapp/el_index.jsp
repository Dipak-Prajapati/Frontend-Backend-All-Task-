<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EL Get Value</title>
</head>
<body>
<!-- 	<form action="el_process.jsp">
		<input type="text" name="name">
		<input type="submit">
	</form> -->
	
	
	<form action="el_servlet" >
		Name:<input type="text" name="uname"><br/>
		SurName : <input type="text" name = "surname"><br/>
		Company : <input type="text" name = "company"><br/>
		<input type="submit" value="Click Here">
	</form>
</body>
</html>