<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>The Include Directive Count File</title>
</head>
<body>
	<%!
		int count = 0;
		void addCount()
		{
			count++;
		}
	%>
	
	<%
		addCount();
	%>
	
	<h1>This is the Example of Include Directory</h1><br/>
	<p>The Site Has Been Visited <%= count %> Times....</p><br/><br/>
</body>
</html>