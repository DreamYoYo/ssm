<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>form</title>
    </head>
    <body>
        <%--
         method:表单的提交方式：get/post
         action:表单数据提交地址
         --%>
        <form method="post" action="table.jsp">
            username:<input type="Text" name="username" value="程志远" /><br>
            password:<input type="password" name="password" value="123456" /><br>
            gender:
                  女 <input type="Radio" name="gender" value="female" align="MIDDLE" checked />
                  男 <input type="Radio" name="gender" value="male" align="MIDDLE" /><br>
            loves :
                篮球:<input type="Checkbox" name="love" value="basketball" align="RIGHT" />
                足球:<input type="Checkbox" name="love" value="football" align="RIGHT" />
                乒乓球:<input type="Checkbox" name="love" value="pingpang" align="RIGHT" /><br>
            出生年月：
            <select name="year" multiple>
                <option value="2020">2020</option>
                <option value="2019">2019</option>
                <option value="2018">2018</option>
                <option value="2017">2017</option>
                <option value="2016">2016</option>
            </select><br>
            <input type="submit" value="提交" />
        </form>
    </body>
</html>
