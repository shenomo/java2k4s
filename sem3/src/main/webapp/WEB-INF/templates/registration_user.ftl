<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>
<#assign sec=JspTaglibs["http://www.springframework.org/security/tags"]>

<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="/resources/css/style.css"/>
</head>

<body>
<div id="content">
    <h1>World Of Flight</h1>

    <div class="registrationPage">

    <@sf.form action='/registration' method='POST' name="registration_form" modelAttribute="userForm">

        <@sf.input path="firstName" type="text" name="firstName" id="firstName" placeholder="Enter your First Name"/>

        <@sf.errors path="firstName"/>


        <@sf.input path="lastName" type="text" name="lastName" id="lastName" placeholder="Enter your Last Name"/>

        <@sf.errors path="lastName"/>



        <@sf.input path="email" type="text" name="email" id="email" placeholder="Enter your Login"/>

        <@sf.errors path="email"/>


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