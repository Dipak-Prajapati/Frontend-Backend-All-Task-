<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
		out.print("This is Scriple Tag : ");
		out.print("Multiplication of 5 is : " + 5*5); 
		int a = 5 , b = 5;
		int sum = a + b;
	%>
	<br>
	<%= "This is Expression Tag :" %>
	<%= "sum is :" + sum %>
	<br>
	Current Time: <%= java.util.Calendar.getInstance().getTime() %>  
	<br>
	<%!
		int cube(int n)
		{
			return n*n*n;
		}
	%>
	<%= "Cube of 5 is:" + cube(5)  %>
</body>
</html>