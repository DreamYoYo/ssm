<%@ page import="cn.qphone.ssm.pojo.Groups" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>注册页面</title>
    </head>
    <body>
    <h1 style="color: red">${msg}</h1>
    <form method="post" action="${pageContext.request.contextPath}/user/doRegister">
        <span style="color: red">${error}</span><br>
        用户名:&nbsp&nbsp&nbsp<input type="Text" name="username" />&nbsp<span style="color: red">${errorname}</span><br>
        密码:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="password" name="password" />&nbsp<span style="color: red">${errorpass}</span><br>
        确认密码:<input type="password" name="repassword" />&nbsp<span style="color: red">${reerrorpass}</span><br>
        用户类型:
        <select name="group_id">
            <c:forEach items="${glist }" var="groups">
                <option value=${groups.id}>${groups.name}</option>
            </c:forEach>
        </select><br>
        <input type="submit" value="注册" /><a href="${pageContext.request.contextPath}/user/gotoLogin">返回</a>
    </form>
    </body>
</html>
