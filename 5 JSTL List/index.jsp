<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lab Color List</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

<form class="content" method="POST" action="index">
<h1> Color List  </h1>
<input type="submit" value= "click to see color list"/>

<ul class="colors">
<c:forEach var="colors" items="${colorList}">
<li> <c:out value="${colors}"> </c:out></li>
</c:forEach>
</ul>


</form>


</body>
</html>