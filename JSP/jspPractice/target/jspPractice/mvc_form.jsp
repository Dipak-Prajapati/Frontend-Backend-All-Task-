<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MVC Get the value from user</title>

</head>
<body>
	<form action="mvcServlet" method="post">
	
	<span>Email :</span><input type="email" name="email" placeholder="Enter The Email">
	<br/><br/>
	<span>PassWord :</span><input type="password" name="pwd" placeholder="Enter The PassWord">
	<br/><br/>
	<input type="submit" value="Login">	
	</form>
</body>
</html>