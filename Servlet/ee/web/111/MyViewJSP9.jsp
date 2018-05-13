<%@ page import="jsp.StudentJSP9" %><%--
  Created by IntelliJ IDEA.
  User: dimas
  Date: 13.03.18
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%--<%= ((StudentJSP9)request.getAttribute("Student")).getName()%>--%>
    <%--<jsp:useBean id="Student" class="jsp.StudentJSP9" scope="request"/>--%>
    <%--<jsp:useBean id="Student" class="jsp.StudentJSP9" scope="session"/>--%>
    <%--<jsp:useBean id="Student" class="jsp.StudentJSP9" scope="application"/>--%>


    <%--${stud.name}--%>
    <%--${stud["name"]}--%>
    <%--${requestScope.stud.name}--%>
    <%--${sessionScope.stud.name}--%>
    <%--${applicationScope.stud.name}--%>

    ${list[1]}
    ${map["one"]}
    ${map.two}
    ${1 + 2 * 3 / 2}
    ${map.two > 2}
    ${map.two != 1 ? "one" : "two"}
    <jsp:setProperty name="stud" property="name" value="${Sen}.${Dimas}"/>

    <%--behnut text--%>
    \${1,2,3}

    выключить expression language
    <%--<%@ page isELIgnored="true" %>--%>

</body>
</html>
