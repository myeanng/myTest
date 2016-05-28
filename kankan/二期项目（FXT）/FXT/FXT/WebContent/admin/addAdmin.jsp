<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-1.8.3.js"></script>
<style>
#tel,#username,#userpwd1,#userpwd2{
	border:1px #aaa solid;
	width:160px;
	height:28px;
	line-height:28px;
}
.hspan{
	
	color:#888;
}
#xy{
	/*border:1px solid red;*/
	width:130px;
	margin-top:2px;
	margin-left:60px;
}
#fxtyhxy{
	font-size:14px;
	color:#2cb8ad;
	text-decoration: none;
}
#fxtyhxy:hover{
	color:red;
}
.btn{
	background-color:#77b32b;
	color:white;
	line-height:32px;
	font-weight:bold;
	border:none;
	margin-right:2px;
	padding:0px 16px;
}
#btn{
	margin-left:26px;
}
#c2{
	border:1px solid #999;
	width:858px;
	height:500px;
	padding:0px 60px;
	margin:0px auto;
	margin-top:65px;
}
#ks{
	background-color:#77b32b;
	width:200px;
	line-height:40px;
	text-align:center;
	color:#FFF;
	font-size:20px;
	font-weight:bold;
	position:relative;
	top:8px;
	left:22px;
	z-index:10;
}
hr{
	height:1px;
	background-color:#ccc;
	border:0px;
}
#dl{
	position:relative;
	top:40px;
	left:728px;
	font-size:14px;
}
#dl a{
	color:#2CB8AD;
	text-decoration:none;
	font-weight:bold;
	font-size:16px;
}
#c2 li{
	line-height:60px;
	list-style:none;
	margin-left:-36px;
	padding-left:20px;
}
.qd{
	width:54px;
	height:10px;
	background-color:#cdc;
	float:left;
	position: relative;
	top:-12px;
	left:80px;
	margin-right: 1px;
	font-size: 12px;
}
#cl{
	clear:both;
}
#shiwu{
width:100%;
height:5px;
background-color:#2CB8AD;
}
#shiliu{
width:980px;
height:300px;
background: url(pic/bottom.jpg) no-repeat;
margin:auto;
}
</style>
<script>
var telb=false;
var usernameb=false;
function checkTel(obj){
	var tel=obj.value;
	var reg=/^1[3,5,8][^4]\d{8}$/;
	if(reg.test(tel)){
		document.getElementById("telspan").innerHTML="<font color='green'>√</font>";
		return true;
	}else{
		document.getElementById("telspan").innerHTML="<font color='red'>请输入正确的手机号码。</font>";
		return false;
	}
};

$(function(){
	$("#tel").blur(function(){
		$.post("../checktel",{
			tel:$("#tel").val()
		},function(data){
			if(data=="true"){
				$("#telspan").text("该号码已经进行过注册。");
				$("#telspan").css("color","red");
				telb=false;
			}else{
				telb=true;
			}
		});
	});
});
function checkName(obj){
	var name=obj.value;
	var reg=/^[a-zA-Z]\w{3,15}$/;
	if(reg.test(name)){
		document.getElementById("namespan").innerHTML="<font color='green'>√</font>";
		return true;
	}else{
		document.getElementById("namespan").innerHTML="<font color='red'>用户名格式错误。</font>";
		return false;
	}
}
$(function(){
	$("#username").blur(function(){
		$.post("../checkusername",{
			username:$("#username").val()
		},function(data){
			if(data=="true"){
				$("#namespan").text("用户名已存在。");
				$("#namespan").css("color","red");
				usernameb=false;
			}else{
				usernameb=true;
			}
		});
	});
});

