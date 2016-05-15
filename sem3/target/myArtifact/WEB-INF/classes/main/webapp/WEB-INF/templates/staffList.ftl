<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>
<#assign sec=JspTaglibs["http://www.springframework.org/security/tags"]>

<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <link rel="stylesheet" type="text/css" href="/css/jquery-ui.css">
    <script type="application/javascript" src="/js/jquery-1.11.3.js"></script>
    <script type="application/javascript" src="/js/search.js"></script>
    <script type="text/javascript" src="/js/jquery-ui.js"></script>
</head>
<body>
<div id="content">
    <#--<form action="/searchView" method="get">-->
        <#--<input type="text" id="s" class="searchField" name="searchField" oninput="f('freshComics')"/>-->

        <#--<div id="res" style="color: #ffffff"></div>-->
        <#--<input type="submit" value="Search" class="searchField">-->
    <#--</form>-->

    <h1>World Of Flight</h1>





        <form href="/logout">
            <input type="submit" value="logout">
        </form>


        <form action="/staff/adminStaff">
            <input type="submit" value="Go to Staff Page">
        </form>
        <form action="/flight/admin">
            <input type="submit" value="Go to Flight Page">
        </form>
        <form action="/planes/addNewPlane">
            <input type="submit" value="Go to Plane Page">
        </form>




    <#list staffList as staff>
    <table class="table vehicle-features">
        <tr>
            <td>Staff identity</td>
            <td id="model">${staff.identity}</td>
        </tr>
        <tr>
            <td>Staff Login</td>
            <td id="model">${staff.login}</td>
        </tr>
        <tr>
            <td>Staff Password</td>
            <td id="model">${staff.passw}</td>
        </tr>
        <tr>
            <td>Staff Flight Identity</td>
            <td id="model">${staff.flightidentity}</td>
        </tr>
    <tr>
    </#list>

    <@sf.form action='/staff/adminStaff' method='POST' name="staff_form" modelAttribute="staffForm">

        <@sf.input path="identity" type="text" name="identity" id="identity" placeholder="Enter staff identity"/>

        <@sf.errors path="identity"/>

        <@sf.input path="login" type="text" name="login" id="login" placeholder="Enter staff login"/>

        <@sf.errors path="login"/>

        <@sf.input path="passw" type="text" name="passw" id="passw" placeholder="Enter staff password"/>

        <@sf.errors path="passw"/>

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
</body>
</html>