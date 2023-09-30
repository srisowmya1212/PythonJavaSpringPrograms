<%@page import="java.util.ArrayList"%>
<%@page import="com.jsp.dto.Branch"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Branch</title>
<style type="text/css">
th {
	color: blue;
}
</style>
</head>
<body>
	<table border="2px" style="border-collapse: collapse;">

		<tr>
			<th>id</th>
			<th>Branchname</th>
			<th>website</th>
			<th>Email</th>
			<th>password</th>
			<th>Edit</th>
			<th>Delete</th>
	</tr>
		<%
		List<Branch> branch = (List<Branch>) request.getAttribute("keyname");
		for (Branch b : branch) {
		%>
	<tr>
			<td><%=b.getId()%></td>
			<td><%=b.getbName()%></td>
			<td><%=b.getWebsite()%></td>
			<td><%=b.getEmail()%></td>
			<td><%=b.getPassword()%></td>
			<td><a href="editbranch?id=<%=b.getId()%>">edit</td>
			<td><a href="deletebranch?id=<%=b.getId()%>">delete</td>
		</tr>
		<%
		}
		%>

	</table>

</body>
</html>