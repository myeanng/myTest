<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    
<title>通知 - 拍拍贷官网_中国领先互联网金融P2P网贷平台_网络贷款_投资理财</title>
<meta name="description" content="拍拍贷，中国首家，最大、最多人使用的互联网金融P2P(人人贷)网络借贷平台。提供小额贷款,短期贷款,个人贷款,抵押,无抵押贷款服务。利率自定,借期灵活。您还可以成为借出人理财借贷投资，获得高年收益率回报，超低门槛，超高收益。作为可信赖的投融资,理财,贷款,信贷平台,拍拍贷助您财富实现增值">
<meta name="keywords" content="网络贷款,民间借贷,小额贷款,无抵押贷款,信用贷款,网络借贷,借贷平台,拍拍贷,人人贷,投资理财,个人理财,p2p贷款,贷款,互联网金融,投融资">
<link rel="stylesheet" type="text/css" href="./ppd_mymessage_files/basic.css">
<link rel="stylesheet" type="text/css" href="./ppd_mymessage_files/layout.css">
<link rel="stylesheet" type="text/css" href="./ppd_mymessage_files/siteMessage.css">

<script src="./ppd_mymessage_files/jquery_002.js" type="text/javascript"></script><script src="./ppd_mymessage_files/ppd_pop.js" type="text/javascript"></script><script src="./ppd_mymessage_files/hubs" type="text/javascript"></script><script src="./ppd_mymessage_files/acstatus_hub.js" type="text/javascript"></script></head>
<body>
    <!-- 顶部登录注册状态栏目 -->
    
    <!-- 顶部登录注册状态栏目 -->

     <!--头部开始-->
    <div class="mainNav">
        <div class="mainNav_inner clearfix w1000center">
            <h1 class="logo">
                <a href="http://www.ppdai.com/"><img src="./ppd_mymessage_files/logo.png" alt=""></a>
            </h1>
            <ul id="tabIcon">
                <li class="hasSubMenu">
                    <a href="http://www.ppdai.com/lend" category="Lend">我要投资</a>
                    <div class="subMenu">
                        <a href="http://www.ppdai.com/lend">我要投资</a>
                        <a href="http://www.ppdai.com/product/plan/rainbow">彩虹计划</a>
                        <a href="http://www.ppdai.com/debtdeal/AlldebtList/DebtList">债权交易</a>
                        <a href="http://www.ppdai.com/howtolend">如何投资</a>
                        <a href="http://www.ppdai.com/help/principalprotection">本金保障</a>
                    </div>
                </li>
                <li class="hasSubMenu">
                    <a href="http://www.ppdai.com/borrow" category="Borrow">我要借款</a>
                    <div class="subMenu">
                        <a href="http://www.ppdai.com/borrow">我要借款</a>
                        <a href="http://www.ppdai.com/help/howtoborrow">如何借款</a>
                        <a href="http://www.ppdai.com/borrow/interestcalculate">利息计算器</a>
                    </div>
                </li>

                <li class="hasSubMenu">
                    <a href="http://www.ppdai.com/account" category="Account">我的账户</a>
                    <div class="subMenu">
                        <a href="myAccount-baccount">借款账户</a>
                        <a href="myAccount-laccount">投资账户</a>
                    </div>
                </li>
                <li class="hasSubMenu">
                    <a href="http://www.ppdai.com/help/aboutus" category="About">关于我们</a>
                    <div class="subMenu">
                        <a href="http://www.ppdai.com/help/aboutus">关于我们</a>
                        <a href="http://www.ppdai.com/help/howworks">工作原理</a>
                        <a href="http://www.ppdai.com/help/fees">资费说明</a>
                      	<a href="http://www.ppdai.com/job">招贤纳士</a>
                    </div>
                </li>
            </ul>
        </div>
    </div>

    <!--头部结束-->
    

	<div style="height: 421px;" class="main">
		<!--面包屑导航-->
		<div>
		    <ul class="breadcrumb" style="border: none !important;">
		        <li><a href="http://www.ppdai.com/">首页</a> <span class="divider">&gt;</span></li>
		         <li>消息</li>
		    </ul>
		</div>
		<!--面包屑导航-->
		<div class="wrapSiteMessageMain w1000center">
			<div class="siteMessageMain">
                <ul class="siteMessageNav siteMessageNav2 clearfix">
					<li class="first current"><a href="myAccount-mymessage">通知</a></li>
				</ul>
				<table class="siteMessageTable1" width="1000" height="159">
					<tbody><tr>
						<th width="7%"><input name="" id="checkboxall" type="checkbox"></th>
						<th width="7%">全选</th>
						<th width="6%">
                            <a href="myAccount-deleteAllMessage" class="webSiteMessage-delete" rel="all">删除</a></th>
						<th></th>
						<th width="139px">
						</th>
					</tr>
					<!--
    循环开始                                    
                                         -->
  <c:forEach items="${messages}" var="message">
                    <tr rel="1790433">
						<td style="background: none repeat scroll 0% 0% rgb(255, 255, 255);" valign="top"><input name="" rel="1790433" style="margin-top:4px;" type="checkbox"></td>
						<td style="background: none repeat scroll 0% 0% rgb(255, 255, 255);" valign="top"><span class="read no" id="isRead1790433" style="margin-top:4px;"></span></td>
						<td style="background: none repeat scroll 0% 0% rgb(255, 255, 255);" class="readNo" id="userName1790433" valign="top">  </td>
						<td style="background: none repeat scroll 0% 0% rgb(255, 255, 255);" class="tal readNo" id="content1790433" rel="1790433" valign="top">
                            <div id="divContentShow1790433" style="word-break:break-all;">${message.message}</div>
						</td>
						<td style="background: none repeat scroll 0% 0% rgb(255, 255, 255);" class="operate" valign="top">${message.createtime}<br>
                            <a href="myAccount-deleteMessage?${message.messageid}" class="webSiteMessage-delete" rel="1790433">删除</a>
						</td>
					</tr>
