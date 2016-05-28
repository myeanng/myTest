<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
   <title>Bootstrap响应式后台管理系统模板</title>	
	<meta name="keywords" content="Bootstrap模版,Bootstrap模版下载,Bootstrap后台模版,Bootstrap教程,Bootstrap中文,后台管理系统模版,后台模版下载,后台管理系统,后台管理模版" />
	<meta name="description" content="JS代码网提供Bootstrap模版,后台管理系统模版,后台管理界面,Bootstrap后台模版,Bootstrap教程,Bootstrap中文翻译等相关Bootstrap插件下载" />
	<meta charset="utf-8">	
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
	<meta name="apple-mobile-web-app-capable" content="yes">

	<link rel="stylesheet" href="./background/css/font-awesome.css">
	
	<link rel="stylesheet" href="./background/css/bootstrap.css">
	<link rel="stylesheet" href="./background/css/bootstrap-responsive.css">

	<link rel="stylesheet" href="./background/css/ui-lightness/jquery-ui-1.8.21.custom.css">	
	
	<link rel="stylesheet" href="./background/css/application.css">
	<link rel="stylesheet" href="./background/css/pages/dashboard.css">

	<script src="./background/js/libs/modernizr-2.5.3.min.js"></script>

</head>

<body>
	
<div id="wrapper">
	
<div id="topbar">
	
	<div class="container">
		
		<a href="javascript:;" id="menu-trigger" class="dropdown-toggle" data-toggle="dropdown" data-target="#">
			<i class="icon-cog"></i>
		</a>
	
		<div id="top-nav">
			
			<ul>
				<li class="dropdown">
					<a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown">
						查看网站				
						<b class="caret"></b>
					</a>
					
					<ul class="dropdown-menu pull-right">
						<li><a href="javascript:;">查看网站1</a></li>
						<li><a href="javascript:;">查看网站2</a></li>
						<li class="dropdown-submenu">
		                  <a tabindex="-1" href="#">下拉菜单</a>
		                  <ul class="dropdown-menu">
		                    <li><a tabindex="-1" href="#">菜单1</a></li>
		                    <li><a tabindex="-1" href="#">菜单2</a></li>
		                    <li><a tabindex="-1" href="#">菜单3</a></li>
		                  </ul>
		                </li>
					</ul> 
				</li>
			</ul>
			
			<ul class="pull-right">
				<li><a href="javascript:;"><i class="icon-user"></i>${admin.account},欢迎您！</a></li>
				<li><a href="javascript:;"><span class="badge badge-primary">0</span> 新消息</a></li>
				<li class="dropdown">
					<a href="./pages/settings.html" class="dropdown-toggle" data-toggle="dropdown">
						设置						
						<b class="caret"></b>
					</a>
					
					<ul class="dropdown-menu pull-right">
						<li><a href="javascript:;">设置 #1</a></li>
						<li><a href="javascript:;">设置 #2</a></li>
						<li class="dropdown-submenu">
		                  <a tabindex="-1" href="#">下拉菜单</a>
		                  <ul class="dropdown-menu">
		                    <li><a tabindex="-1" href="#">菜单1</a></li>
		                    <li><a tabindex="-1" href="#">菜单2</a></li>
		                    <li><a tabindex="-1" href="#">菜单3</a></li>
		                  </ul>
		                </li>
					</ul> 
				</li>
				<li><a href="login.html">退出</a></li>
			</ul>
			
		</div> <!-- /#top-nav -->
		
	</div> <!-- /.container -->
	
</div> <!-- /#topbar -->


	
	
