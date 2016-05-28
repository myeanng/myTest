<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
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
   <form action="custaction!findCust.action" method="post">
   完成客户查找功能:<hr/>
   客户编号:<input name="custId"><br>
   <input type="submit" value="查找"/>
   <s:if test="#session.cust">
   <hr/>
   编号:${cust.custId }<br/>
   姓名:${cust.custName }<br/>
   联系方式:${cust.tel }<br/>
   <a href="custaction!findOrder.action?custId=${cust.custId }">查看订单</a>
   <hr/>
   </s:if>
   <s:if test="#request.orderList">
   <hr/>
   <table>
   <tr>
   <td>订单编号</td>
   <td>订单日期</td>
   <td>订单状态</td>
   </tr>
   <s:iterator id="o" value="#request.orderList">
   <tr>
   <td>${o.orderId }</td>
   <td><s:date name="#o.orderDtm" format="yyyy年MM月dd日"/></td>
   <td>${o.state==0?"禁用":"启用" }</td>
   </tr>
   </s:iterator>
   </table>
   </s:if>
   </form>
   ${msg }
  </body>
</html>
