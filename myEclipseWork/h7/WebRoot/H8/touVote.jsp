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
   <h3>
    <a href="H8/body.jsp" target="body">投票主页</a>
     &raquo;
     <a href="h8vote_findVote.action" target="body">管理投票</a>
     </h3><br>
  	<table>
				<tr>
					<td>
						投票编号
					</td>
					<td>
						投票主题
					</td>
				</tr>
				
   				<c:forEach var="vote" items="${listVote }">
					<tr>
							<td>
								${vote.id }
							</td>
							<td>
								<a href="h8vote_findIdTou.action?id=${vote.id}">${vote.title }</a>
							</td>
						</tr>
					</c:forEach>
			</table>
  </body>
</html>
