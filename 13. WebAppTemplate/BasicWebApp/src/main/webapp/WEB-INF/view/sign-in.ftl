<#-- @ftlvariable name="errorMessage" type="java.lang.String" -->
<html lang="en">
<head>
    <title>Sign in</title>
</head>
<body>

<#include "head.ftl">

<h1>SIGN IN</h1>

<form method="post">
    <label>USERNAME
        <input name="username" placeholder="PASSWORD">
    </label>
    <label>PASSWORD
        <input name="password" type="password" placeholder="PASSWORD">
    </label>
    <#if errorMessage??>
        <p style="color: red">${errorMessage}</p>
    </#if>
    <input type="submit">
</form>

<p>Нет аккаунта?</p>
<a href="sign-up">SIGN UP</a>

</body>
</html>
