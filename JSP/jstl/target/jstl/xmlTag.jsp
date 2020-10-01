<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL XML TAG</title>
</head>
<body>
	<h1>x:out , x:parse</h1>
	<c:import url="game.xml" var="play"></c:import>
	<x:parse var="result" doc="${play}">
	</x:parse>

	<b>The name of the first Game is</b>:
	<x:out select="$result/games/game[1]/name" />
	<br>

	<b>The name of the second Game is</b>:
	<x:out select="$result/games/game[2]/name" />
	<br>

	<b>The platform of the third Game is</b>:
	<x:out select="$result/games/game[3]/platform" />
	<br>

	<hr>

	<h1>x:set</h1>
	<x:set var="a" select="$result/games/game[1]" />
	The name of the first game -
	<x:out select="$a/name" />
	<br>

	<x:set var="b" scope="application"
		select="$result/games/game[1]/platform" />
	The platform of the first game -
	<x:out select="$applicationScope:b" />
	<br>

	<x:set var="c" scope="session" select="$result/games/game[2]" />
	The name of the second game -
	<x:out select="$sessionScope:c/name" />
	<br>
	<hr>

	<h1>x:if</h1>

	<x:if select="$result/games/game[2]/price > 150">
       Game price is High <br>
	</x:if>
	<br>
	<x:if select="$result/games/game[1]/price < 500">
       Game price is Low <br>
	</x:if>

	<hr>
	<h1>x:choose , x:when , x:otherwise</h1>
	<x:choose>
		<x:when select="$result/games/game[1]/price > 500">
          Game Price is High
       </x:when>
		<x:when select="$result/games/game[1]/price < 500">
          Game Price is Low
       </x:when>
		<x:otherwise>
          Game Price is Medium
       </x:otherwise>

	</x:choose>

	<hr>

	<h1>x:forEach</h1>
	<h3>Name Of The Game </h3>
	<x:forEach select="$result/games/game/name" var="i">
		<x:out select="$i" />
		<br>
	</x:forEach>
	
	<h3>Game Names from starting index = 1</h3>
	<x:forEach select="$result/games/game/name" var="i" begin="1">
		<x:out select="$i" />
		<br>
	</x:forEach>
	<h3>Game names with steps = 2</h3>
	<x:forEach select="$result/games/game/name" var="i" step="2">
		<x:out select="$i" />
		<br>
	</x:forEach>

</body>
</html>