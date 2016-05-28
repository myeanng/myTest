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
					<td>
						创建时间
					</td>
					<td>
						创建人
					</td>
					<td>
						投票状态
					</td>
					<td>
						投票类型
					</td>
					<td>
						编辑
					</td>
				</tr>
				
   				<c:forEach var="vote" items="${listVote }">
					<tr>
							<td>
								${vote.id }
							</td>
							<td>
								${vote.title }
							</td>
							<td>
								${vote.dateCreated }
							</td>
							<td>
								${vote.admin.name }
							</td>
							<td>
								<c:choose> 
									<c:when test="${vote.publish==0}"> 									
									开放								
									</c:when> 									
									<c:otherwise> 									
									不开放
									</c:otherwise> 								
								</c:choose> 								
							</td>
							<td>
								<c:choose> 
									<c:when test="${vote.type==0}"> 									
									单选							
									</c:when> 									
									<c:otherwise> 									
									多选
									</c:otherwise> 								
								</c:choose> 
							</td>
							<td>
								<a href="h8vote_findId.action?id=${vote.id}">编辑</a>
							</td>
						</tr>
					</c:forEach>
			</table>
  </body>
</html>
