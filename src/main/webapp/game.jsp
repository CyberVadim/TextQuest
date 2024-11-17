<%--
  Created by IntelliJ IDEA.
  User: vprot
  Date: 17.11.2024
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Текстовый Квест</title>
</head>
<body>
<h1>${sessionScope.gameStatus}</h1>
<h3>Сыграно игр: ${sessionScope.gamesPlayed}</h3>
<form action="game" method="get">
    <button type="submit" name="action" value="startNew">Начать новую игру</button>
    <button type="submit" name="action" value="quit">Сдаться</button>
</form>
</body>
</html>
