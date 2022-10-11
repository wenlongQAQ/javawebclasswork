<%--
  Created by IntelliJ IDEA.
  User: 86152
  Date: 2022/10/11
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>peroson
    </title>
</head>
<body>
<%
    HttpSession session1 = request.getSession();
    Object userIdentity = session1.getAttribute("userIdentity");
    Object username = session1.getAttribute("username");
    if (username!=null){
%>
<%=
"<p> 欢迎你" + username + "</p>" + "<br> 你的操作权限为:" + userIdentity
%>
<%
}
else{
%>
<%=
"<p>请你先登录,谢谢 </p>"
%>
<%
    }
%>
<a href="login.jsp">登录</a>
<a href="">注册</a>
<a href="quitServlet">退出</a>
<a href="person.jsp">个人中心</a>
<a href="index.jsp">回到首页</a>
</body>
</html>
