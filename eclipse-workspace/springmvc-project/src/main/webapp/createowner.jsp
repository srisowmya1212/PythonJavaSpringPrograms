<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Owner form</title>
</head>
<body>
 <form:form action="saveOwner" modelAttribute="owner">
 
 Id<form:input path="id"/><br>
 Email<form:input path="email"/><br>
 Password<form:input path="password"/><br>
 
 <input type="submit">
 
 
 </form:form>

</body>
</html>