<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register hospital</title>
</head>
<body>
<form:form action="savehospital" modelAttribute="hospital">
 Id: <form:input path="id"/>
 Name: <form:input path="name"/>
Website: <form:input path="website"/>
<form:button>Register</form:button>
</form:form>


</body>
</html>