<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!--Information send to DataDisplay.jsp-->
	
	<%  
		pageContext.setAttribute("Name", "Dipak", pageContext.PAGE_SCOPE);
		pageContext.setAttribute("Surname", "Prajapati", pageContext.REQUEST_SCOPE);
		pageContext.setAttribute("Age", "20", pageContext.SESSION_SCOPE);
		pageContext.setAttribute("Born", "1999", pageContext.APPLICATION_SCOPE);
	%>
	
	<% 
	pageContext.forward("DataDisplay.jsp");
	%>
</body>
</html>