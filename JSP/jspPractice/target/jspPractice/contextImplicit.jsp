<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body
	
<% 

	Object ob = application.getAttribute("Background_Color");
	boolean bool=false;
	
	if(ob==null)
	{
		bool=true;
	}
	else
	{
		out.println("bgcolor =" + application.getAttribute("Background_Color"));
	}
	
	if(bool)
	{
		application.setAttribute("Background_Color", "pink");
		
	}
	
	%>
	> <!-- html opening body tag ends here -->
	
	<h1>Setting and accessing application object</h1>
	This page will set its background color using implicit application object of JSP.
	
	<br/>
	<%
		String value = application.getInitParameter("val");
		out.print("Context Param Value :" + value);
	%>
</body>
</html>