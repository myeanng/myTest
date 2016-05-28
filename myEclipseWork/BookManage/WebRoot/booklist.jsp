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
  <table>
   <tr>
   <td></td>
   <td>图书编号</td>
   <td>图书名称</td>
   <td>图书描述</td>
   <td>作者</td>
   <td>售价</td>
   <td>库存</td>
   <td>状态</td>
   </tr>
   <s:iterator id="l" value="#attr.list">
   <tr>
   <td>
   <s:property value="#l.bookisbn"/>
   </td>
   <td>
   <s:property value="#l.bookname"/>
   </td>
   <td>
   <s:property value="#l.bookdesc"/>
   </td>
   <td>
   <s:property value="#l.author"/>
   </td>
    <td>
   <s:property value="#l.saleprice"/>
   </td>
   <td>
   <s:property value="#l.nownum"/>
   </td>
   <td>
   <s:property value="#l.status"/>
   </td>
   </tr>
  </s:iterator>
   </table>
  </body>
</html>
