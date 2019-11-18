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

<h2>Sandwich Information</h2>
<form:form method="POST" action="/addsandwich">
    <table>
        <tr>
            <td>Favorite Sanwich With</td>
            <td><form:checkboxes items="${webFrameworkList}" path="checksandwich"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
