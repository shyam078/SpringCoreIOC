<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>	
<body>
<a href="loademployee"> create Employee</a>
	<table border="2px" style="border-collapse: collapse;">
		<tr>
			<th>id</th>
			<th>name</th>
			<th>age</th>
			<th>place</th>
			<th>email</th>
			<th>edit</th>
			<th>delete</th>
		</tr>
		<c:forEach var="e" items="${liste}">
		<tr>
			<td>${e.getId()}</td>
			<td>${e.getName()}</td>
			<td>${e.getAge()}</td>
			<td>${e.getPlace()}</td>
			<td>${e.getEmail()}</td>
			<td><a href="editbyid?id=${e.getId()}">edit</a></td>
			<td><a href="deletebyid?id=${e.getId()}">delete</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>