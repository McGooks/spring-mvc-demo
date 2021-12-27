<%--
  Created by IntelliJ IDEA.
  User: glenn
  Date: 27/12/2021
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/css/my-test.css">
    <title>Spring form result</title>
</head>
<body>
Hello World of Spring
<br><br>
Student Name: ${param.studentName}
<br><br>
The message: ${message}
<div>
<a href="/">Click here to go back</a>
</div>
</body>
</html>
