<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="n1" scope="session" value="${100000}"/>  
<p> Value of n1 is: <c:out value="${n1}"/></p>  
<c:remove var="n1"/>  
<p>After Remove Value of n1 is: <c:out value="${n1}"/></p> 

</body>
</html>