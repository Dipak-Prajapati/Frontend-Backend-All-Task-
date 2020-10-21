<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Value</title>
</head>
<body>

	<!-- Can't Print Because Page Scope is Over -->

<%-- 	<h1>This is Page Scope Of jsp:useBean</h1><br/>	
	<jsp:useBean id="val1" class="jspPracticePackage.JavaBeanGetSet"
		scope="page"></jsp:useBean>
	Name :<jsp:getProperty property="name" name="val1" /><br/>
	Password :<jsp:getProperty property="password" name="val1" /><br/>
	Email :<jsp:getProperty property="email" name="val1" /><br/> 
 --%>
	<!-- Request Scope -->

<%-- 	<jsp:useBean id="val2" class="jspPracticePackage.JavaBeanGetSet"
		scope="request"></jsp:useBean>
		
	Name :<jsp:getProperty property="name" name="val2" /><br/>
	Password :<jsp:getProperty property="password" name="val2" /><br/>
	Email :<jsp:getProperty property="email" name="val2" /><br/>
 --%>
	
	<!-- Session Scope -->
	<%-- <h1>This is Session Scope Of jsp:useBean</h1><br/>
	<jsp:useBean id="val1" class="jspPracticePackage.JavaBeanGetSet"
		scope="session"></jsp:useBean>
	Name :<jsp:getProperty property="name" name="val1" /><br/>
	Password :<jsp:getProperty property="password" name="val1" /><br/>
	Email :<jsp:getProperty property="email" name="val1" /><br/>  --%>

	 <!-- Application Scope -->
	<h1>This is Application Scope Of jsp:useBean</h1><br/>
	<jsp:useBean id="val1" class="jspPracticePackage.JavaBeanGetSet"
		scope="application"></jsp:useBean>
	Name :<jsp:getProperty property="name" name="val1" /><br/>
	Password :<jsp:getProperty property="password" name="val1" /><br/>
	Email :<jsp:getProperty property="email" name="val1" /><br/> 
	
</body>
</html>