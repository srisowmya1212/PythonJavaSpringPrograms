<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="saveperson"  modelAttribute="person">
  Id <form:input path="id"/><br>
  name <form:input path="name"/><br>
  Email <form:input path="email"/><br>
  Password<form:input path="password"/><br>

 <input type="submit">
</form:form>

</body>
</html>