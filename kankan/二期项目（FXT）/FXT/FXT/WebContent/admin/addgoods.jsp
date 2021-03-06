<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../js/jquery-ui-themes-1.10.3/themes/ui-lightness/jquery-ui.css">
<script type="text/javascript" src="../js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="../js/ui/jquery-ui.js"></script>
<script src="../js/WebEditor/js/jquery.wysiwyg.js"></script>
<script src="../js/WebEditor/js/wysiwyg.image.js"></script>
<script src="../js/WebEditor/js/wysiwyg.link.js"></script>
<script src="../js/WebEditor/js/wysiwyg.table.js"></script>
<link rel="stylesheet" href="../js/WebEditor/css/jquery.wysiwyg.css" type="text/css" />
<link rel="stylesheet" href="../js/WebEditor/css/ie.css" type="text/css" />
<link rel="stylesheet" href="../js/WebEditor/css/print.css" type="text/css" />
<link rel="stylesheet" href="../js/WebEditor/css/screen.css" type="text/css" />
<style>
span{
font-size:14px;
color:red;
margin-left:10px;
}
</style>
<script type="text/javascript">
$(function(){
	$("#youxiaoqi").datepicker({
		changeMonth:true,
		changeYear:true,
		showOtherMonths:true,
		selectOtherMonths:true
	});
	$("#youxiaoqi").datepicker(
	    "option","monthNamesShort",['一月','二月','三月','四月','五月','六月','七月','八月','九月','十月','十一月','十二月']		
	);
	$("#youxiaoqi").datepicker(
	     "option","dayNamesMin",['日','一','二','三','四','五','六']		
	);
	$("#youxiaoqi").datepicker(
	     "option","dateFormat","yy-mm-dd"		
	);
	
	$("#jianjie").wysiwyg();
	$("#miaoshu").wysiwyg();
	
	$("#tijiao").button();
});
</script>
</head>
<body>
<form action="../AddGoodsServlet" method="post" enctype="multipart/form-data" onsubmit="return checkAll()">
<table>
<caption style="text-align:center;font-size:18px;font-weight:bold;background:white;">发布商品</caption>
<tr><td>所属类别:(必选)</td><td><select name="gclid" id="leibie"><option value="0">--请选择商品分类--</option><option value="1">火锅</option><option value="2">西餐</option><option value="3">经济型酒店</option><option value="4">豪华型酒店</option>
<option value="5">电影</option><option value="6">KTV</option><option value="7">足疗按摩</option><option value="8">景点门票</option><option value="9">国内游</option><option value="10">婚纱摄影</option>
<option value="11">儿童摄影</option><option value="12">服装</option><option value="13">鞋类</option><option value="14">美发</option><option value="15">美甲</option></select><span id="tishi1"></span></td></tr>
<tr><td>所属区域:(必选)</td><td><select name="did" id="quyu"><option value="0">--请选择商品区域--</option><option value="1">金水区</option><option value="2">中原区</option><option value="3">二七区</option><option value="4">管城回族区</option><option value="5">惠济区</option>
<option value="6">上街区</option><option value="7">高新区</option><option value="8">近郊</option></select><span id="tishi2"></span></td></tr>
<tr><td>商品名称:(200个字符以内)</td><td><input type="text" name="gname" id="gname" maxlength="200"><span id="tishi3"></span></td></tr>
<tr><td>商品数量:(大于0的整数)</td><td><input type="text" name="num" id="num"><span id="tishi4"></span></td></tr>
<tr><td>商品原价:(必填项,请务必填写真实数据)</td><td><input type="text" name="price" id="price"><span id="tishi5"></span></td></tr>
<tr><td>商品团购价:(必填项,请务必填写真实数据)</td><td><input type="text" name="nowprice" id="nowprice"><span id="tishi6"></span></td></tr>
<tr><td>有效期:(商品团购截止日期)</td><td><input type="text" name="destroytime" id="youxiaoqi" readonly="readonly"><span id="tishi7"></span></td></tr>
<tr><td>商品简介:(必填项，且500个字符以内)</td><td><textarea rows="5" cols="50" name="intro" id="jianjie"></textarea><span id="tishi8"></span></td></tr>
<tr><td>商品描述:(500个字符以内)</td><td><textarea rows="10" cols="50" name="describe" id="miaoshu"></textarea></td></tr>
<tr><td colspan="2" style="color:black;font-weight:bold;">上传图片（至少需要上传一张该商品的图片）</td></tr>
<tr><td>图片1</td><td><input type="file" name="pic1"></td></tr>
<tr><td>图片2</td><td><input type="file" name="pic2"></td></tr>
<tr><td>图片3</td><td><input type="file" name="pic3"></td></tr>
<tr><td></td><td><input type="submit" value="提交" id="tijiao" style="width:200px; height:40px;font-size:18px;" ></td></tr>
</table>
</form>
</body>
<script>
var usernameb=false;
function checkleibie(){
	var v=$("#leibie :selected").val();
	if(v==0){
		$("#tishi1").html("请选择商品的所属类别");
		return false;
	}else{
		return true;
	}
}
function checkquyu(){
	var q=$("#quyu :selected").val();
	if(q==0){
		$("#tishi2").html("请选择商品的所属区域");
		return false;
	}else{
		return true;
	}
}
function checkgname(){
	var n=$("#gname").val();
	if($.trim(n).length>0){
		return true;
	}else{
		$("#tishi3").html("请输入商品的名称");
		return false;
	}
}
function checknum(){
	var n=$("#num").val();
	//商品数量
	if($.trim(n).length<1||!(/(^[1-9]\d*$)/.test(n))){
		$("#tishi4").html("请输入商品的数量，且必须为正整数");
		return false;
	}else{
		return true;
	}
}
function checkprice(){
	var p=$("#price").val();
	if($.trim(p).length<1||!(/(^\d+(\.{0,1}\d+){0,1}$)/.test(p))){
		$("#tishi5").html("请输入商品的原价，且必须为非负数");
		return false;
	}else{
		return true;
	}
}
function checknowprice(){
	var np=$("#nowprice").val();
	if($.trim(np).length<1||!(/(^\d+(\.{0,1}\d+){0,1}$)/.test(np))){
		$("#tishi6").html("请输入商品的团购价，且必须为非负数");
		return false;
	}else{
		return true;
	}
}
function checkyouxiaoqi(){
	var yxq=$("#youxiaoqi").val();
	if(yxq.length==0){
		$("#tishi7").html("请输入商品的有效期");
		return false;
	}else{
		return true;
	}
}
function checkjianjie(){
	var jj=$("#jianjie").val();
	if($.trim(jj).length==0||$.trim(jj).length>500){
		$("#tishi8").html("请输入商品的简单描述信息,且不能多于500个字符！");
		return false;
	}else{
		return true;
	}
}
function checkAll(){
	if(checkleibie()&&checkquyu()&&checkgname()&&checknum()&&checkprice()&&checknowprice()&&checkyouxiaoqi()&&checkjianjie()&&usernameb){
		if(confim("确定要发布该商品信息么？")){
			return true;
		}else{
			alert("您取消了该商品信息的发布！");
		}
	}else{
		alert("商品信息验证未通过，请检查后再次发布！");
		return false;
	}
}
$("select").change(function(){
	$(this).next().html("");
});
$("#gname,#num,#price,#nowprice,#youxiaoqi,#jianjie").focus(function(){
	$(this).next().html("");
});
$("#gname").blur(function(){
	var name=$.trim($("#gname").val());
	$.post("../checkgname",{
		gname:name,
	},function(data){
		if(data=="true"){
			$("#tishi3").html("该商品名已经存在");
			usernameb=false;
		}else{
			usernameb=true;
		}
	});
});
</script>
</html>