function checkpwd1(obj){
	var pwd=obj.value;
	if(pwd.length>5&&pwd.length<17){
		$("#pwd1span").text("√");
		$("#pwd1span").css("color","green");
		//document.getElementById("pwd1span").innerHTML="<font color='green'>√</font>";
		return true;
	}else{
		$("#pwd1span").text("密码格式错误。");
		$("#pwd1span").css("color","red");
		//document.getElementById("pwd1span").innerHTML="<font color='red'>密码格式错误。</font>";
		return false;
	}
}
function checkpwd2(obj){
	var repwd=obj.value;
	var pwd=document.getElementById("userpwd1").value;
	if(repwd.length>5&&repwd.length<17&&repwd==pwd){
		document.getElementById("pwd2span").innerHTML="<font color='green'>√</font>";
		return true;
	}else{
		document.getElementById("pwd2span").innerHTML="<font color='red'>两次密码输入不一致。</font>";
		return false;
	}
}
function checkForm(){
	var tel=document.getElementById("tel");
	var username=document.getElementById("username");
	var userpwd1=document.getElementById("userpwd1");
	var userpwd2=document.getElementById("userpwd2");
	if(telb&&usernameb&&checkTel(tel)&&checkName(username)&&checkpwd1(userpwd1)&&checkpwd2(userpwd2)){
		return true;
	}else{
		return false;
	}
}
function CharMode(iN){
	if (iN>=48 && iN <=57) //数字
		return 1; 
	if (iN>=65 && iN <=90) //大写字母
		return 2;
	if (iN>=97 && iN <=122) //小写
		return 4;
	else
		return 8; //特殊字符
}


function bitTotal(num){
	modes=0;
	for (i=0;i<4;i++){
		if (num & 1) modes++;
			num>>>=1;
		}
	return modes;
}


function checkStrong(sPW){
	if (sPW.length<=5)
		return 0; //密码太短
		Modes=0;
	for (i=0;i<sPW.length;i++){
		Modes|=CharMode(sPW.charCodeAt(i));
	}
	return bitTotal(Modes);
} 

function pwStrength(pwd){
	O_color="#eeeeee";
	L_color="#FF0000";
	M_color="#FF9900";
	H_color="#33CC00";
	if (pwd==null||pwd==''){
		Lcolor=Mcolor=Hcolor=O_color;
	} 
	else{
		S_level=checkStrong(pwd);
		switch(S_level) {
			case 0:
				Lcolor=Mcolor=Hcolor=O_color; 
			case 1:
				Lcolor=L_color;
				Mcolor=Hcolor=O_color;
				break;
			case 2:
				Lcolor=Mcolor=M_color;
				Hcolor=O_color;
				break;
			default:
				Lcolor=Mcolor=Hcolor=H_color;
			}
		} 
	document.getElementById("ruo").style.background=Lcolor;
	document.getElementById("zhong").style.background=Mcolor;
	document.getElementById("qiang").style.background=Hcolor;
	return;
}

</script>
</head>
<body>
<div id="c2">
	<div id="ks">注册管理员</div>
<hr />
<form action="../regServlet?x=1" method="post" onsubmit="return checkForm()">
<ul id="ul">
	<li>手&nbsp;&nbsp;机&nbsp;&nbsp;号：<input type="text" name="tel" id="tel" onblur="checkTel(this)"/><span id="telspan" class="hspan">用于登录和找回密码，不会公开</span></li>
	<li>账&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号：<input type="text" name="username" id="username" onblur="checkName(this)"/><span id="namespan" class="hspan">首位为字母的4-16位字符串</span></li>
	<li>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="userpwd1" id="userpwd1" onblur="checkpwd1(this)" onkeyup="pwStrength(this.value)" maxlength="16"/><span id="pwd1span" class="hspan">密码长度不能小于6位，大于16位</span><br>
	<div class="qd" id="ruo"></div><div class="qd" id="zhong"></div><div class="qd" id="qiang"></div></li><div id="cl"></div>
	<li>确认密码：<input type="password" name="userpwd2" id="userpwd2" onblur="checkpwd2(this)"/><span id="pwd2span"></span></li>
</ul>
	<input type="submit" value="注册" class="btn" id="btn"/><input type="reset" value="重置" class="btn" id="cz"/><br/>
</form>
</div>
</body>
</html>