<div id="header">
	
	<div class="container">
		
		<a href="./index.html" class="brand">首页</a>
		
		<a href="javascript:;" class="btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
        	<i class="icon-reorder"></i>
      	</a>
	
		<div class="nav-collapse">
			<ul id="main-nav" class="nav pull-right">
				<li class="nav-icon active">
					<a href="./background/index.jsp">
						<i class="icon-home"></i>
						<span>首页</span>        					
					</a>
				</li>
				
				<li class="dropdown">					
					<a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown">
						<i class="icon-th"></i>
						<span>用户管理</span> 
						<b class="caret"></b>
					</a>	
				
					<ul class="dropdown-menu">
						<li><a href="./background/userShow.jsp">查看用户</a></li>
						<li><a href="./validation.html">黑名单</a></li>
					</ul>    				
				</li>
				
				<li class="dropdown">					
					<a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown">
						<i class="icon-copy"></i>
						<span>项目审核</span> 
						<b class="caret"></b>
					</a>	
				
					<ul class="dropdown-menu">
						<li><a href="./faq.html">查看待审核项目</a></li>
						<li><a href="./gallery.html">查看审核未通过项目</a></li>
						<li><a href="./pricing.html">查看已通过审核融资中项目</a></li>
					</ul>    				
				</li>
				
					<li class="dropdown">					
					<a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown">
						<i class="icon-copy"></i>
						<span>项目管理</span> 
						<b class="caret"></b>
					</a>	
				
					<ul class="dropdown-menu">
						<li><a href="./faq.html">查看还款完成项目</a></li>
						<li><a href="./gallery.html">查看融资期间流标项目</a></li>
						<li><a href="./pricing.html">查看融资完成待拨款项目</a></li>
						<li><a href="./pricing.html">查看还款中的项目</a></li>
						<li><a href="./pricing.html">查看逾期还款的项目</a></li>
					</ul>    				
				</li>
				
				<li class="dropdown">					
					<a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown">
						<i class="icon-copy"></i>
						<span>站内消息管理</span> 
						<b class="caret"></b>
					</a>	
				
					<ul class="dropdown-menu">
						<li><a href="./faq.html">系统消息</a></li>
						<li><a href="./gallery.html">活动通知</a></li>
					</ul>    				
				</li>
				
				<li class="dropdown">					
					<a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown">
						<i class="icon-copy"></i>
						<span>数据统计</span> 
						<b class="caret"></b>
					</a>	
				
					<ul class="dropdown-menu">
						<li><a href="./faq.html">统计网站注册人数</a></li>
						<li><a href="./gallery.html">充值统计</a></li>
						<li><a href="./gallery.html">提现统计</a></li>
						<li><a href="./gallery.html">统计网站每日点击量</a></li>
						<li><a href="./gallery.html">访问地区统计</a></li>
						<li><a href="./gallery.html">统计网站投资金额</a></li>
						<li><a href="./gallery.html">统计网站收益</a></li>
						<li><a href="./gallery.html">统计网站投资种类</a></li>
					</ul>    				
				</li>
				
				
				
				<li class="dropdown">					
					<a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown">
						<i class="icon-external-link"></i>
						<span>其他</span> 
						<b class="caret"></b>
					</a>	
				
					<ul class="dropdown-menu">							
						<li class="dropdown-submenu">
		                  <a tabindex="-1" href="#">数据字典维护</a>
		                  <ul class="dropdown-menu">
		                    <li><a tabindex="-1" href="#">查看数据字典</a></li>
		                    <li><a tabindex="-1" href="#">添加数据字典</a></li>
		                  </ul>
		                </li>
		                
		                <li class="dropdown-submenu">
		                  <a tabindex="-1" href="#">脏字过滤</a>
		                  <ul class="dropdown-menu">
		                    <li><a tabindex="-1" href="#">查看过滤</a></li>
		                    <li><a tabindex="-1" href="#">添加过滤</a></li>
		                  </ul>
		                </li>
		                
		                <li><a href="./gallery.html">帮助中心</a></li>
					</ul> 
					
								
				</li>
			</ul>
			
		</div> <!-- /.nav-collapse -->

	</div> <!-- /.container -->
	
</div> <!-- /#header -->




<div id="masthead">
	
	<div class="container">
		
		<div class="masthead-pad">
			
			<div class="masthead-text">
				
			</div> <!-- /.masthead-text -->
			
		</div>
		
	</div> <!-- /.container -->	
	
</div> <!-- /#masthead -->




