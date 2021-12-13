<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 12/13/2021
  Time: 9:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="/tong">
    <input type="text" name="a">
    <input type="text" name="b">
    <button>tính tổng</button>
</form>
<h1>${tong}</h1>
<form action="/convert" method="post">
    <input type="text" name="a">
    <button>đổi</button>
</form>
<h1>
    ${tinh}
</h1>
<br>
<a href="/dictionary">  dictionary </a>
</body>
</html>
