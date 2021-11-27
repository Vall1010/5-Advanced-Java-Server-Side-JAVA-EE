<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>COUNTRIES TO VISIT</title>
<link rel="stylesheet" href="style.css">

</head>


<body>

<form method="POST" action="index">

<h1>SELECT COUNTRIES TO VISIT</h1>

<input type="checkbox" name="c1" value="Cameroon">Cameroon<br/>
<input type="checkbox" name="c2" value="India">India<br/>
<input type="checkbox" name="c3" value="Canada">Canada<br/>
<input type="checkbox" name="c4" value="USA">USA<br/>
<input type="checkbox" name="c5" value="Australia">Australia<br/>
<input type="checkbox" name="c6" value="England">England<br/>
<input type="checkbox" name="c7" value="Iran">Iran<br/>
<input type="checkbox" name="c8" value="Egypt">Egypt<br/>
<input type="checkbox" name="c9" value="France">France<br/>

<input type="submit" value= "submit"/>
</form>


<h1> Selected countries: </h1>

<p>${c1}</p>
<p>${c2}</p>
<p>${c3}</p>
<p>${c4}</p>
<p>${c5}</p>
<p>${c6}</p>
<p>${c7}</p>
<p>${c8}</p>
<p>${c9}</p>


</body>
</html>