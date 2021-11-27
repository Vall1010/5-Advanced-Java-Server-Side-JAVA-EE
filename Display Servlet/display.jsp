<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Page</title>
<link rel="stylesheet" href="style.css">
</head>
<body>


<p>You created task: </p> <c:out value="${tn} "> </c:out>
<p>Task Description: </p> <c:out value="${tDsc} "> </c:out>
<p>And assigned to: </p> <c:out value="${assign} "> </c:out>

</body>
</html>