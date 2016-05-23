<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>
<#assign sec=JspTaglibs["http://www.springframework.org/security/tags"]>

<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="/css/style.css"/>
</head>

<body>
<div id="content">
    <h1>World Of Flight</h1>

    <div class="registrationPage">

    <@sf.form action='/registration/staff' method='POST' name="registration_form" modelAttribute="staffForm" style = "margin-left: 500px">

        <@sf.input path="identity" type="text" name="identity" id="identity" placeholder="Enter your identity"/>

        <@sf.errors path="identity"/>


        <@sf.input path="login" type="text" name="login" id="login" placeholder="Enter your Login"/>

        <@sf.errors path="login"/>


        <@sf.input path="passw" type="text" name="passw" id="passw" placeholder="Enter your Password"/>

        <@sf.errors path="passw"/>

        <div>
            <input type="submit" value="Registration">
            <input type="reset" value="Clear Area">
        </div>



    </@sf.form>


    </div>
</div>
</body>

</html>