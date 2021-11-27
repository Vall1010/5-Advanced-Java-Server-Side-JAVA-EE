<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html> 
<head>
<title>Session Page</title>
<link rel="stylesheet" href="style.css">
</head>
<body> 

<div class="content">

<% 
String username=request.getParameter("username");
String email=request.getParameter("email");
String age=request.getParameter("age");
String height =request.getParameter("height");


out.print("Welcome "+ username+ "!!");
out.print("<br/>");


session.setAttribute("un",username);
session.setAttribute("em",email);
session.setAttribute("ag",age);
session.setAttribute("hg",height);

%> 

<br/>
<a href="display.jsp">Click here to view details</a>

</div>
</body> 
</html>