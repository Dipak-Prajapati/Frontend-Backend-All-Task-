<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="no1" value="${param.no1}"></c:set>
	
	<c:if test="${no1 != ''}">
		
		<c:choose>
		
		<c:when test="${no1%2 == 0}">
			<c:out value="${no1} is even Number"></c:out>
			<%@ include file="c_form.jsp" %>
		</c:when>
		
		<c:otherwise>
			<c:out value="${no1} is odd Number"></c:out>
			<%@ include file="c_form.jsp" %>
		</c:otherwise>
	</c:choose>	
	</c:if>
	
	<c:if test="${no1 == ''}">
		<h1>Please Enter The Number</h1>
		<%@ include file="c_form.jsp" %>
	</c:if>
	
	
	
</body>
</html>