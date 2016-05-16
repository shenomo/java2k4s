<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>
<#assign sec=JspTaglibs["http://www.springframework.org/security/tags"]>


<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="/css/style.css"/>
</head>
<body>
<div id="content">
    <h1>World Of Flight</h1>

    <div class="registrationPage">

    <@sf.form action='/login/process' method='POST' name="enter_form" modelAttribute="enterForm" style = "margin-left: 500px">

            <@sf.input path="login" type="text" name="login" id="login" placeholder="Enter your login"/>

            <@sf.errors path="login"/>


            <@sf.input path="password" type="text" name="password" id="password" placeholder="Enter your password"/>

            <@sf.errors path="password"/>

        <div>
            <input type="submit" value="Enter">
            <input type="reset" value="Clear Area">
            <#--<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>-->
        </div>


    </@sf.form>



    <#if message?has_content>
        <p class="message">${message}</p>
    </#if>

    </div>

</div>
</body>
</html>