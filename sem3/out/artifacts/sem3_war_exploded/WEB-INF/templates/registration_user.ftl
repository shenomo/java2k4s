<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="/resources/css/style.css"/>
</head>

<body>
<div id="content">
    <h1>World Of Book</h1>

    <div class="registrationPage">

        <form action='/registration' method='POST' name="registration_form">
            <h4>
            <@sf.input path="email" type="text" class="form-control" id="email" placeholder="Введите почту"/>
            <@sf.errors path="email" class = "form-control alert alert-warning text-center"/>
                <div>
                <#if emailError??>
                        ${emailError}
                    </#if>
                </div>
        </form>

    </div>
</div>
</body>

</html>