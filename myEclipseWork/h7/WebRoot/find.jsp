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
   <h1>查询房屋信息</h1>
    <form action="h7Action_findMessage.action" method="post">
    	信息类型:
    <select name="type.id">
    <option value="">--请选择--</option>
    <s:iterator id="p" value="#attr.typeList">
    <option value="<s:property value='#p.id'/>"><s:property value="#p.name"/></option>
    </s:iterator>
    </select><br>
    标题:<input name="title" /><br>
    租金:<input name="minMoney" />至<input name="maxMoney" />元/月<br>
    联系电话:<input name="tel" /><br>
    联系人:<input name="person" /><br>
    <br>
    <input type="submit" value="查询">
    </form>
  </body>
</html>
