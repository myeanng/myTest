<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <script type="text/javascript" src="jquery-1.9.1.min.js"></script>
  <script type="text/javascript" src="js/easyui-lang-zh_CN.js"></script>
  <script type="text/javascript" src="js/jquery.easyui.min.js"></script>
  <link rel="stylesheet" href="js/themes/default/easyui.css" type="text/css"></link>
  <link rel="stylesheet" href="js/themes/icon.css" type="text/css"></link>
    <base href="<%=basePath%>">
    
    <title></title>
  
  
  </head>
  
  <body>
  	<div id="cc" class="easyui-layout" style="width:600px;height:400px;" data-options="fit:true">      
	    <div data-options="region:'north'" style="height:50px;"><h3>小系统</h3></div>
	    <div data-options="region:'south'" style="height:100px;"></div>
	    <div data-options="region:'west',title:'West',split:true" style="width:150px;">
		    <ul id="tt" class="easyui-tree">
			</ul>  
	    
	    </div>   
	    <div data-options="region:'center',title:'center title'" style="padding:5px;background:#eee;"></div>   
	</div>  
  
     <br>
  </body>
</html>
