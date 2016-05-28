<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'w.jsp' starting page</title>
    
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
   <form action="loginaction.action" method="post">
   <table>
   <tr>
   <td>管理员登陆</td>
   </tr>
   <tr>
   <td>登陆名称:</td>
   <td><input name="name" type="text"/></td>
   </tr>
   <tr>
   <td>登陆密码:</td>
   <td><input name="pwd" type="password"/></td>
   </tr>
   <tr>
   <td><input type="submit" name="Submit" value="登陆" /></td>
   </tr>
   </table>
   </form>
  </body>
</html>
