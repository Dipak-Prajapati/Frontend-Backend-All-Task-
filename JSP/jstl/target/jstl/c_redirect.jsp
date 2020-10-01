<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Redirect to Inexture Website</title>
</head>
<body>
	<c:set var="url" value="${param.no1}"></c:set>
	
	<c:if test="${url == 1 }">
		<c:redirect url="https://www.inexture.com/about-us/"></c:redirect>
	</c:if>
	
	<c:if test="${url == 2 }">
		<c:redirect url="https://www.inexture.com/contact-us/"></c:redirect>
	</c:if>
	
	<c:if test="${url != 2 && url != 1}">
		<h1 style="color:red;">Please Enter The Number Only 1 or 2</h1>
		<%@ include file="redirect_form.jsp" %>
	</c:if>
	
</body>
</html>