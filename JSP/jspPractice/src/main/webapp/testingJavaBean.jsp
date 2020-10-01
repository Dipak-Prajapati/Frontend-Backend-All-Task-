<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Set Value</title>
</head>
<body>
	<h1>
		Welcome
		<%=request.getParameter("name")%>
	</h1>

	<!-- Scope = Page -->

<%-- 	<h1>This is Page Scope Of jsp:useBean</h1><br/>
 	<jsp:useBean id="val1" class="jspPracticePackage.JavaBeanGetSet" scope="page"></jsp:useBean>
	<jsp:setProperty property="*" name="val1" />
	<h3>Before Include Scope Page</h3>
	<jsp:include page="javaBeanGetSet.jsp"></jsp:include>
	<h3>After Include Scope Page</h3>
	Name :<jsp:getProperty property="name" name="val1" /><br/>
	Password :<jsp:getProperty property="password" name="val1" /><br/>
	Email :<jsp:getProperty property="email" name="val1" /><br/> 
	<a href="javaBeanGetSet.jsp">Go TO GET SET Page</a>
 --%>	

	<!-- Scope = request -->
<%-- 	<h1>This is Request Scope Of jsp:useBean</h1><br />
	<jsp:useBean id="val2" class="jspPracticePackage.JavaBeanGetSet"
		scope="request"></jsp:useBean>
	<jsp:setProperty property="*" name="val2" />
	<h3>Before Include Scope Request</h3>
	<jsp:include page="javaBeanGetSet.jsp"></jsp:include>
	<h3>After Include Scope Request</h3>
	Name :<jsp:getProperty property="name" name="val2" /><br/>
	Password :<jsp:getProperty property="password" name="val2" /><br/>
	Email :<jsp:getProperty property="email" name="val2" /><br/> 
	<a href="javaBeanGetSet.jsp">Go TO GET SET Page</a> --%>

	 

	<!-- Scope = session -->
	<%-- <h1>This is Session Scope Of jsp:useBean</h1>
	<br />
	<jsp:useBean id="val1" class="jspPracticePackage.JavaBeanGetSet"
		scope="session"></jsp:useBean>
	<jsp:setProperty property="*" name="val1" />
	<a href="javaBeanGetSet.jsp">Go TO GET SET Page</a> --%>

	<!-- Scope = Application -->
	<h1>This is Application Scope Of jsp:useBean</h1>
	<br />
	<jsp:useBean id="val1" class="jspPracticePackage.JavaBeanGetSet"
		scope="application"></jsp:useBean>
	<jsp:setProperty property="*" name="val1" />
	<a href="javaBeanGetSet.jsp">Go TO GET SET Page</a>
	

</body>
</html>