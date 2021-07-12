<%--
  Created by IntelliJ IDEA.
  User: 86130
  Date: 2021/7/12
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%--常用的注解--%>

    <a href="anno/testRequestParam?name=哈哈">RequestParam</a><%--之前用的是requestmapping username名字一样可以映射,现在是name--%>

    <br>

    <form action="anno/testRequestBody" method="post">
        用户姓名：<input type="text" name="username" /><br/>
        用户年龄：<input type="text" name="age" /><br/>
        <input type="submit" value="提交" />
    </form>


</body>
</html>
