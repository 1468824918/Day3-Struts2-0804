<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 17/10/25
  Time: 上午9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="/xml/login.action" method="post">
    用户名:<input type="text" name="username"><br>
    密码:<input type="password" name="password"><br>
    身份证<input type="text" name="idcard"><br>
    <input type="submit" value="提交">
    <input type="reset" value="重置">

    <s:fielderror/><br>
    <%--<s:actionerror/>--%>
</form>

<a href="register.action">注册</a>
<a href="/xml/findAll.action">查询</a>
</body>
</html>
