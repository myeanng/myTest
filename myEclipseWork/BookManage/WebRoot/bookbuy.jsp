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
    
    <title>My JSP 'bookbuy.jsp' starting page</title>
    
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
    <form action="findaction_buy.action">
    图书编号:<input name="bookisbn"/><br>
    图书名称:<input name="bookname"/><br>
    出版社:
    <select name="publisherid">
    <option value="">--请选择--</option>
    <s:iterator id="p" value="#attr.publisherList">
    <option value="<s:property value='#p.publisherid'/>"><s:property value="#p.publishername"/></option>
    </s:iterator>
    </select>
    <br>
    类别:
    <select name="categoryid">
    <option value="">--请选择--</option>
    <s:iterator id="c" value="#attr.CategoryList">
    <option value="<s:property value='#c.categoryid'/>"><s:property value="#c.categoryname"/></option>
    </s:iterator>
    </select>
    <br>
    最远日期:<input name="zydate"/><br>
    最近日期:<input name="zjdate"/><br>
    <input type="submit" value="查询"/>
    </form>
  </body>
</html>
