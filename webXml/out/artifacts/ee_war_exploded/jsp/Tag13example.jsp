<%--
  Created by IntelliJ IDEA.
  User: dimas
  Date: 01.04.18
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tag" uri="/tld/TagDiscriptor.tld"%>
<%@ taglib prefix="myTag" tagdir="/WEB-INF/tags"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<tag:MyTag name = "Dimas">dzha dzha ${one}</tag:MyTag>
<myTag:MyJspTag name = "XD">du du du
    <tag:InnerTag></tag:InnerTag>
</myTag:MyJspTag>
</body>
</html>
