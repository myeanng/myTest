<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script src="../js/jquery-1.8.3.js"></script>
<style type="text/css">

body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.STYLE1 {
	color: #43860c;
	font-size: 14px;
	font-weight: bold;
}
#rq2{
	border:none;
	background:none;
}
#tuichu{
position:absolute;
left:308px;
display:inline-block;
width:60px;
height:22px;
background:url(../pic/main_12.gif) top right no-repeat;
}
#shuaxin{
position:absolute;
left:154px;
display:inline-block;
width:60px;
height:22px;
background:url(../pic/main_12.gif) top center no-repeat;
}
#shouye{
position:absolute;
left:0px;
display:inline-block;
width:50px;
height:20px;
background:url(../pic/main_12.gif) top left no-repeat;
}
</style>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script language="JavaScript">
var enabled = 0;
function TOfunc() { 
	TO = window.setTimeout( "TOfunc()", 1000 ); 
	var today = new Date(); 
	document.getElementById("rq2").value=today.toString();
	//document.forms[0].elements[0].value = today.toString();
}
function Stopfunc(){
	clearTimeout(TO);
	var enabled = 0;
}
window.onload=TOfunc();
</script>
</head>

<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0" style="table-layout:fixed;">
  <tr>
    <td height="9" style="line-height:9px; background-image:url(../pic/main_04.gif)"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="97" height="9" background="../pic/main_01.gif">&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="47" background="../pic/main_09.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="38" height="47" background="../pic/main_06.gif">&nbsp;</td>
        <td width="59"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="29" background="../pic/main_07.gif">&nbsp;</td>
          </tr>
          <tr>
            <td height="18" background="../pic/main_14.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0" style="table-layout:fixed;">
              <tr>
                <td  style="width:1px;">&nbsp;</td>
                <td ><span class="STYLE1">${adminname.username }</span></td>
              </tr>
            </table></td>
          </tr>
        </table></td>
        <td width="155" background="../pic/main_08.gif">&nbsp;</td>
        <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="23" valign="bottom" style="position: relative;"><img src="../pic/main_12.gif" width="367" height="23" border="0" usemap="#Map" /><a href="#" id="shouye"></a><a href="#" id="shuaxin"></a><a href="#" id="tuichu"></a></td>
          </tr>
        </table></td>
        <td width="360" background="../pic/main_11.gif no-repeat"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="11%" height="23">&nbsp;</td>
            <td width="89%" valign="bottom"><FORM><span class="STYLE1" id="rq">日期：
<input type="text" name="disp" id="rq2" value="" size=25 onFocus="this.blur()"><br>
</span></form></td>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="5" style="line-height:5px; background-image:url(../pic/main_18.gif)"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="180" background="../pic/main_16.gif"  style="line-height:5px;">&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
    </table></td>
  </tr>
</table>

<map name="Map" id="Map"><area shape="rect" coords="3,1,49,22" href="#" /><area shape="rect" coords="52,2,95,21" href="#" /><area shape="rect" coords="102,2,144,21" href="#" /><area shape="rect" coords="150,1,197,22" href="#" /><area shape="rect" coords="210,2,304,20" href="#" /><area shape="rect" coords="314,1,361,23" href="#" /></map></body>
<script>
$("#tuichu").click(function(){
	parent.window.location.href("../HouTaiExit");
});
$("#shouye").click(function(){
	parent.window.location.href("../mainShowGoodsServlet");
});
$("#shuaxin").click(function(){
	parent.window.location.href("guanli.jsp");
});
</script>
</html>
