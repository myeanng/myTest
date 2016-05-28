<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'myTest.jsp' starting page</title>
    
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
   <a href="myAccount-baccount">我的账户</a><br>
   <a href="addBank">addBank</a><br>
   <a href="findSafety?id=1">FindSafety</a><br>
   <a href="findAccount?id=1">FindAccount</a><br>
   <a href="upAccount?accountid=1&accountpassword=111&allmoney=4000">UpAccount</a><br>
   待收查询:<br/>
   <a href="findDuein?users.userid=1&status=1">FindMyDuein=1</a><br>
   <a href="findDuein?users.userid=1&status=2">FindMyDuein=2</a><br>
  </body>
</html>
