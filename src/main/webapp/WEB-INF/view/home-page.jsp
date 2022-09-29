<%--
  Created by IntelliJ IDEA.
  User: saikr
  Date: 9/29/2022
  Time: 11:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<h1 align="center"> Love Calulator</h1>
<form action="process-homepage" method="get">
<div align="center">
<p>
<label for="yn">Yor Name:</label>
<input type="text" id="yn" name="userName">
</p>
<p>
    <label for="cn">Crush Name:</label>
    <input type="text" id="cn" name="crushName">
</p>
<input type="submit" value="Calculate">
</div>
</form>
</body>
</html>
