<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!--Information Get From settingAttribute.jsp-->
	
	Access The Value Of Name In Page Scope :
	<% out.println(pageContext.getAttribute("Name", pageContext.PAGE_SCOPE)); %>
	<br/>
	<br/>
	Access The Value Of Surname In Request Scope :
	<% out.println(pageContext.getAttribute("Surname", pageContext.REQUEST_SCOPE)); %>
	<br/>
	<br/>
	Access The Value Of Age In Session Scope :
	<% out.println(pageContext.getAttribute("Age", pageContext.SESSION_SCOPE)); %>
	<br/>
	<br/>
	Access The Value Of Born In Application Scope :
	<% out.println(pageContext.getAttribute("Born", pageContext.APPLICATION_SCOPE)); %>
</body>
</html>