<div id="content">

	<div class="container">
		
		<div class="row">
			
			<div class="span4">
				<h3>欢迎回来, ${admin.account}.</h3>
				
				<p>You are currently signed up to the Free Trial Plan. <br /><a href="javascript:;">Upgrade your plan today</a>.</p>
				
				<table class="table stat-table">
					<tbody>
						<tr>
							<td class="value">789</td>
							<td class="full">今天访问</td>
						</tr>
						<tr>
							<td class="value">634</td>
							<td class="full">独立访问</td>
						</tr>
						<tr>
							<td class="value">13</td>
							<td class="full">评论数量</td>
						</tr>
						<tr>
							<td class="value">17</td>
							<td class="full">帮助支持</td>
						</tr>
					</tbody>
				</table>
			</div> <!-- /.span4 -->
			
			<div class="span8">
				<div style="padding: 0px; position: relative;" id="line-chart" class="chart-holder">
				
				</div> <!-- /#bar-chart -->
			</div><!-- /.span8 -->
			
		</div> <!-- /.row -->
		
		<div class="row">
			
			<div class="span5">
				
				<h3 class="title">销售统计</h3>
				
				<div id="donut-chart" class="chart-holder"></div> <!-- /#donut-chart -->
				
			</div> <!-- /.span5 -->
						
			
			<div class="span7">
				
				<h3 class="title">帮助支持</h3>
				
				<table class="table">
					<thead>
						<tr>
							<th>标签</th>
							<th>主题</th>
							<th>用户</th>
						</tr>						
					</thead>
					
					<tbody>
					<tr>
						<td><span class="label label-primary">Open</span></td>
						<td class="full"><a href="#">Lorem ipsum dolor sit amet</a></td>					
						<td class="who">Posted by Bill</td>
					</tr>
	
					<tr>
						<td><span class="label label-primary">Open</span></td>
						<td class="full"><a href="#">Consectetur adipiscing</a></td>
						<td class="who">Posted by Pam</td>
					</tr>
					<tr>
						<td><span class="label label-primary">Open</span></td>
						<td class="full"><a href="#">Sed in porta lectus maecenas</a></td>					
						<td class="who">Posted by Curtis</td>
					</tr>
					<tr>
						<td><span class="label label-danger">Closed</span></td>
						<td class="full"><a href="#">Dignissim enim</a></td>					
						<td class="who">Posted by John</td>
					</tr>
					<tr>
						<td><span class="label label-secondary">Responded</span></td>
						<td class="full"><a href="#">Duis nec rutrum lorem</a></td>
	
	
						<td class="who">Posted by James</td>
					</tr>
					<tr>
						<td><span class="label label-danger">Closed</span></td>
						<td class="full"><a href="#">Maecenas id velit et elit</a></td>					
						<td class="who">Posted by Sam</td>
					</tr>
					<tr>
						<td><span class="label label-secondary">Responded</span></td>
						<td class="full"><a href="#">Duis nec rutrum lorem</a></td>
						<td class="who">Posted by Carlos</td>
					</tr>
					</tbody>
				</table>	
			</div> <!-- /.span7 -->
			
		</div> <!-- /.row -->
		
	</div> <!-- /.container -->

</div> <!-- /#content -->

</div> <!-- /#wrapper -->




<div id="footer">
		
	<div class="container">
		
		<div class="row">
			
			<div class="span6">
				(c) 2012 all rights reserved.
			</div> <!-- /span6 -->
			
			<div id="builtby" class="span6">
				<a href="#">Built by <a href="http://www.mycodes.net/" target="_blank">源码之家</a></a>				
			</div> <!-- /.span6 -->
			
		</div> <!-- /row -->
		
	</div> <!-- /container -->
	
</div> <!-- /#footer -->
<script src="./background/js/libs/jquery-1.7.2.min.js"></script>
<script src="./background/js/libs/jquery-ui-1.8.21.custom.min.js"></script>
<script src="./background/js/libs/jquery.ui.touch-punch.min.js"></script>

<script src="./background/js/libs/bootstrap/bootstrap.min.js"></script>

<script src="./background/js/Theme.js"></script>
<script src="./background/js/Charts.js"></script>

<script src="././background/js/plugins/excanvas/excanvas.min.js"></script>
<script src="././background/js/plugins/flot/jquery.flot.js"></script>
<script src="././background/js/plugins/flot/jquery.flot.pie.js"></script>
<script src="././background/js/plugins/flot/jquery.flot.orderBars.js"></script>
<script src="././background/js/plugins/flot/jquery.flot.tooltip.min.js"></script>
<script src="././background/js/plugins/flot/jquery.flot.resize.js"></script>

<script src="./background/js/demos/charts/line.js"></script>
<script src="./background/js/demos/charts/donut.js"></script>

<script>

$(function () {
	
	Theme.init ();
	
});

</script>

</body>
</html>