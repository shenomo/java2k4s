<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="/resources/css/style.css">
    <link rel="stylesheet" type="text/css" href="/resources/css/jquery-ui.css">
</head>
<body>
<div id="content">
    <form action="/searchView" method="get">
        <input type="text" id="s" class="searchField" name="searchField" oninput="f('classicComics')"/>

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
        </tr>
        <tr>
            <td>
                <img src=${ad5} width=200px height=300px>
            </td>
            <td><p>${ad3}</p><br>

                <p>${ad4}</p></td>
        </tr>
        <tr>
            <td>
                <img src=${ad8} width=200px height=300px>
            </td>
            <td><p>${ad6}</p><br>

                <p>${ad7}</p></td>
        </tr>
    </table>
</div>
</body>
</html>