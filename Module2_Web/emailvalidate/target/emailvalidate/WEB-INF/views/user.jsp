<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 11/18/2019
  Time: 10:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>User Information</h2>
<form:form method="POST" action="/addUser">
    <table>
        <tr>
            <td><form:label path="username">User Name</form:label></td>
            <td><form:input path="username"/></td>
        </tr>
        <tr>
            <td><form:label path="password">Pass Word</form:label></td>
            <td><form:password path="password"/></td>
        </tr>
        <tr>
            <td><form:label path="address">Address</form:label></td>
            <td><form:textarea path="address" rows="5" cols="30"/></td>
        </tr>
        <tr>
            <td><form:label path="receivePaper">Subscribe Newsletter</form:label></td>
            <td><form:checkbox path="receivePaper"/></td>
        </tr>
        <tr>
            <td><form:label path="favoriteFrameworks">Favorite Web Frameworks</form:label></td>
            <td><form:checkboxes items="${webFrameworkList}" path="favoriteFrameworks"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit"/>
            </td>
        </tr>
<%--        <span>--%>
<%--   <input id="favoriteFrameworks1" name="favoriteFrameworks" type="checkbox" value="Spring MVC" checked="checked"/>--%>
<%--   <label for="favoriteFrameworks1">Spring MVC</label>--%>
<%--</span>--%>
<%--        <span>--%>
<%--   <input id="favoriteFrameworks2" name="favoriteFrameworks" type="checkbox" value="Struts 1"/>--%>
<%--   <label for="favoriteFrameworks2">Struts 1</label>--%>
<%--</span>--%>
<%--        <span>--%>
<%--   <input id="favoriteFrameworks3" name="favoriteFrameworks" type="checkbox" value="Struts 2" checked="checked"/>--%>
<%--   <label for="favoriteFrameworks3">Struts 2</label>--%>
<%--</span>--%>
<%--        <span>--%>
<%--   <input id="favoriteFrameworks4" name="favoriteFrameworks" type="checkbox" value="Apache Wicket"/>--%>
<%--   <label for="favoriteFrameworks4">Apache Wicket</label>--%>
<%--</span>--%>
        <input type="hidden" name="_favoriteFrameworks" value="on"/>
    </table>
</form:form>
</body>
</html>
