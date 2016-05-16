<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>
<#assign sec=JspTaglibs["http://www.springframework.org/security/tags"]>


<!DOCTYPE html>
<html>
<head>
    <title></title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">

</head>
<body>
<div id="content">

<#--<form action="/searchView" method="get">-->
<#--<input type="text" id="s" class="searchField" name="searchField" oninput="f('booksForAdults')"/>-->

<#--<div id="res" style="color: #ffffff"></div>-->
<#--<input type="submit" value="Search" class="searchField">-->
<#--</form>-->


    <h1>World Of Flight</h1>




    <form action="/logout">
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

    <form action="/stat">
        <input type="submit" value="Go to Stat Page">
    </form>

<#list planeList as plane>
<table class="table vehicle-features">
    <tr>
        <td>Name</td>
        <td id="model">${plane.name}</td>
    </tr>
    <tr>
        <td>Serial Number</td>
        <td id="model">${plane.serialNumber}</td>
    </tr>
    <tr>
        <td>Status</td>
        <td id="model">${plane.status}</td>
    </tr>
<tr>
</#list>

<@sf.form action='/planes/addNewPlane' method='POST' name="plane_form" modelAttribute="planeForm">

    <@sf.input path="name" type="text" name="name" id="name" placeholder="Enter planes Name"/>

    <@sf.errors path="name"/>


    <@sf.input path="serialNumber" type="text" name="serialNumber" id="serialNumber" placeholder="Enter planes Serial Number"/>

    <@sf.errors path="serialNumber"/>


    <@sf.input path="status" type="text" name="status" id="status" placeholder="Enter planes Status"/>

    <@sf.errors path="status"/>

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