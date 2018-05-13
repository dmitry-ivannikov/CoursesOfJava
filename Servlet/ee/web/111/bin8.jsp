<%@ page import="jsp.Person8" %><%--
  Created by IntelliJ IDEA.
  User: dimas
  Date: 13.03.18
  Time: 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="person" class="Preson8"/>
    <% Person8 person1 = new Person8();%>

    <jsp:setProperty name="person" property="name" value="Dimas"/>
    <% person.setName("dimas");%>

    <jsp:getProperty name="person" property="name">
    <%= person.getName()%>









</body>
</html>
