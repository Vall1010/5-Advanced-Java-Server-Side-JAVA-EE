<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html> 
<head>
<title>Display Page</title>

</head>
<body> 


<%  
String uname=(String)session.getAttribute("un");
String email=(String)session.getAttribute("em");
String age =(String)session.getAttribute("ag"); 
String height=(String)session.getAttribute("hg");
%>

<%
out.print("<h1>DISPLAY PAGE</h1> </br>"); 
out.print("USER NAME: "+uname+"</br></br>"); 
out.print("EMAIL: "+email+"</br></br>"); 
out.print("AGE: "+age+"</br></br>"); 
out.print("HEIGHT: "+height +"</br></br>"); 
%>


</body> 
</html>