<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Вход</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<h1>Регистрация</h1>
<form method="post">
    <div>NAME</div>
    <input class="input-field" type="text" name="username">
    <div>PASSWORD</div>
    <input class="input-field" type="password" name="password">
    <#if errorMessage??>
        <div style="color: red">${errorMessage}</div>
    </#if>
    <input type="submit">
</form>
</body>
</html>