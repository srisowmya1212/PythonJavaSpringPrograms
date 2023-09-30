<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="updatebranch">
		<%
		List<Branch> branch = (List<Branch>) request.getAttribute("keyname");
		for (Branch b : branch) {
		%>

		Id:<input type="number" name="id"> 
		Branch Name<input type="text" name="bname" value="<%=b.getbName()%>"> 
		Website<input type="text" name="website" value=""> 
		Email<input type="email" name="email">
	     Password<input type="password" name="password">
		<input type="submit" value="update">
	</form>

</body>
</html>