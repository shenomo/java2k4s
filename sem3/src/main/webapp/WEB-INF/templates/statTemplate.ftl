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



    <div id="flight_info" style = "margin-left: 500px">

        <input type="text" name="from" id="from" placeholder="From Direction">

        <input type="text" name="to" id="to" placeholder="To Direction">

        <input type="submit" value="show" onclick="showFlights()" >

    </div>
        <table id="res" style = "margin-left: 500px">
            <tr>
                <td>From</td><td>Time from</td><td>To</td><td>Time To</td>
            </tr>
        </table>


</div>
<script src="/js/script.js"></script>
<script type="application/javascript" src="/js/jquery-1.11.3.js"></script>
<script type="text/javascript" src="/js/jquery-ui.js"></script>
</body>
</html>