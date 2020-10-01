<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Out Implicit Object</title>
</head>
<body>
	<h1>Using the jsp out object to print value....</h1>
	<%
		int i = 100;
		char c = 'c';
		short s = 10;
		double d = 2.5;
		float f = 10.5f;
		String str = "out object!";
	%>
	Displaying value in an int  : <%=i%> <br/>
	Displaying value in a char  : <%=c%> <br/>
	Displaying value in a short : <%=s%> <br/>
	Displaying value in a float : <%=f%> <br/>
	Displaying value in a double: <%=d%> <br/>

	Displaying value in a String : <%=str%>
	
	
	
	
	<h1>Using the out Object in a method.</h1>


	<%!
		javax.servlet.jsp.JspWriter out2;
		
		void print() throws java.io.IOException
		{
			out2.println("Hello from JSP's out object!");
		}
	%>
	
	<%
		out2 = out;
		print();
	%>
</body>
</html>