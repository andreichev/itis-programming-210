<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Профиль</title>
</head>
<body>

<div class="container">

    <h1>Это профиль</h1>

    <div class="center-content">
        <div class="container">
            <div class="title">Профиль</div>
            <div id="profile" class="white-container">

        </div>

        <form id="add-post-form" action="/add-post" method="post">
            <label>
                Ваша запись:
                <textarea id="content" class="input_green" required name="content"></textarea>
            </label>
            <input class="button1" value="Отправить" type="submit">
        </form>

        <div class="divider"></div>
</div>
</div>
</div>

</body>
</html>