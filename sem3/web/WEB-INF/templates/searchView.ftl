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
    <form action="/searchView" method="get">
        <input type="text" id="s" class="searchField" name="searchField" oninput="f('searchView')"/>

        <div id="res" style="color: #ffffff"></div>
        <input type="submit" value="Search" class="searchField">
    </form>

    <h1>World Of Book</h1>
    <div class="buttons">
        <p>
        <form action="/homePage" method="get">
            <button class="button">Home</button>
        </form>
        <form action="/booksForKids" method="get">
            <button class="button">Books For Kids</button>
        </form>
        <form action="/freshComics" method="get">
            <button class="button">Fresh Comics</button>
        </form>
        <form action="/classicComics" method="get">
            <button class="button">Classic Comics</button>
        </form>
        <form action="/booksForAdults" method="get">
            <button class="button">Books for Adults</button>
        </form>
        <form action="/logout" method="get">
            <button class="button">SIGN OUT</button>
        </form>
        <p>
    </div>

    <table class="showClass">
        <tr>
            <td class="bottom">
                <img src=${ad2} width=200px height=300px>
            </td>
            <td>
                <p>${ad0}</p><br>
                <p>${ad1}</p>
            </td>
    </table>

</div>
</body>
</html>