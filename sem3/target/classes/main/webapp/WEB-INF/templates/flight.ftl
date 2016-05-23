<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>
<#assign sec=JspTaglibs["http://www.springframework.org/security/tags"]>


<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <link rel="stylesheet" type="text/css" href="/css/jquery-ui.css">
</head>
<body>
<div id="content">

    <h1>World Of Flight</h1>



    <form href="/logout" style = "margin-left: 500px">
        <input type="submit" value="logout">
    </form>
    <form action="/stat" style = "margin-left: 500px">
        <input type="submit" value="Go to Stat Page">
    </form>
    <form action="/flight/showUser" style = "margin-left: 500px">
        <input type="submit" value="Go to See Your Flight">
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
        <td>To Direction</td>
        <td id="model">${flight.identity}</td>
    </tr>

</table>
</#list>


<@sf.form action='/flight/client' method='POST' name="flight_form" modelAttribute="flightForm" style = "margin-left: 500px">


    <@sf.input path="identity" type="text" name="identity" id="identity" placeholder="Enter your Flight Identity"/>

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