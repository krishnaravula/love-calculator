<%--
  Created by IntelliJ IDEA.
  User: saikr
  Date: 10/2/2022
  Time: 7:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Email Page</title>
</head>
<body>
<h1>Hi</h1>
<form:form action="process-email" method="get" modelAttribute="emailDTO">
    <label>Enter your Email</label>
    <form:input path="userEmail"/>
    <br>
    <input type="submit" value="Send">


</form:form>

</body>
</html>
