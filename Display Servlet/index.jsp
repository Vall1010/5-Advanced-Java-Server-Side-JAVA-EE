<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>TO DO</title>

<link rel="stylesheet" href="style.css">

</head>

<body>

<form class="content" action="display">

<h1> TO DO</h1>

Task Name: <Input type="text" name ="taskName"/> <br><br>
Task Description: <Input type="text" name ="taskDesc"/> <br><br>
Assignee: <Input type="text" name ="assign"/> <br><br>
Task Deadline: <Input type="text" name ="taskD"/> <br><br>

<input class="submit" type ="submit" value="Create Task"> 
</form>


</body>
</html>