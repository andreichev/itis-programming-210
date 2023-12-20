<#-- @ftlvariable name="errorMessage" type="java.lang.String" -->
<html lang="en">
<head>
    <title>Sign Up</title>
</head>
<body>

<#include "head.ftl">

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
    <#if errorMessage??>
      <p style="color: red">${errorMessage}</p>
    </#if>
    <input type="submit">
</form>

<p>Уже есть аккаунт?</p>
<a href="sign-in">SIGN IN</a>

</body>
</html>
