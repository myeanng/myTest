<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'top.jsp' starting page</title>
    
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
 
    用户权限: <s:if test="%{#attr.user.roleid==1}">管理员</s:if>
    <s:else>操作员</s:else>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 用户名称:${user.loginname }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 登录时间:
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 <a href="adminaction_exit.action" target="_top">退出</a>
  </body>
</html>
