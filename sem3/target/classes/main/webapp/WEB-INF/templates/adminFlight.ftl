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
<#--<input type="text" id="s" class="searchField" name="searchField" oninput="f('booksForKids')"/>-->

<#--<div id="res" style="color: #ffffff"></div>-->
<#--<input type="submit" value="Search" class="searchField">-->
<#--</form>-->



    <h1>World Of Flight</h1>


    <form href="/logout" style = "margin-left: 500px">
        <input type="submit" value="logout">
    </form>

    <form action="/staff/adminStaff" style = "margin-left: 500px">
        <input type="submit" value="Go to Staff Page">
    </form>
    <form action="/flight/admin" style = "margin-left: 500px">
        <input type="submit" value="Go to Flight Page">
    </form>
    <form action="/planes/addNewPlane" style = "margin-left: 500px">
        <input type="submit" value="Go to Plane Page">
    </form>
    <form action="/stat" style = "margin-left: 500px">
        <input type="submit" value="Go to Stat Page">
    </form>


<#list flightList as flight>
<table class="table vehicle-features" style = "margin-left: 500px">
    <tr>
        <td>Departure Time</td>
        <td id="model">${flight.departureTime}</td>
    </tr>
    <tr>
        <td>Arriving Time</td>
        <td id="model">${flight.arrivingTime}</td>
    </tr>
    <tr>
        <td>From Direction</td>
        <td id="model">${flight.fromDirection}</td>
    </tr>
    <tr>
        <td>To Direction</td>
        <td id="model">${flight.toDirection}</td>
    </tr>
    <tr>
        <td>Identity</td>
        <td id="model">${flight.identity}</td>
    </tr>
</table>
</#list>


<@sf.form action='/flight/admin' method='POST' name="flight_form" modelAttribute="flightForm" style = "margin-left: 500px">

    <@sf.input path="departureTime" type="text" name="departureTime" id="departureTime" placeholder="Enter your Departure Time"/>

    <@sf.errors path="departureTime"/>

    <@sf.input path="arrivingTime" type="text" name="arrivingTime" id="arrivingTime" placeholder="Enter your Arriving Time"/>

    <@sf.errors path="arrivingTime"/>

    <@sf.input path="fromDirection" type="text" name="fromDirection" id="fromDirection" placeholder="Enter your From Direction"/>

    <@sf.errors path="fromDirection"/>

    <@sf.input path="toDirection" type="text" name="toDirection" id="toDirection" placeholder="Enter your To Direction"/>

    <@sf.errors path="toDirection"/>

    <@sf.input path="identity" type="text" name="identity" id="identity" placeholder="Enter your Identity"/>

    <@sf.errors path="identity"/>

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