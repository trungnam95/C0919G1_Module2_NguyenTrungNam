<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 11/17/2019
  Time: 4:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Simple Caculator</h1>
<form action="/" method="post">
    <input type="text" name="leftOperand">
                <select class="form-control" name="operator">
                    <option value="+" th:selected="${operator.equals('+')}">+</option>
                    <option value="-" th:selected="${operator.equals('-')}">-</option>
                    <option value="*" th:selected="${operator.equals('*')}">*</option>
                    <option value="/" th:selected="${operator.equals('/')}">/</option>
                    <option value="^" th:selected="${operator.equals('^')}">^</option>
                </select>
    <input type="text" name="rightOperand">
    <input type="submit" value="result">
</form>
</body>
</html>
