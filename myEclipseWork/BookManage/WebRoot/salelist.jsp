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
   <td>出货时间</td>
   <td>出货数量</td>
   <td>出货总价</td>
   <td>操作员</td>
   </tr>
   <s:iterator id="l" value="#attr.list">
   <tr>
   <td>
   <s:property value="#l.bookisbn"/>
   </td>
   <td>
   <s:property value="#l.saledate"/>
   </td>
   <td>
   <s:property value="#l.salenum"/>
   </td>
   <td>
   <s:property value="#l.allprice"/>
   </td>
   <td>
   <s:property value="#l.operator"/>
   </td>
   </tr>
  </s:iterator>
   </table>
  </body>
</html>
