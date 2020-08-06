<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <title>我是主页面</title>
    </head>
    <body>
        <div>欢迎你，${user.username }</div>
        <div>
            <table border="1" width="800">
                <tr>
                    <th>用户名称</th>
                    <th>用户密码</th>
                    <th>用户组id</th>
                    <th>操作</th>
                </tr>
                <c:forEach items="${ulist }" var="u">
                    <tr>
                        <td>${u.username }</td>
                        <td>${u.password }</td>
                        <td>${u.group_id }</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/user/deleteUser?id=${u.id}">删除</a>&nbsp
                            <a href="${pageContext.request.contextPath}/user/editUser?id=${u.id}">修改</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
