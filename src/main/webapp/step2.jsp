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
    <h2>Ты принял вызов. <br> Поднимаешься на мостик к капитану?</h2>
    <form method="get" action="quest">
        <button type="submit" name="answer" value="3">Подняться</button>
        <button type="submit" name="answer" value="4">Отказаться</button>
    </form>
</div>

<div>
    <p>Ip address: "<%= session.getAttribute("ip") %>"</p>
    <p>Name: "<%= session.getAttribute("username") %>"</p>
    <p>games: "<%= session.getAttribute("games") %>"</p>
</div>
</body>
</html>