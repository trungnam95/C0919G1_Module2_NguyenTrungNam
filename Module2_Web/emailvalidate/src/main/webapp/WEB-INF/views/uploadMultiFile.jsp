<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 11/17/2019
  Time: 8:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Upload One File</title>

</head>

<body>

<jsp:include page="menu.jsp"/>

<h3>Upload One File:</h3>

<!-- MyUploadForm -->

<form:form modelAttribute="myUploadForm" method="POST" action="" enctype="multipart/form-data">

    Description:

    <br>

    <form:input path="description" style="width:300px;"/>

    <br/><br/>

    File to upload: <form:input path="fileDatas" type="file"/><br />

    <input type="submit" value="Upload">

</form:form>

</body>

</html>
