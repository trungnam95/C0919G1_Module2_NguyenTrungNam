<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 11/17/2019
  Time: 8:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create a new employee</title>
</head>
<body>
<h3>Welcome, Enter The Employee Details</h3>
<form action="addemployee" method="post">
    <h1>Enter Name:</h1>
    <input type="text" name="name">
    <h1>Enter ID:</h1>
    <input type="text" name="id">
    <h1>Enter Contact Number</h1>
    <input type="text" name="contactNumber"><br>
    <input type="submit" value="submit">
</form>
</body>
</html>