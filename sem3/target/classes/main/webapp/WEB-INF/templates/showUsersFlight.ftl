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
        <#--<input type="text" id="s" class="searchField" name="searchField" oninput="f('searchView')"/>-->

        <#--<div id="res" style="color: #ffffff"></div>-->
        <#--<input type="submit" value="Search" class="searchField">-->
    <#--</form>-->

    <h1>World Of Flight</h1>


        <form href="/logout">
            <input type="submit" value="logout">
        </form>

        <form action="/flight/client">
            <input type="submit" value="Go to See All Flights">
        </form>

    <#if flight??>
    <table class="table vehicle-features">
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
    </#if>



</div>
</body>
</html>