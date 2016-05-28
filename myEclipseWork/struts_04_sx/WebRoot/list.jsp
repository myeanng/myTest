<%@ page language="java" import="java.util.*,com.sx4.entity.*,java.util.List.*" pageEncoding="utf-8"%>
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
   <table>
   <caption>图书列表</caption>
   <tr>
   <td>ISBN</td>
   <td>图书名称</td>
   <td>图书作者</td>
   <td>出版社</td>
   <td>售价</td>
   <td>库存</td>
   </tr>
  <s:iterator id="b" value="#attr.booklist" status="status" >
  <s:if test="#status.even">
  	<tr bgcolor="red">
  </s:if>
  <s:else>
  	<tr>
  </s:else>
   <td>
  <s:property value="ISBN"/>
   </td>
   <td>
   <s:property value="name"/>
   </td>
   <td>
    <s:property value="author"/>
   </td>
   <td>
   <s:property value="publish"/>
   </td>
   <td>
   <s:property value="price"/>
   </td>
   <td>
   <s:property value="currcount"/>
   </td>
   </tr>
   </s:iterator>
   </table>
  </body>
  <script type="text/javascript">
  </script>
</html>
