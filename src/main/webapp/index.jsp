<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Quest</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
        }
    </style>
</head>
<body>
<form method="get" action="createUser">
    <label for="name">Name:</label>
    <input type="text" id="name" name="username" required/>
    <button type="submit">Submit</button>
</form>
</body>
</html>
