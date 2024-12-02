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
    <h2>Тебя вернули домой. <br>ПОБЕДА</h2>
    <form method="get" action="index.jsp">
        <button type="submit">Start Again</button>
    </form>
</div>

<div>
    <p>Ip address: "<%= session.getAttribute("ip") %>"</p>
    <p>Name: "<%= session.getAttribute("username") %>"</p>
    <p>games: "<%= session.getAttribute("games") %>"</p>
</div>
</body>
</html>