<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title></title>
    
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
 <form action="admin_add.action" method="post" name="loginForm">
   <table>
   <tr>
   <td>添加管理员</td>
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
   <td>确认密码:</td>
   <td><input name="pwd2" type="password"/></td>
   </tr>
   <tr>
   <td><input type="submit" name="Submit" value="添加" /></td>
   </tr>
   </table>
   </form>
  </body>
</html>
