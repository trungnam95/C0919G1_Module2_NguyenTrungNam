<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 11/11/2019
  Time: 9:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Ung Dung Chuyen Doi Tien Te</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  <body>
  <h2>Ung Dung Chuyen Doi Tien Te</h2>
  <form method="get" action="/convert">
    <label>Rate: </label><br/>
    <input type="text" name="rate" placeholder="RATE" value="22000"/><br/>
    <label>USD:  </label><br/>
    <input type="text" name="usd" placeholder="USD" value="1"><br/>
    <input type="submit" id="submit" value="Converter"/>
  </form>
  </body>
</html>
