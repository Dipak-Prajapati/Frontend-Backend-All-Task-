<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Function Tag</title>
</head>
<body>
	
	<c:set var="path" value="D:Workspace\NetBeans\ozu\web\img\certi\certificate33.jpg"></c:set>
	Path Is :
	
	<c:out value="${path}"></c:out>
	<%-- Image Name :<c:out value="${fn:substringAfter(path,\"certi\")}"></c:out> --%>
	Image Name :<c:out value="${fn:substringAfter(path,\"certi\")}"></c:out>
	<br />
	<hr>
	
		

	<c:set var="str" value="India Is My Country"></c:set>
	String Is :
	<c:out value="${str}"></c:out>
	<br />
	<hr>

	<h1>fn:contains :</h1>
	<br /> String Contain *Is* :
	<c:out value="${fn:contains(str,'Is')}"></c:out>
	<br /> String Contain *COUNTRY* :
	<c:out value="${fn:contains(str,'COUNTRY')}"></c:out>

	<hr>

	<h1>fn:containsIgnoreCase :</h1>
	String Contain *Is* :
	<c:out value="${fn:containsIgnoreCase(str,'Is')}"></c:out>
	<br /> String Contain *COUNTRY* :
	<c:out value="${fn:containsIgnoreCase(str,'COUNTRY')}"></c:out>

	<hr>
	<h1>fn:endsWith :</h1>
	<br /> String Ends With *Country* :
	<c:out value="${fn:endsWith(str,'Country')}"></c:out>
	<br /> String Ends With *India* :
	<c:out value="${fn:endsWith(str,'India')}"></c:out>
	<br />

	<hr>
	<h1>fn:startsWith :</h1>
	<br /> String Start With *India* :
	<c:out value="${fn:startsWith(str,'India')}"></c:out>
	<br /> String Ends With *Country* :
	<c:out value="${fn:startsWith(str,'Country')}"></c:out>
	<br />

	<hr>

	<h1>fn:escapeXml :</h1>
	<br />
	<c:set var="string1" value="It is first String." />
	<c:set var="string2" value="It is <xyz>second String.</xyz>" />

	<p>With escapeXml() Function:</p>
	<p>
		string-1 :
		<c:out value="${fn:escapeXml(string1)}"></c:out>
	</p>
	<p>
		string-2 :
		<c:out value="${fn:escapeXml(string2)}"></c:out>
	</p>

	<p>Without escapeXml() Function:</p>
	<p>
		string-1 :
		<c:out value="${string1}"></c:out>
	</p>
	<p>
		string-2 :
		<c:out value="${string2}"></c:out>
	</p>

	<hr>

	<h1>fn:indexOf :</h1>
	<br />
	<p>The Index Of *Is* from *India Is My Country* : ${fn:indexOf(str, "Is")}</p>
	<p>The Index Of *My* from *India Is My Country* : ${fn:indexOf(str, "My")}</p>

	<hr>

	<h1>fn:length , fn:trim:</h1>
	<br />
	<c:set var="str1" value="Welcome to JSP        programming         " />
	Without Trim String is :
	<c:out value="${str1}"></c:out>
	<p>String-1 Length is : ${fn:length(str1)}</p>

	<c:set var="str2" value="${fn:trim(str1)}" />
	<p>String-2 Length is : ${fn:length(str2)}</p>
	<p>Final value of string is : ${str2}</p>


	<hr>
	<h1>fn:split , fn:join :</h1>
	<br />
	<c:set var="str2" value="${fn:split(str, ' ')}" />
	<c:set var="str3" value="${fn:join(str2, '-')}" />

	<p>String Is : ${str3}</p>
	<br />

	<c:set var="str4" value="${fn:split(str, '-')}" />
	<c:set var="str5" value="${fn:join(str2, ' ')}" />

	<p>String Is : ${str5}</p>
	<br />

	<hr>

	<h1>fn:toLowerCase :</h1>
	<br /> ${fn:toLowerCase("HELLO,")} ${fn:toLowerCase(str)}

	<hr>

	<h1>fn:toUpperCase :</h1>
	<br /> ${fn:toUpperCase("hello,")} ${fn:toUpperCase(str)}

	<hr>
	<h1>fn:subString :</h1>
	<c:set var="stringg" value="This is the first string." />
	String Is : ${stringg}
	<br /> SubString is: ${fn:substring(stringg, 5, 17)}

	<hr>
	<h1>fn:subStringAfter :</h1>
	<c:set var="strinng" value="Dipak Prajapati" />
	String Is : ${strinng }<br/>
	String After Dipak is :${fn:substringAfter(strinng, "Dipak")}
	
	<hr>
	
	<h1>fn:subStringBefore :</h1>
	<c:set var="strinngg" value="Dipak Prajapati" />
	String Is : ${strinngg }<br/>
	String Before Prajapati is :${fn:substringBefore(strinngg, "Prajapati")}
	
	<hr>
	
	<h1>fn:replace </h1>
	<c:set var="strnng" value="Dipak Prajapati" />
	String Is : ${strnng}<br/>
	Replace Dipak to Alpesh :${fn:replace(strnng , "Dipak" , "Alpesh")}
	
	<hr>

	
</body>
</html>