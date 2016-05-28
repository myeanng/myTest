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
  	<form action="select.do" method="post">
    关键字:<input name="keywords"><br/>
    <input type="radio" name="rd" value="queryByName" checked="checked">按书名查询
    <input type="radio" name="rd" value="queryByAuthor">按作者查询
    <input type="radio" name="rd" value="queryByPublish">按出版社查询<br/>
    <input type="submit" value="查询"/>
    </form>
  </body>
</html>
