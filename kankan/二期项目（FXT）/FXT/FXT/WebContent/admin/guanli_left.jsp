<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../js/css/jquery-ui.css" />
<script src="../js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script src="../js/jquery-ui.js"></script>

<style type="text/css">

body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.STYLE2 {color: #43860c; font-size: 12px; }

a:link {font-size:12px; text-decoration:none; color:#43860c;}
a:visited {font-size:12px; text-decoration:none; color:#43860c;}
a:hover{font-size:12px; text-decoration:none; color:#FF0000;}
#acc h3,#tx h3{
color:green;
font-weight: bold;
}
#acc ul,#tx ul{
color:olive;
}
#acc ul li,#tx ul li{
border:1px solid #f5f5f5;
list-style:none;
width:166px;
margin-left:-76px;
text-align: center;
padding:6px 0px;
position: relative;
top:-36px; 
}
#acc ul li a,#tx ul li a{
font-size:14px;
}

</style>
<script type="text/JavaScript">

function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
 
  $("#tx").css("display","none");
}

function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}
function asd(){
	$("#tx").css("display","none");
	$("#acc").css("display","block");
}
function asd2(){
	$("#acc").css("display","none");
	$("#tx").css("display","block");
}
</script>
</head>

<body onload="MM_preloadImages('../pic/main_26_1.gif','../pic/main_29_1.gif','../pic/main_31_1.gif')">
<table width="177" height="600px" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0" style="table-layout:fixed">
      <tr>
        <td height="26" background="../pic/main_21.gif">&nbsp;</td>
      </tr>
      <tr>
        <td height="80" style="background-image:url(../pic/main_23.gif); background-repeat:repeat-x;"><table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
          <tr>
            <td height="45"><div align="center"><a href="#" id="acc2" onclick="asd()"><img src="../pic/main_26.gif" name="Image1" width="40" height="40" border="0" id="Image1" onmouseover="MM_swapImage('Image1','','../pic/main_26_1.gif',1)" onmouseout="MM_swapImgRestore()" /></a></div></td>
       <!--     <td><div align="center"><a href="#"><img src="../pic/main_28.gif" name="Image2" width="40" height="40" border="0" id="Image2" onmouseover="MM_swapImage('Image2','','../pic/main_29_1.gif',1)" onmouseout="MM_swapImgRestore()" /></a></div></td>-->
            <td><div align="center"><a href="#" id="tx2" onclick="asd2()"><img src="../pic/main_31.gif" name="Image3" width="40" height="40" border="0" id="Image3" onmouseover="MM_swapImage('Image3','','../pic/main_31_1.gif',1)" onmouseout="MM_swapImgRestore()" /></a></div></td>
          </tr>
          <tr>
            <td height="25"><div align="center" class="STYLE2"><a href="#">系统管理</a></div></td>
          <!--   <td><div align="center" class="STYLE2"><a href="#">日志管理</a></div></td>-->
            <td><div align="center" class="STYLE2"><a href="#">数据分析</a></div></td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td  style="line-height:4px; background:url(../pic/main_38.gif)">&nbsp;</td>
      </tr>
      <tr>
        <td>
        	<div id="acc">
				<h3>商品管理</h3>
			    <div>
			    	<ul>
			        	<li><a href="addgoods.jsp" target="I1">添加商品</a></li>
			            <li><a href="../SelectGoodsServlet?xuan=1" target="I1">查看商品</a></li>
			        </ul>
			    </div>
			    <h3>订单管理</h3>
			    <div>
			    	<ul>
			            <li><a href="../DFHOrdersServlet?status=1&pn=1" target="I1">未付款订单</a></li>
			            <li><a href="../DFHOrdersServlet?status=2&pn=1" target="I1">待发货订单</a></li>
			            <li><a href="../DFHOrdersServlet?status=3&pn=1" target="I1">已发货订单</a></li>
			            <li><a href="../DFHOrdersServlet?status=4&pn=1" target="I1">待使用订单</a></li>
			            <li><a href="../DFHOrdersServlet?status=5&pn=1" target="I1">已完成订单</a></li>
			        </ul>
			    </div>
			    <h3>用户管理</h3>
			    <div>
			    	<ul>
			        	<li><a href="../usersServlet" target="I1">查看普通用户</a></li>
			        	<li><a href="../QueryGuanLiYuanServlet" target="I1">查看管理员</a></li>
			        	<c:if test="${isboss==2 }">
			        	<li><a href="addAdmin.jsp" target="I1">添加管理员</a></li>
			        	</c:if>
			        </ul>
			    </div>
			    <h3>备注</h3>
			    <div>
			    	<ul>
			        	<li><a href="#">备注</a></li>
			            <li><a href="#">备注</a></li>
			            <li><a href="#">备注</a></li>
			        </ul>
			    </div>
			    <h3>备注</h3>
			    <div>
			    	<ul>
			        	<li><a href="#">备注</a></li>
			            <li><a href="#">备注</a></li>
			            <li><a href="#">备注</a></li>
			        </ul>
			    </div>
			    <h3>备注</h3>
			    <div>
			    	<ul>
			        	<li><a href="#">备注</a></li>
			            <li><a href="#">备注</a></li>
			            <li><a href="#">备注</a></li>
			        </ul>
			    </div>
			    
			</div>
			
			<div id="tx">
				<h3>营销概况</h3>
			    <div>
			    	<ul>
			        	<li><a href="../ShujufenxiServlet?t=7" target="I1">本周商品销售情况</a></li>
			            <li><a href="../ShujufenxiServlet?t=30" target="I1">本月商品销售情况</a></li>
			            <li><a href="../ShujufenxiServlet?t=90" target="I1">本季度商品销售情况</a></li>
			        </ul>
			    </div>
			   <h3>月销售量概况</h3>
			    <div>
			    	<ul>
			        	<li><a href="findAmountByMonth.jsp" target="I1">月销售量查询</a></li>
			        </ul>
			    </div>
			    <h3>备注</h3>
			    <div>
			    	<ul>
			        	<li><a href="#">备注</a></li>
			            <li><a href="#">备注</a></li>
			            <li><a href="#">备注</a></li>
			        </ul>
			    </div>
			</div>
			
        </td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>
<script> 
$(function() {
	$( "#acc" ).accordion({
	collapsible: true
	});
});
$(function() {
	$( "#tx" ).accordion({
	collapsible: true
	});
});
</script>