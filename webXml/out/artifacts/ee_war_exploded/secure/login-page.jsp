<%--
  Created by IntelliJ IDEA.
  User: dimas
  Date: 26.03.18
  Time: 22:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action = "j_security_check" method = "post">
        Username: <input type="text" name="j_username"/><br/>
        Password <input type="password" name="j_password"/><br/>
        <input type="submit" value="login"/>
</body>
</html>
