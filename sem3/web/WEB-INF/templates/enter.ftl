<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="/resources/css/style.css"/>
</head>
<body>
<div id="content">
    <h1>World Of Book</h1>

    <div class="registrationPage">

        <form action="${enter_url}" method="post">
            <p><label><input type="text" name="nickname">nickname</label><br>

            <p><label><input type="password" name="password">password</label><br>

            <p><input type="submit" value="sig in">
        </form>

        <form action="${registration_url}" method="get">
            <p><input type="submit" value="registration">
        </form>

    </div>

</div>
</body>
</html>