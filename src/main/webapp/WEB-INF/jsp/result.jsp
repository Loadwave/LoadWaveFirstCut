<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Getting Started: Handling Form Submission</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
	<h1>Result</h1>
    <p th:text="'id: ' + ${user.userId}" />
    <p th:text="'Name: ' + ${user.userName}" />
    <a href="http://localhost:8080/userForm">Submit another message</a>
</body>
</html>