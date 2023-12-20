<#-- @ftlvariable name="user" type="ru.itis.basic_web_app.dto.UserDto" -->
<html lang="ru">
<head>
    <title>Profile</title>
</head>

<body>

<#include "head.ftl">

<h1>Profile</h1>
<h3>username: ${user.username}</h3>
<h3>email: ${user.email}</h3>
<h3>coursename: ${user.courseName}</h3>

<a href="logout">LOGOUT</a>

</body>
</html>