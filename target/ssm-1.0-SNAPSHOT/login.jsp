<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>登录页面</title>
    </head>
    <body>
        <h1 style="color: black">${msg}</h1>
        <form method="post" action="${pageContext.request.contextPath}/user/doLogin">
            <span style="color: red">${error}</span><br>
            用户名:<input type="Text" name="username" />&nbsp<span style="color: red">${errorname}</span><br>
            密码:&nbsp&nbsp&nbsp<input type="password" name="password" />&nbsp<span style="color: red">${errorpass}</span><br>
            <input type="submit" value="登录" /><a href="${pageContext.request.contextPath}/user/gotoRegister">注册</a>
        </form>
    </body>
</html>
