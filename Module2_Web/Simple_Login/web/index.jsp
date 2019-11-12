<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 11/11/2019
  Time: 8:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <STYLE type="text/css">
    .login{
      height: 180px;width: 300px;
      margin: 0;
      padding: 10px;
      border: 1px #CCC solid;
    }
    .login input{
      padding: 5px;margin: 5px;
    }
  </STYLE>
  <body>
  <form method="post" action="/login">
    <div class="login">
      <h2>Login</h2>
      <input type="text" name="userName" size="30" placeholder="username"/>
      <input type="password" name="passWord" size="30" placeholder="password">
      <input type="submit" value="Sign in">
    </div>
  </form>
  </body>
</html>
