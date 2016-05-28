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
  <s:text name="addstu.title"></s:text> <br>
  <a href="changeLang.action?request_locale=zh">
    <s:text name="addstu.zh"></s:text>
  </a>||
   <a href="changeLang.action?request_locale=en">
    <s:text name="addstu.en"></s:text>
  </a><br>
  <form action="studentaction_add.action" method="post" enctype="multipart/form-data">
  <s:actionerror/>
  <s:fielderror></s:fielderror>
  <s:text name="addstu.name"></s:text><input type="text" name="name"><br>
  <s:text name="addstu.birthday"></s:text><input type="text" name="birthday"><br>
  <s:text name="addstu.height"></s:text><input type="text" name="height"><br>
  <s:text name="addstu.weight"></s:text><input type="text" name="weight"><br>
  <s:text name="addstu.upload"></s:text><input type="file" name="upload"><br>
  <input type="submit" value="<s:text name="addstu.btn"></s:text>"><br>
  </form>
  </body>
</html>
