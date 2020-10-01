<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EL Display Data</title>
</head>
<body>
	<%
		String name = request.getParameter("uname");
		pageContext.setAttribute("name", name , pageContext.PAGE_SCOPE);
	%>
	<%= request.getParameter("uname") %>
	<%= request.getParameter("company") %>
	<%= request.getParameter("surname") %>
	
	
	<span><strong>PageScope EL Example = </strong> ${pageScope.name}</span><br /><br />
	
	<span><strong>RequestScope EL Example = </strong> ${requestScope.uname}</span><br /><br />
	
	<span><strong>SessionScope EL Example = </strong> ${sessionScope.surname}</span><br /><br />
	
	<span><strong>ApplicationScope EL Example = </strong> ${applicationScope.age}</span><br /><br />
	
	<span><strong>Param EL Example = </strong> ${param.surname}</span><br /><br />
	
	<span><strong>Header EL Example = </strong> ${header["cookie"]}</span><br /><br />
	
	<span><strong>HeaderValue EL Example = </strong> ${headerValues["user-agent"].}</span><br /><br />
	
	<span><strong>Cookie EL Example = </strong> ${cookie.server.value}</span><br /><br />
	
	<span><strong>InitParam EL Example = </strong> ${initParam.AppId}</span><br /><br />
	
	<span><strong>PageContext EL Example = </strong> ${pageContext.request.method}</span><br /><br />
	

</body>
</html>