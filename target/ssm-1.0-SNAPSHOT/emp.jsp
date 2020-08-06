<%@ page import="cn.qphone.ssm.pojo.Emp" %><%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/8/5
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Emp</title>
</head>
<body>
    <%
        Emp emp = (Emp)request.getAttribute("emp");
        response.getWriter().println(emp);
    %>
</body>
</html>
