<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
   <head>
      <title>LAB 2 JAVA BEAN</title>
      <link rel="stylesheet" href="style.css">
      
   </head>
   
   <body>
      
      	 <jsp:useBean id = "person" class = "beans.Person"> 
         <jsp:setProperty name = "person" property = "firstName" value = "ABEL"/>
         <jsp:setProperty name = "person" property = "lastName" value = "SILAO"/>
         <jsp:setProperty name = "person" property = "empId" value = "0001"/>
         <jsp:setProperty name = "person" property = "age" value = "35"/>
         <jsp:setProperty name = "person" property = "experience" value = "9"/>
         <jsp:setProperty name = "person" property = "height" value = "145"/>
         <jsp:setProperty name = "person" property = "weight" value = "57"/>
         </jsp:useBean>

<div class="content">
	  <h1>Details from Beans:</h1>

      <p>First Name: 
         <jsp:getProperty name = "person" property = "firstName"/>
      </p>
      
      <p>Last Name: 
         <jsp:getProperty name = "person" property = "lastName"/>
      </p>
      
      <p>Employee ID: 
         <jsp:getProperty name = "person" property = "empId"/>
      </p>
     
      
      <p>Age: 
         <jsp:getProperty name = "person" property = "age"/>
      </p>
      
      <p>Experience (Number of Years): 
         <jsp:getProperty name = "person" property = "experience"/>
      </p>

	
	 <p>Height (cm): 
         <jsp:getProperty name = "person" property = "height"/>
      </p>

	
	 <p>Weight (kg): 
         <jsp:getProperty name = "person" property = "weight"/>
      </p>

</div>
   </body>
</html>