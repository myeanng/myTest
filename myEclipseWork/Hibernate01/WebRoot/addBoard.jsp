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
  <h1>添加板块</h1>
    <form action="boardAction_add" method="post">
    	类别:
    <select name="category.id">
    <option value="">--请选择--</option>
    <s:iterator id="p" value="#attr.categoryList">
    <option value="<s:property value='#p.id'/>"><s:property value="#p.name"/></option>
    </s:iterator>
    </select><br>
     板块名称:<input name="name" /><br>
     描述:<textarea rows="5" cols="20" name="description"></textarea><br>
    <br>
    <input type="submit" value="添加">
    </form>
  </body>
</html>
