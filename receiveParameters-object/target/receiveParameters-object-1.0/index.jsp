<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <p>第一个springmvc项目</p>
        <form action="test/register.do" method="post">
                姓名:<input type="text" name="name"/><br/>
                年龄:<input type="text" name="age"/><br/>
                <input type="submit" value="注册"/>
        </form><br>
        注册2
        <form action="test/register2.do" method="post">
                姓名:<input type="text" name="name"/><br/>
                年龄:<input type="text" name="age"/><br/>
                <input type="submit" value="注册"/>
        </form>
</body>
</html>
