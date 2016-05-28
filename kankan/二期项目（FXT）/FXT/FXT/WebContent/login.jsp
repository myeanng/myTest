<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<style>
#main{
width:880px;
margin:auto;
position:relative;
}
#one{
margin:30px auto;
}
#one #a{
display:inline-block;
font-size:40px;
font-weight:800;
color:#2CB8AD;
height:36px;
font-family:黑体;
}
#one #b{
display:inline-block;
font-size:14px;
font-weight:bold;
color:#2CB8AD;
line-height:10px;
margin-left:15px;
}
#two #left{
float:left;
margin-left:20px;
margin-top:40px;
}
#two #right{
float:right;
margin-right:20px;
}
#two table{
width:261px;
margin:auto;
font-size:14px;
color:#666666;
}
#two #td1,#two #td4{
height:30px;
line-height:30px;
position:relative;
}
#two #td1 a{
font-size:12px;
margin-left:100px;
text-decoration: none;
color:#666666;
}
#two #td1 img{
position:absolute;
top:5px;
border:none;
}
#two #td2,#two #td3{
height:60px;
line-height:60px;
}
#two #td2 input,#two #td3 input{
width:226px;
height:34px;
line-height:34px;
font-size:14px;
color:#666666;
padding-left:35px;
border:1px solid #666666;
}
#two #td2 input{
background:url(pic/denglutouxiang.jpg) no-repeat;
}
#two #td3 input{
background:url(pic/denglusuo.jpg) no-repeat;
}
#two #td4{
font-size:12px;
color:black;
}
#two #td4 a{
color:#2CB8AD;
text-decoration: none;
margin-left:40px;
}
#two #td5{
height:80px;
line-height:80px;
text-align:center;
}

#denglu{
}
#two #td6 a{
text-decoration:none;
color:#2CB8AD;
}
#two #td7{
width:261px;
height:100px;
margin:auto;
background:url(pic/cartdenglulianjie.jpg) no-repeat;
}
#zhcw,#mmcw{
color:red;
height:16px;
text-align: center;
}
#gg{
position: absolute;
left:900px;
top:30px;
}
</style>
</head>
<body>
<div id="main">
<div id="one">
<span id="a">放心团</span><br><span id="b">www.FXT.com</span>
</div>

<div id="two">
<div id="left">
<img alt="" src="pic/left1.jpg">
</div>

<div id="right">
<form action="loginServlet?xuan=2" method="post">
<table cellpadding="0" cellspacing="0">
<tr><td id="td1">账号登陆<a href="#">手机动态码登陆<img src="pic/xiaoshouji.jpg"/></a></td></tr>
<tr><td id="td2"><input type="text" value="手机号/用户名/邮箱" name="username" id="zh"/></td></tr>
<tr><td id="zhcw"></td></tr>
<tr><td id="td3"><input type="password" value="" name="userpwd" id="mm"/></td></tr>
<tr><td id="mmcw"></td></tr>
<tr><td id="td4"><input type="checkbox">记住账号<input type="checkbox">下次自动登陆<a href="#">忘记密码？</a></td></tr>
<tr><td id="td5"><img src="pic/cartdenglu.jpg" id="denglu"></td></tr>
<tr><td id="td6">还没有账号？<a href="reg.jsp">免费注册</a></td></tr>
</table>
<div id="td7"></div>
</form>
</div>
</div>

<div>
<img alt="" src="pic/login_bottom.jpg">
</div>

<div id="gg">
<img alt="" src="pic/right.jpg">
</div>
</div>
</body>
<script type="text/javascript">
//控制账号输入框的提示信息隐藏和显示
$("#two #td2 input").focus(function(){
	$("#zhcw").text("");
	var s=$(this).val();
	if(s=="手机号/用户名/邮箱")
	$(this).val("");
});
$("#two #td3 input").focus(function(){
	$("#mmcw").text("");
});
$("#two #td2 input").blur(function(){
	var s=$(this).val();
	if($.trim(s).length==0)
	$(this).val("手机号/用户名/邮箱");
});

</script>
</html>
<script>
$("#denglu").click(function(){
	var zhanghao=$("#two #td2 input").val();
	var mima=$("#two #td3 input").val();
	if($.trim(zhanghao)=="手机号/用户名/邮箱"||$.trim(zhanghao).length==0){
		$("#zhcw").html("账号不能为空");
	}else if($.trim(mima).length==0){
		$("#mmcw").html("密码不能为空");
	}else{
		$.ajax({
			url:'loginServlet',
			type:'post',
			dataType:'json',
			data:{
				xuan:1,
				username:zhanghao,
				userpwd:mima,
			},
			success:function(data){
				if(data==false){
					$("#mmcw").html("账号或密码输入有误！");
				}else{//
				    location.href("mainShowGoodsServlet");
				}
			},
			error:function(xhr,msg){
				alert(msg);
			}
		});
		
	}
});

</script>