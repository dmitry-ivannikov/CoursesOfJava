<%@ page import="jsp.Simple" %>
<%@ page import="java.util.Date" %>
<%--
  Created by IntelliJ IDEA.
  User: dimas
  Date: 11.03.18
  Time: 13:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<%--declaration--%>
    <%! int i = 5; %>
    <%! private void doJob(){
        System.out.println("jobing");
    } %>

<%--expression--%>
<%= "hello world"%>
<%= new Date()%>
<%--bah in string and sout--%>

<%= Simple.minus(5,3)%>

<%--scriptlet--%>
<%
    class Student{
        String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
%>

<% if(Math.random() > 5) {%>
<b>snova hello</b>
<% }%>



    Hello kozhanki iiiii

</body>
</html>
