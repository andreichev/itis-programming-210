<%--
  Created by IntelliJ IDEA.
  User: andreichev
  Date: 06.12.2023
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign Up</title>
</head>
<body>

<%@include file="head.jsp" %>

<h1>SIGN UP</h1>

<form method="post">
    <label>USERNAME
        <input name="username" placeholder="PASSWORD">
    </label>
    <label>EMAIL
        <input name="email" placeholder="EMAIL">
    </label>
    <label>COURSE NAME
        <input name="courseName" placeholder="COURSE NAME">
    </label>
    <label>PASSWORD
        <input name="password" type="password" placeholder="PASSWORD">
    </label>
    <p style="color: red"><%= request.getAttribute("errorMessage") %></p>
    <input type="submit">
</form>

<p>Уже есть аккаунт?</p>
<a href="sign-in">SIGN IN</a>

</body>
</html>
