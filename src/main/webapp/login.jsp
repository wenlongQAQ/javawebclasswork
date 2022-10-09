<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>Title</title>
</head>
<body>

<form action="loginServlet" method="post">
  用户名:<input type="text" name="username"></br>
  密码:<input type="password" name="userpassword"><br>
  <input type="submit" value="登录">
    <%
        Object loginCode = request.getSession().getAttribute("loginCode");
        if ("error".equals(loginCode)){
    %>
    <%=
    "<br/> 账号或密码错误请重试"
    %>
    <%
        }else {

        }
    %>
</form>


</body>
</html>