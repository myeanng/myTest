<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%@ taglib prefix="s" uri="/struts-tags"  %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<sx:head parseContent="true"/>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'tree.jsp' starting page</title>
    
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
  <%/*
  Object[][] obj={
				{"1","0","短信平台管理","#"},
				{"2","1","员工管理","#"},
				{"3","1","短信管理","#"},
				{"4","1","用户权限管理","#"},
				{"5","2","用户列表","hei.jsp"},
				{"6","2","员工信息列表","hei.jsp"},
				{"7","3","员工信息修改","hei.jsp"},
				{"8","3","接收短信","hei.jsp"},
				{"9","4","短信通缉","hei.jsp"},
				{"10","4","嘿嘿","hei.jsp"},
		};
		request.setAttribute("objarray", obj);
   */%>
    <sx:tree label="短信管理平台">
    	<s:iterator id="row" value="#request.objarray">
    		<s:if test="#row[1]==1">
    			<sx:treenode label="%{#row[2]}">
    				<s:iterator id="row1" value="#request.objarray">
			    		<s:if test="#row1[1]==#row[0]">
			    			<sx:treenode label="<a href=%{#row1[3]}>%{#row1[2]}</a>">
			    			</sx:treenode>
			    		</s:if>
			    	</s:iterator>
    			</sx:treenode>
    		</s:if>
    	</s:iterator>
    </sx:tree>
  </body>
</html>
