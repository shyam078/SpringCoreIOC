<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="asd"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<asd:forEach var="student" items="${list}">
	${student.getId()}
	${student.getName()}
	${student.getAge()}
	</asd:forEach>
</body>
</html>