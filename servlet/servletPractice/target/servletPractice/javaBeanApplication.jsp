<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- 	<%@ page import="jspPracticePackage.JavaBeanGetSet" %>
	<%@ page extends="jspPracticePackage.JavaBeanGetSet" %> --%>
	<!-- Application Scope -->
	<h1>This is Application Scope Of jsp:useBean</h1><br/>
	<jsp:useBean id="val1" class="jspPracticePackage.JavaBeanGetSet"
		scope="application"></jsp:useBean>
	Name :<jsp:getProperty property="name" name="val1" /><br/>
	Password :<jsp:getProperty property="password" name="val1" /><br/>
	Email :<jsp:getProperty property="email" name="val1" /><br/> 
</body>
</html>

