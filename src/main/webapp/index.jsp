<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<%
    HttpSession session1 = request.getSession();
    Object username = session1.getAttribute("username");
    if (username!=null){
%>
<%=
    "<p> 欢迎你" + username + "</p>"
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
<a href="login.html">登录</a>
<a href="">注册</a>
<a href="quitServlet">退出</a>
<a href="index.jsp">回到首页</a>
</body>
</html>