</c:forEach>					
					<!--
	循环结束				
                     -->
                     

				</tbody></table>
                <!-- 翻页开始 -->
				<div>
<div class="pagination-container"><ul class="pagination"><li class="active"><a>1</a></li></ul></div>				</div>
                  <!-- 翻页结束 --> 
			</div>
			
		</div>

	</div>


     <!--底部-->
    <div class="footer">
        <div class="footer_footerBottom">
            <ul class="footer_footerBottomNav clearfix">
                <li><span class="webindex"></span><a href="http://www.ppdai.com/">网站首页</a>|</li>
                <li><span class="aboutus"></span><a href="http://www.ppdai.com/help/aboutus">关于我们</a>|</li>
                <li><span class="mapsite"></span><a href="http://www.ppdai.com/home/sitemap">网站地图</a>|</li>
                <li><span class="webservice"></span><a href="http://www.ppdai.com/consult">客服中心</a>|</li>
                <li class="nomr"><span class="onlneserve"></span><a href="http://wpa.b.qq.com/cgi/wpa.php?ln=1&amp;key=XzgwMDAyNzUzNV8xODAzNjBfODAwMDI3NTM1XzJf" target="_blank">在线咨询</a></li>
            </ul>
            <p>Copyright Reserved 
2007-2015©拍拍贷
（www.ppdai.com）&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;沪ICP备
05063398号&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;上海拍拍贷金融信息服务有限公
司</p>
        </div>
    </div>
    <!--底部结束-->
    
	<script src="./ppd_mymessage_files/jquery.js" type="text/javascript" charset="utf-8"></script>
	<script src="./ppd_mymessage_files/init.js" type="text/javascript" charset="utf-8"></script>
	<script src="./ppd_mymessage_files/bootstrap.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript" src="./ppd_mymessage_files/customize.js"></script>
	<script type="text/javascript">
	    $(function () {
	        $('.siteMessageTable1 tr').hover(function () {
	            $(this).children('td').css('background', '#F7F7F7');
	        }, function () {
	            $(this).children('td').css('background', '#fff');
	        });

	        //checkBox全选/全不选
	        $('.siteMessageTable1 th input[type=checkbox]').click(function () {
	            if ($(this).is(':checked')) {
	                $('.siteMessageTable1 td input[type=checkbox]').attr('checked', 'checked');
	            } else {
	                $('.siteMessageTable1 td input[type=checkbox]').removeAttr('checked');
	            }
	        });

	        //删除确认框
	        $('.webSiteMessage-delete').click(function () {
	            var id = $(this).attr("rel");
	            var hasChecked = 0;
	            var ids = "";
	            //alert(id);
                //如果用户点了全选后边的 删除 判断用户是至少选择一个
	            if (id == "all")
	            {
	                $('.siteMessageTable1 td input[type=checkbox]').each(function () {
	                    if ($(this).attr('checked') == "checked")
	                    {
	                        hasChecked = 1;
	                        ids += $(this).attr("rel") + "|";
	                    }
	                });
	                if (hasChecked == 0) {
	                    return false;
	                }
	            }
	            //alert(id);
                $(this).PPDfloatDiv({
	                    floatbgtype: true,
	                    floattruebtn: '确认',
	                    floatfalsebtn: '取消',
	                    handertext: '是否删除消息',
	                    context: "<p>删除后无法恢复。确认删除？</p>",
	                    btnshow: true,
	                    keyboards: false,
	                    truebtnid: "btnDelete",
	                    btnalign: 'center'
	                });
	           
	            //弹出层中的 确认按钮事件
	            $("#btnDelete").click(function () {
	                //批量删除
	                if (id == "all")
	                {
	                    $.ajax({
	                        url: "/Message/DeleteMany?ids=" + ids,
	                        cache: false,
	                        success: function (back) {
	                            if (back.Status == 1) {
	                                //alert("删除成功");
	                                parent.$('#modalbackdroptrue').modal('hide');
	                                location.reload();
	                            } else {
	                                alert("删除失败 : " + back.Msg);
	                                parent.$('#modalbackdroptrue').modal('hide');
	                            }
	                        },
	                        error: function (e) {
	                            alert("删除失败: " + e.statusText);
	                        }
	                    });
	                }
	                //单个删除
	                if (id != "all")
	                {
	                    $.ajax({
	                        url: "/Message/Delete?id=" + id,
	                        cache: false,
	                        success: function (back) {
	                            if (back.Status == 1) {
	                                //alert("删除成功");
	                                parent.$('#modalbackdroptrue').modal('hide');
	                                location.reload();
	                            } else {
	                                alert("删除失败 : " + back.Msg);
	                            }
	                        },
	                        error: function (e) {
	                            alert("删除失败: " + e.statusText);
	                        }
	                    });
	                }
	            });
	            //return false;
            //delete end
	        });

	        //发送弹出框
	        $('.webSiteMessage-send').click(function () {
	            $(this).PPDfloatDiv({
	                floatbgtype: true,
	                floattruebtn: '发送',
	                floatfalsebtn: '取消',
	                handertext: '发送消息',
	                context: "<iframe scrolling='auto' width='100%' height='200' frameborder='0' src='/Message/Send?toUserId=-1&time=" + (new Date()).getTime() + "'></iframe>",
	                btnshow: true,
	                keyboards: false,
	                truebtnid: "btnSendMsg",
	                btnalign: 'center'
	            });
	            
	            $(".graypop-btn").click(removeIframe);
	            $(".close").click(removeIframe);
	        });

	        //回复弹出框
	        $('.webSiteMessage-apply').click(function () {
	            var id = $(this).attr("rel");
	            var userName = $("#userName" + id).val();
	            $(this).PPDfloatDiv({
	                floatbgtype: true,
	                floattruebtn: '发送',
	                floatfalsebtn: '取消',
	                handertext: '回复消息',
	                context: "<iframe scrolling='auto' width='100%' height='200' frameborder='0' src='/Message/Send?toUserId="+id+"&userName="+userName+"&time="+new Date()+"'></iframe>",
	                btnshow: true,
	                keyboards: false,
	                truebtnid: "btnSendMsg",
	                btnalign: 'center'
	            });

	            $(".graypop-btn").click(removeIframe);
	            $(".close").click(removeIframe);

	        });

	        //更新验证码 清除iframe
	        function removeIframe() {
	            var obj = $('#modalbackdroptrue');

	            //取消处 更新一下验证码（解决IE下iframe中缓存内容的问题）
	            var frame = $(obj[0]).find("iframe");
	            var frameBody = $(frame[0].contentWindow.document.body);
	            var time = new Date();
	            frameBody.find("#imageCode").attr("src", "/Message/Image?time=" + time);

	            //先移除iframe(不移除IE下有bug)

	            $(obj[0]).find("iframe").remove();
	        }

            //点击消息内容 设置为已读
	        $('.siteMessageTable1 tr').click(function () {
	            var id = $(this).attr("rel");
	            var isRead = $("#isRead" + id).attr("class");
	            //alert(isRead);
	            if (id && isRead=="read no")
	            {
	                $.ajax({
	                    url: "/Message/Read?id="+id,
	                    cache: false,
	                    success: function (back) {
	                        $("#isRead" + id).removeClass("no");
	                        $("#userName" + id).removeClass("readNo");
	                        $("#content" + id).removeClass("readNo");
	                    }
	                });
	            }
	        });

	       

            //end
	    });

        //点击查看更多
	    function SeeMore(id) {
	        var text = $("#linkMore" + id).text();
	        var content = $("#divContent" + id).html().replace(/&lt;/g,'<').replace(/&gt;/g,'>').replace(/&amp;gt;/g,'>');
	        var contentShort = $("#divContentShort" + id).html();
	        if (text.indexOf("更多") > 0) {
	            $("#divContentShow" + id).html(content);
                //解决内容太我展示后底部 没有自动向下移动 start
	            $('.main').removeAttr('style');
	            var height = $('.PPD_header_nav').outerHeight(true) + $('.footer').outerHeight(true) + 75;
	            if ($(window).height() == $(document).height()) {

	                $('.main').animate({
	                    height: $(window).height() - height
	                }, 0);

	            }
	            //解决内容太我展示后底部 没有自动向下移动 end
	            $("#linkMore" + id).text(">>收起");
	        } else {
	            $("#divContentShow" + id).html(contentShort);

	            $('.main').removeAttr('style');
	            var height = $('.PPD_header_nav').outerHeight(true) + $('.footer').outerHeight(true) + 75;
	            if ($(window).height() == $(document).height()) {

	                $('.main').animate({
	                    height: $(window).height() - height
	                }, 0);

	            }

	            $("#linkMore" + id).text(">>点击查看更多");
	        }
	        
	    }
	</script>


    <script src="./ppd_mymessage_files/status" type="text/javascript" charset="utf-8"></script><script type="text/javascript" src="./ppd_mymessage_files/acstatus.js"></script>
    <script src="./ppd_mymessage_files/init.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript">
        $(function () {
            $(".my-f-l-list li a.on").closest(".my-f-l-list").prev(".my-f-l-nav").addClass("my-f-l-nav-sd");

        });
    </script>
    


<div id="ac_quickLogin_pop"></div></body></html>
