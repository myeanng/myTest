<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <form method="post" action="personAction_add"> 
    用户名:<input name="account"><br>
    密码:<input type="password" name="password"><br/>
    确认密码:<input type="password" name="password2"><br/>
    姓名:<input type="text" name="name"/><br/>
性别:<select name="sex">
		<option value="男">男</option>
		<option value="女">女</option>
	</select><br/>
	电子邮件:<input type="text" name="email"/><br/>
	生日:<input type="text" name="birthday"/><br/>
    <input type="submit" value="注册"><a href="index.jsp">登陆</a>
    </form> 
  </body>
</html>
