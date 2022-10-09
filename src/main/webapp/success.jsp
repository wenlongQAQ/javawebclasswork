<%--
  Created by IntelliJ IDEA.
  User: 86152
  Date: 2022/10/9
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String username = (String) request.getSession().getAttribute("username");
    %>
    <%="<p> 欢迎你 : " +username +"</p>"
    %>
    <a href="">注册</a>
    <a href="quitServlet">退出</a>
    <a href="index.jsp">回到首页</a>
</body>
</html>
