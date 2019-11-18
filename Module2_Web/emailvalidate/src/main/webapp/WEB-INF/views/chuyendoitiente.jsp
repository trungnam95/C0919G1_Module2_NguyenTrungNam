<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 11/18/2019
  Time: 1:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/result">
    <a>Rate:</a>
    <input type="text" value="22000" name="rate">
    <a>USD</a>
    <input type="text" name="USD">
    <input type="submit" value="submit">
    <h1>result:${result}</h1>
</form>
</body>
</html>
