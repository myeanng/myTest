<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
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
    <h3>
    <a href="H8/body.jsp" target="body">投票主页</a>
     &raquo;
     <a href="H8/updatePwd.jsp" target="body">修改密码</a>
    </h3><br>
    <form method="post" action="h8admin_updatePwd.action"> 
		   旧 密码:<input type="password" name="pwd"><br/><br>
		  新 密码:<input type="password" name="newpwd"><br/><br>
		    确认密码:<input type="password" name="newpwd2"><br/><br>
    <input type="submit" value="确认修改">
    </form> 
  </body>
</html>
