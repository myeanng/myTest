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
  <h2>&raquo;
  <a href="h7Action_href.action?id=0"><span>${message.type.name }</span></a>
  &raquo;
  <a href="h7Action_href.action?id=${message.id}"><span>${message.title }</span></a>
  </h2>
  <h1>房屋详细信息</h1>
    信息类型:${message.type.name }<br>
    标题:${message.title }<br>
    租金:${message.money }元/月<br>
    联系电话:${message.tel }<br>
    联系人:${message.person }<br>
    房屋信息:<p>${message.content }</p><br>
    <br>
  </body>
</html>
