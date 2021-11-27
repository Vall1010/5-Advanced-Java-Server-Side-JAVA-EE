<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html> 
<head>
<title>Display Page</title>
<link rel="stylesheet" href="style.css">
</head>
<body> 
<div class="content">

<%  
String name=(String)session.getAttribute("un");
String email=(String)session.getAttribute("em");
String age =(String)session.getAttribute("ag"); 
String height=(String)session.getAttribute("hg");
%>

<%
out.print("<h1>Your details are as follows:</h1> </br>"); 
out.print("Your user name is: "+name+"</br></br>"); 
out.print("Your email is: "+email+"</br></br>"); 
out.print("Your age is: "+age+"</br></br>"); 
out.print("Your height is: "+height +"(cm)</br></br>"); 
%>

</div>
</body> 
</html>