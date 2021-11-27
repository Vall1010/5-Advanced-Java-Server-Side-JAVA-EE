<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
   <head>
      <title>EXAM BEAN</title>
      
   </head>
   
   <body>
      
      	 <jsp:useBean id = "instructors" class = "beans.Instructors"> 
         <jsp:setProperty name = "instructors" property = "firstName" value = "ABEL"/>
         <jsp:setProperty name = "instructors" property = "lastName" value = "SILAO"/>
         <jsp:setProperty name = "instructors" property = "empId" value = "0001"/>
         <jsp:setProperty name = "instructors" property = "coursesAssigned" value = "JAVA"/>
         <jsp:setProperty name = "instructors" property = "yearsOfExperience" value = "9"/>
         <jsp:setProperty name = "instructors" property = "education" value = "University Graduate"/>
         <jsp:setProperty name = "instructors" property = "laptopOS" value = "Windows"/>
         </jsp:useBean>

<div class="content">
	  <h1>Details from Beans:</h1>

      <p>First Name: 
         <jsp:getProperty name = "instructors" property = "firstName"/>
      </p>
      
      <p>Last Name: 
         <jsp:getProperty name = "instructors" property = "lastName"/>
      </p>
      
      <p>Employee ID: 
         <jsp:getProperty name = "instructors" property = "empId"/>
      </p>
     
      
      <p>Courses Assigned: <jsp:getProperty name = "instructors" property = "coursesAssigned"/>
      </p>
      
      <p>Years of Experience: 
         <jsp:getProperty name = "instructors" property = "yearsOfExperience"/>
      </p>

	
	 <p>Education: 
         <jsp:getProperty name = "instructors" property = "education"/>
      </p>

	
	 <p>Laptop OS: 
         <jsp:getProperty name = "instructors" property = "laptopOS"/>
      </p>

</div>
   </body>
</html>