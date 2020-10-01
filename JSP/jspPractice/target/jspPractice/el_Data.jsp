<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ page import="java.util.*" %>
	 <%
            List<String> names = new ArrayList<String>();
            names.add("Axat Shah");
            names.add("Shreyansh Soni");
            pageContext.setAttribute("names", names);
    %>
    <div id="sampleElExpressionsDiv">
    
        <span><strong>Simple EL Example = </strong> ${requestScope.person}</span><br /><br />
      
        <span><strong>Simple EL Example (Without Scope) = </strong> ${person}</span><br /><br />
      
        <span><strong>Application Scope Example = </strong> ${applicationScope["UserCookie"]}</span><br /><br />
      
        <span><strong>Session EL Example = </strong> ${sessionScope.employee.address.address}</span><br /><br />
      
        <span><strong>List EL Example = </strong> ${names[0]}</span><br /><br />
        
        <span><strong>Header Information EL Example = </strong> ${header["Accept-Encoding"]}</span><br /><br />
        
        <span><strong>'pageContext' EL Example = </strong> <span id="httpMethodId">Http Method Is = </span>${pageContext.request.method}</span><br /><br />
        
        <span><strong>Context Param EL Example = </strong> ${initParam.AppId}</span><br /><br />
        
        <span><strong>Arithmetic Operator EL Example = </strong> ${initParam.AppId + 200}</span><br /><br />
        
        <span><strong>Relational Operator EL Example = </strong> ${initParam.AppId < 200}</span><br /><br />
    
    	
    </div>
</body>
</html>