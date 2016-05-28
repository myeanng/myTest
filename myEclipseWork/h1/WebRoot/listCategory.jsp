<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
    <c:forEach var="category" items="${categoryList }">
			<table cellspacing="0" cellpadding="0" width="100%">
				<tr>
					<th colspan="6">
						<h2>
							&raquo;
							<a href="Category_enter.action?category.id=${category.id }">${ category.name }</a>
						</h2>
					</th>
				</tr>
				<tr>
					<td width="*" colspan="2">
						论坛
					</td>
					<td style="width:5%">
						主题
					</td>
					<td style="width:5%">
						文章
					</td>
					<td style="width:40%">
						设置版主
					</td>
					<td style="width:10%">
						版主
					</td>
				</tr>
					<c:forEach var="board" items="${category.boards }">
						<td width="*" colspan="2">
								论坛
							</td>
							<td style="width:5%">
								主题
							</td>
							<td style="width:5%">
								文章
							</td>
							<td style="width:40%">
								<a href="boardAction_addAdmin.action?${boards.id}">设置版主</a>
							</td>
							<td style="width:10%">
								版主
							</td>
					</c:forEach>
					<tr>
						<td colspan="6" style="height:8px"></td>
					</tr>
			</table>
	</c:forEach>
  </body>
</html>
