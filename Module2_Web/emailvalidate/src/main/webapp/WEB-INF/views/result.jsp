<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 11/18/2019
  Time: 10:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
    <title>Sandwich</title>
</head>
<body>

<h2>Submitted Sandwich</h2>
<table>
    <tr>
        <td>Favorite Sandwich with</td>
        <td> <% String[] checksandwich = (String[])request.getAttribute("abc");
            for(String check: checksandwich) {
                out.println(check);
            }
        %></td>
    </tr>
</table>
</body>
</html>