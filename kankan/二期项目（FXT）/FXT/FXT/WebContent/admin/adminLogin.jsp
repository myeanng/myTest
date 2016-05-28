<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-1.8.3.js"></script>
<style type="text/css">
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	overflow:hidden;
color:red;
}
.STYLE3 {color:#77b32b; font-size: 12px; }
.STYLE4 {
	color:#77b32b;
	font-size: 12px;
}
#f{
	color:#77b32b;
	position:absolute;
	top:210px;
	left:460px;
	font-size:32px;
	font-weight:bold;
}
#tj{
	width:40px;
	height:22px;
	border:none;
	background:url(../pic/dl.gif);
}
#cz{
	width:40px;
	height:22px;
	border:none;
	background:url(../pic/dl.gif) 40px 0px;
}
#ts{
	position:absolute;
	top:266px;
	left:680px;
	font-size:14px;
	font-family:微软雅黑;
}
</style>
<script>
$(function(){
	$("#tj").click(function(){
		$.post("../adminLoginServlet",{
			uname:$("#uname").val(),
			pwd:$("#pwd").val()
		},function(data){
			if(data=="1"){
				window.location.href("guanli.jsp");
			}else if(data=="0"){
				$("#ts").text("您没有登录管理权限。");
			}else if(data=="2"){
				$("#ts").text("帐号或密码输入错误。");
			}
		});
	});
});

</script>
</head>
<body>
<span id="ts"></span>
<form action="../adminLoginServlet" method="post">
<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td bgcolor="#e5f6cf">&nbsp;</td>
  </tr>
  <tr>
    <td height="608" background="../pic/login_03.gif"><table width="862" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td height="266" background="../pic/login_04.gif">&nbsp;</td>
      </tr>
      <tr>
        <td height="95"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="424" height="95" background="../pic/login_06.gif">&nbsp;</td>
            <td width="183" background="../pic/login_07.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="21%" height="30"><div align="center"><span class="STYLE3">用户:</span></div></td>
                <td width="79%" height="30"><input type="text" name="uname" id="uname" style="height:18px; width:130px; border:solid 1px #cadcb2; font-size:12px; color:#000;"></td>
              </tr>
              <tr>
                <td height="30"><div align="center"><span class="STYLE3">密码:</span></div></td>
                <td height="30"><input type="password" name="pwd" id="pwd" style="height:18px; width:130px; border:solid 1px #cadcb2; font-size:12px; color:#000;"></td>
              </tr>
              <tr>
                <td height="30">&nbsp;</td>
                <td height="30"><input type="button" value="" id="tj"><input type="reset" value="" id="cz"></td>
              </tr>
            </table></td>
            <td width="255" background="../pic/login_08.gif">&nbsp;</td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td height="247" valign="top" background="../pic/login_09.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="22%" height="30">&nbsp;</td>
            <td width="56%">&nbsp;</td>
            <td width="22%">&nbsp;</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="44%" height="20">&nbsp;</td>
                <td width="56%" class="STYLE4">版本 2014V1.0 </td>
              </tr>
            </table></td>
            <td>&nbsp;</td>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
  <tr>
  </tr><span id="f">放心团</span>
</table>
</form>
<!--<map name="Map"><area shape="rect" coords="3,3,36,19" href="#"><area shape="rect" coords="40,3,78,18" href="#"></map>-->
</body>
</html>
<script>

</script>