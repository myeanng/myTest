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
   <form action="boardaction_addBP" method="post">
  <h1>设置版主</h1>
  <input type="hidden" name="id" value="${board.id }">
   板块名称:<input name="name" value="${board.name }"/><br>
     描述:<textarea rows="5" cols="20" name="description">${board.description }</textarea><br>
    <br>
    	版主:
    	<s:iterator id="p" value="#attr.pList">
    	<input type="checkbox" value="<s:property value='#p.id'/>" name="pid"><s:property value="#p.name"/>
    	 </s:iterator>
    <br>
    <input type="submit" value="设置">
    </form>
  </body>
</html>
