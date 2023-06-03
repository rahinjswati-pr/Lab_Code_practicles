<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- It is use to set the value for variable -->
<c:set var="n1" scope="session" value="${4}"/>
<c:set var="n2" scope="session" value="${8}"/>  
<c:out value="${n1+n2}"/>  

<c:set var="n3" scope="session" value="${'Hello'}"/>
<c:out value="${n3}"/>
</body>
</html>