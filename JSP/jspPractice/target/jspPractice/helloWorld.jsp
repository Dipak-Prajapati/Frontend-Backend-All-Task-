<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello World JSP File</title>
</head>
<body>
	<% out.println("Hello World : This is Scriplet Tag"); %><br>
	<%! 
		String msg(String msg1)
		{
			return msg1;
		}
	%>
	
	<script type="text/javascript">
		var b = "<%= msg("Hello") %> " ;
		alert(b);
		
		<%! 
			int sum(int a , int b)
			{
				return a+b;
			}
		%>
		
		var sum = "<% out.print("Sum of 2 numbers : " + sum(5,5)); %> " ;
		alert(sum);
		</script>
	
	
</body>
</html>