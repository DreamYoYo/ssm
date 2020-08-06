<%@ page import="cn.qphone.ssm.pojo.Groups" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>修改页面</title>
    </head>
    <body>
    <form method="post" action="${pageContext.request.contextPath}/user/update">
        <input type="hidden" name="id" value="${user.id}" />
        用户名:&nbsp&nbsp&nbsp<input type="Text" name="username" value="${user.username}"/>&nbsp<span style="color: red">${errorname}</span><br>
        密码:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="password" value="${user.password}"/>&nbsp<span style="color: red">${errorpass}</span><br>
        用户类型:
        <select name="group_id">
            <c:forEach items="${glist }" var="groups">
                <option value=${groups.id}>${groups.name}</option>
            </c:forEach>
        </select><br>
        <input type="submit" value="修改" />
    </form>
    </body>
</html>
