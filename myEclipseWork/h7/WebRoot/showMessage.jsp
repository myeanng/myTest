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
  	<table>
				<tr>
					<td>
						类型
					</td>
					<td>
						标题
					</td>
					<td>
						价格
					</td>
					<td>
						联系人
					</td>
					<td>
						联系电话
					</td>
					<td>
						房屋详情
					</td>
				</tr>
				
   				<c:forEach var="message" items="${messageList }">
					<tr>
						<td>
							${message.type.name }
						</td>
						<td>
								${message.title }
							</td>
							<td>
								${message.money }
							</td>
							<td>
								${message.person }
							</td>
							<td>
								${message.title }
								
							</td>
							<td>
								<a href="h7Action_findMessageID.action?id=${message.id}">房屋详情</a>
							</td>
						</tr>
					</c:forEach>
			</table>
  </body>
</html>
