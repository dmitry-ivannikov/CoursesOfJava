<%--
  Created by IntelliJ IDEA.
  User: dimas
  Date: 12.03.18
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="first.jsp"%>>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:include page="first.jsp"/>
    <%= i %>



    <%=request.getMethod()%>
    <%=session.getAttribute("")%>
    <%=response.setStatus(200)%>
    <%=application%>
    <%=config%>
</body>
</html>
