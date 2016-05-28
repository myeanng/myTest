<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script src="js/jquery-1.8.3.js" type="text/javascript"></script>
<script type="text/javascript">
	function putgid(){
		var gid=${goods.gid };
		document.getElementById("gid").value=gid;
		putgname();
	}
	function putgname(){
		var gname='${goods.gname }';
		document.getElementById("gname").value=gname;
	}
	window.onload=putgid;
</script>
</head>
<body>
	<form action="addOrderServlet" method="post">
		用户编号：<input type="text" value="${nowuser.uid }" name="uid" id="uid" ><br>
		商品编号：<input type="text" name="gid" id="gid"><br>
		商品名称：<input type="text" name="gname" id="gname"><br>
		数量：
		<input type="button" value="-" id="jian">
		<input type="text" name="num" id="num" value="1">
		<input type="button" value="+" id="jia"><br>
		总价:<input type="text" name="totalprice" id="totalprice"><br>
		收货人姓名：<input type="text" name="uname" id="uname" onblur="putgid()"><br>
		收货人地址：<input type="text" name="address" id="address"><br>
		收货人电话：<input type="text" name="tel" id="tel"><br>
		<input type="submit" value="提交订单"><input type="button" value="取消">
	</form>
</body>
</html>
<script>
$("#jian").click(function(){
	var num=$("#num").val();
	--num;
	if(num<1)
		num=1;
	$("#num").val(num);
	var price=${goods.price };
	var totalprice=price*num;
	$("#totalprice").val(totalprice);
})
$("#jia").click(function(){
	var num=$("#num").val();
	++num;
	$("#num").val(num);
	var price=${goods.price };
	var totalprice=price*num;
	$("#totalprice").val(totalprice);
})
$("#num").blur(function(){
	var num=$("#num").val();
	var price=${goods.price };
	var totalprice=price*num;
	$("#totalprice").val(totalprice);
})
$("#num").keyup(function(){
	var num=$("#num").val();
	var price=${goods.price };
	var totalprice=price*num;
	$("#totalprice").val(totalprice);
})
</script>