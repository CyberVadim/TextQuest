<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Quest</title>
    <style>
        body {
            height: 100vh;
            display: flex;
            justify-content: space-between;
            flex-direction: column;
        }
    </style>
</head>
<body>

<div>
    <h2>Ты поднялся на мостик. <br> Ты кто?</h2>
    <form method="get" action="quest">
        <button type="submit" name="answer" value="5">Рассказать правду</button>
        <button type="submit" name="answer" value="6">Солгать</button>
    </form>
</div>

<div>
    <p>Ip address: "<%= session.getAttribute("ip") %>"</p>
    <p>Name: "<%= session.getAttribute("username") %>"</p>
    <p>games: "<%= session.getAttribute("games") %>"</p>
</div>
</body>
</html>