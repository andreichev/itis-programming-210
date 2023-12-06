<%@ page import="ru.itis.basic_web_app.dto.UserDto" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<% UserDto user = (UserDto) request.getAttribute("user"); %>

<html lang="ru">
<head>
    <title>Profile</title>
</head>

<body>

<%@include file="head.jsp" %>

<h1>Profile</h1>
<h3>username: <%= user.getUsername() %></h3>
<h3>email: <%= user.getEmail() %></h3>
<h3>coursename: <%= user.getCourseName() %></h3>

<a href="logout">LOGOUT</a>

</body>
</html>