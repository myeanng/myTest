<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>上传资料</title>
    <meta name="description" content="拍拍贷，中国首家，最大、最多人使用的互联网金融P2P(人人贷)网络借贷平台。提供小额贷款,短期贷款,个人贷款,抵押,无抵押贷款服务。利率自定,借期灵活。您还可以成为借出人理财借贷投资，获得高年收益率回报，超低门槛，超高收益。作为可信赖的投融资,理财,贷款,信贷平台,拍拍贷助您财富实现增值" />
    <meta name="keywords" content="网络贷款,民间借贷,小额贷款,无抵押贷款,信用贷款,网络借贷,借贷平台,拍拍贷,人人贷,投资理财,个人理财,p2p贷款,贷款,互联网金融,投融资" />
    <link rel="stylesheet" type="text/css" href="./ppd_upLoadMes_files/basic.css" />
    <link rel="stylesheet" type="text/css" href="./ppd_upLoadMes_files/layout.css" />
    <link href="./ppd_upLoadMes_files/validation-min.css" rel="stylesheet" />
    <link rel="shortcut icon" href="./ppd_upLoadMes_files/favicon.ico" type="image/x-icon" />
    <script src="./ppd_upLoadMes_files/newRefer.js"></script>
    <script type="text/javascript">
        var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
        document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3Faab1030ecb68cd7b5c613bd7a5127a40' type='text/javascript'%3E%3C/script%3E"));
    </script>
    
    <link rel="stylesheet" type="text/css" href="./ppd_upLoadMes_files/uploadData.css" />
    <link rel="stylesheet" href="./ppd_upLoadMes_files/account.css" />
    <link rel="stylesheet" type="text/css" href="./ppd_upLoadMes_files/uploadData.css" />

</head>
<body><br><div class="mainNav">
        <div class="mainNav_inner w1000center clearfix">
            <h1 class="logo">
                <a href="/">
                    <img src="./ppd_upLoadMes_files/logo.png" alt="" /></a>
            </h1>
            <ul id="tabIcon">
                <li class="hasSubMenu">
                    <a href="/lend" category="Lend">我要投资</a>
                    <div class="subMenu">
                        <a href="/lend">我要投资</a>
                        <a href="http://www.ppdai.com/product/plan/rainbow">彩虹计划</a>
                        <a href="http://www.ppdai.com/debtdeal/AlldebtList/DebtList">债权交易</a>
                        <a href="/howtolend">如何投资</a>
                        <a href="/help/principalprotection">本金保障</a>
                    </div>
                </li>
                <li class="hasSubMenu">
                    <a href="/borrow" category="Borrow">我要借款</a>
                    <div class="subMenu">
                        <a href="/borrow">我要借款</a>
                        <a href="/help/howtoborrow">如何借款</a>
                        <a href="/borrow/interestcalculate">利息计算器</a>
                    </div>
                </li>
                <li class="hasSubMenu"><a href="/account" category="Account">我的账户</a>
                    <div class="subMenu">
                        <a href="/account/borrow">借款账户</a>
                        <a href="/account/lend">投资账户</a>
                    </div>
                </li>
                <li class="hasSubMenu"><a href="/help/aboutus" category="About">关于拍拍贷</a>
                    <div class="subMenu">
                        <a href="/help/aboutus">关于我们</a>
                        <a href="/help/howworks">工作原理</a>
                        <a href="/help/fees">资费说明</a>
                            <a href="/job">招贤纳士</a>
                    </div>
                </li>
            </ul>
        </div>
    </div>
    

<div class="main" style="padding-top: 10px; margin-bottom: 20px;" id="content_nav">
    <div class="my-frame">
        <div>
            <ul style="border: none !important;" class="breadcrumb">
                <li><a href="http://www.ppdai.com">首页</a> <span class="divider">&gt;</span></li>
                <li><a href="http://www.ppdai.com/account">我的账户</a> <span class="divider">&gt;</span></li>
                <li><a href="http://loan.ppdai.com/account/repaymentlist">借款管理</a> <span class="divider">&gt;</span></li>
                <li class="active">上传资料<li>
            </ul>
        </div>
        <div class="clearfix">
            
<div class="wrapleftnav fl" style="width: 200px">
    <div class="my-f-left fl">
        <div class="my-f-l-nav">我的账户</div>
        <ul class="my-f-l-list">
                <li><a href="/account/borrow" >我的账户首页</a></li>

        </ul>
        <div class="my-f-l-nav">资金管理</div>
        <ul class="my-f-l-list">
            <li><a href="/moneyhistory" >资金记录</a></li>
            <li><a href="http://pay.ppdai.com/order/online" >充值</a></li>
            <li><a href="http://pay.ppdai.com/trade/cashwithdrawal" >提现</a></li>
        </ul>
            <div class="my-f-l-nav">借款管理</div>
            <ul class="my-f-l-list">
                <li><a href="/account/repaymentlist" >我的借款</a></li>
                <li><a href="/user/auth/videouser" >信息认证</a></li>
                <li><a href="/info/userdetail" >基本资料</a></li>
                <li><a href="/info/userdocuments" class=on>上传资料</a></li>
            </ul>

        <div class="my-f-l-nav">账户设置</div>
        <ul class="my-f-l-list">
            <li><a href="http://ac.ppdai.com/safe/setting" >安全中心</a></li>
            <li><a href="http://ac.ppdai.com/user/accountbind" >关联账户</a></li>
        </ul>
        <div class="my-f-l-nav">市场推广</div>
        <ul class="my-f-l-list">
            <li><a href="/account/spread" >有奖推荐</a></li>
            <li><a href="/account/paimoney/market?menu" >拍币兑换</a></li>
            <li><a href="/account/raffletickets" >我的抽奖券</a></li>
        </ul>

    </div>

    </div>
            <!--右边-->
            <div class="my-f-right fr">
                <div class="my-f-r-upload bdradius0">
                    <div class="my-f-r-sf-title c666">上传资料</div>
                    <div class="uploadDataAlert">进行中的列表资料将快速审核，未发布借款将在下次发布借款时审核。</div>
                    <div class="uploadData_tit clearfix">
                        <div class="float_l">
                            <input type="hidden" id="authid" value="5105760"/>
                            <span>温馨提示：</span><br />
                            1、请尽多提供能证明您还款能力的资料，缩短放款时间。<br />
                            2、上传的资料文件不超过10M/个。<br />
                            3、须是数码相机拍摄的完整原图，未经PS剪裁等处理，不可上传复印件或扫描件。<br />
                            4、拍拍贷是注重诚信的网络平台，若您上传的资料有伪造或人工修改痕迹，您会被加入系统黑名单，永久取消借款资格。<br />
                            5、拍拍贷有严格的加密系统，您的资料完全保密。 
                        </div>
                        <style>
                            .pl-chuan-ph {
                                background: url(./ppd_upLoadMes_files/upload.png) 0 0 no-repeat;
                                width: 264px;
                                height: 135px;
                                margin-top: 7px;
                            }

                            .pl-chuan-down {
                                height: 32px;
                                margin-left: 32px;
                                margin-top: 75px;
                                width: 108px;
                                display: block;
                                background: url(./ppd_upLoadMes_files/upload.png) 0-139px no-repeat;
                            }
                        </style>
                        <div class="pl-chuan-ph float_r ">
                            <a href="javascript:void(0)" id="a_download" class="pl-chuan-down"></a>
                        </div>
                    </div>
                        <table class="upload_nav_table" cellpadding="0" cellspacing="0">
                            <tr>
                                <th width="17"></th>
                                <th width="202">资料类型</th>
                                <th width="49">图片</th>
                                <th width="135">最近上传时间</th>
                                <th>未通过理由</th>
                                <th width="103">状态</th>
                            </tr>
                                <tr>
                                        <td class="center p10 bdln" rowspan="3" style="width: 14px;">必传项</td>

                                    <td class="p5">身份证：本人身份证的正、反两面照片，本人手持身份证合照共计三张照片</td>
                                    <td class="center"><a href="/viewfile/1" class="blue">(0)张</a></td>
                                    <td class="center"></td>
                                    <td></td>
                                    <td class="center p12 bdrn"> <a class='blue uploadBtn' frontdocumentid=1 description='资料要求:1、上传本人二代身份证正反面照片及本人与身份证合照，图片文字需清晰可见。图片尺寸需要小于10M。身份证上的所有信息清晰可见，必须能看清证件号。照片需免冠，建议未化妆，手持证件人的五官清晰可见。照片内容真实有效，不得做任何修改。2、资料请由照相机或高清手机拍摄，并将照片原图上传。请勿将照片剪切或修改，请勿上传复印件或扫描件。'filetype='*.jpg;*.jpeg;*.gif;*.png;*.giff' comment='' href='javascript:void(0);'>上传资料</a></td>
                                </tr>
                                <tr>

                                    <td class="p5">稳定工作证明（劳动合同，工作证，工牌，名片等）</td>
                                    <td class="center"><a href="/viewfile/18" class="blue">(0)张</a></td>
                                    <td class="center"></td>
                                    <td></td>
                                    <td class="center p12 bdrn"> <a class='blue uploadBtn' frontdocumentid=18 description='资料要求： 1、显示公司名称及本人姓名的劳动合同原件、工作证、工牌或名片完整照片原图（劳动合同请按顺序从第一页拍至最后一页），图片文字需清晰可见。图片尺寸需要小于10M。 2、资料请由照相机或高清手机拍摄，并将照片原图上传。请勿将照片剪切或修改，请勿上传复印件或扫描件。'filetype='*.jpg;*.jpeg;*.gif;*.png;*.giff' comment='' href='javascript:void(0);'>上传资料</a></td>
                                </tr>
                                <tr>

                                    <td class="p5">个人常用银行流水(近三个月连续银行流水及银行卡正反面)</td>
                                    <td class="center"><a href="/viewfile/43" class="blue">(0)张</a></td>
                                    <td class="center"></td>
                                    <td></td>
                                    <td class="center p12 bdrn"> <a class='blue uploadBtn' frontdocumentid=43 description='资料要求: 1、图片文字需清晰可见。 2、资料请由照相机或高清手机拍摄，并将照片原图上传。请勿将照片剪切或修改，请勿上传复印件或扫描件。'filetype='*.jpg;*.jpeg;*.gif;*.png;*.giff;*.txt;*.csv' comment='' href='javascript:void(0);'>上传资料</a></td>
                                </tr>

                        </table>
                        <div id="Can_pass" style="display: none;">
                            <table class="upload_nav_table" cellpadding="0" cellspacing="0">
                                    <tr>
                                            <td width="14" class="center p10 bdtn bdln" rowspan="21">可传项</td>

                                        <td width="191" class="center p5 bdtn">个人护照</td>
                                        <td width="48" class="center bdtn"><a href="/viewfile/2" class="blue">(0)张</a></td>
                                        <td width="135" class="center bdtn"></td>
                                        <td class="bdtn"></td>
                                        <td width="103" class="center bdtn p12 bdrn"> <a class='blue uploadBtn' frontdocumentid=2 description='资料要求：&nbsp;1、上传本人护照完整页照片（从第一页拍至最后一页），图片文字需清晰可见。图片尺寸需要小于10M。&nbsp;2、资料请由照相机或高清手机拍摄，并将照片原图上传。请勿将照片剪切或修改，请勿上传复印件或扫描件。'filetype='*.jpg;*.jpeg;*.gif;*.png;*.giff' comment='' href='javascript:void(0);'>上传资料</a></td>
                                    </tr>
                                    <tr>

                                        <td width="191" class="center p5 bdtn">港澳台通行证</td>
                                        <td width="48" class="center bdtn"><a href="/viewfile/3" class="blue">(0)张</a></td>
                                        <td width="135" class="center bdtn"></td>
                                        <td class="bdtn"></td>
                                        <td width="103" class="center bdtn p12 bdrn"> <a class='blue uploadBtn' frontdocumentid=3 description='资料要求：&nbsp;1、本人大陆居民往来港澳通行证或大陆居民往来台湾通行证完整页照片（请按顺序从第一页拍至最后一页），图片文字需清晰可见。图片尺寸需要小于10M。&nbsp;&nbsp;2、资料请由照相机或高清手机拍摄，并将照片原图上传。请勿将照片剪切或修改，请勿上传复印件或扫描件。'filetype='*.jpg;*.jpeg;*.gif;*.png;*.giff' comment='' href='javascript:void(0);'>上传资料</a></td>
                                    </tr>
                                    <tr>

                                        <td width="191" class="center p5 bdtn">机动车驾驶证（正副本）</td>
                                        <td width="48" class="center bdtn"><a href="/viewfile/4" class="blue">(0)张</a></td>
                                        <td width="135" class="center bdtn"></td>
                                        <td class="bdtn"></td>
                                        <td width="103" class="center bdtn p12 bdrn"> <a class='blue uploadBtn' frontdocumentid=4 description='资料要求：&nbsp;1、本人机动车驾驶证正副页完整照片，图片文字需清晰可见。图片尺寸需要小于10M。&nbsp;2、资料请由照相机或高清手机拍摄，并将照片原图上传。请勿将照片剪切或修改，请勿上传复印件或扫描件。'filetype='*.jpg;*.jpeg;*.gif;*.png;*.giff' comment='' href='javascript:void(0);'>上传资料</a></td>
                                    </tr>
                                    <tr>

                                        <td width="191" class="center p5 bdtn">学历学位证书</td>
                                        <td width="48" class="center bdtn"><a href="/viewfile/5" class="blue">(0)张</a></td>
                                        <td width="135" class="center bdtn"></td>
                                        <td class="bdtn"></td>
                                        <td width="103" class="center bdtn p12 bdrn"> <a class='blue uploadBtn' frontdocumentid=5 description='资料要求： 1、本人最高学历学位证书完整照片，图片需清晰可见。图片尺寸需要小于10M。 2、资料请由照相机或高清手机拍摄，并将照片原图上传。请勿将照片剪切或修改，请勿上传复印件或扫描件。'filetype='*.jpg;*.jpeg;*.gif;*.png;*.giff' comment='' href='javascript:void(0);'>上传资料</a></td>
                                    </tr>
                                    <tr>

                                        <td width="191" class="center p5 bdtn">岗位资质证书</td>
                                        <td width="48" class="center bdtn"><a href="/viewfile/6" class="blue">(0)张</a></td>
                                        <td width="135" class="center bdtn"></td>
                                        <td class="bdtn"></td>
                                        <td width="103" class="center bdtn p12 bdrn"> <a class='blue uploadBtn' frontdocumentid=6 description='资料要求： 1、本人岗位资质证书（如教师资格证、律师资格证、会计从业资格证等）完整照片，图片文字需清晰可见。图片尺寸需要小于10M。 2、资料请由照相机或高清手机拍摄，并将照片原图上传。请勿将照片剪切或修改，请勿上传复印件或扫描件。 'filetype='*.jpg;*.jpeg;*.gif;*.png;*.giff' comment='' href='javascript:void(0);'>上传资料</a></td>
                                    </tr>
                                    <tr>

                                        <td width="191" class="center p5 bdtn">居民户口簿（第一页至最后页）</td>
                                        <td width="48" class="center bdtn"><a href="/viewfile/7" class="blue">(0)张</a></td>
                                        <td width="135" class="center bdtn"></td>
                                        <td class="bdtn"></td>
                                        <td width="103" class="center bdtn p12 bdrn"> <a class='blue uploadBtn' frontdocumentid=7 description='资料要求： 1、本人家庭户口薄（需含本人户口页）完整照片（按顺序从第一页拍至空白页），图片文字需清晰可见。图片尺寸需要小于10M。 2、资料请由照相机或高清手机拍摄，并将照片原图上传。请勿将照片剪切或修改，请勿上传复印件或扫描件。'filetype='*.jpg;*.jpeg;*.gif;*.png;*.giff' comment='' href='javascript:void(0);'>上传资料</a></td>
                                    </tr>
                                    <tr>

                                        <td width="191" class="center p5 bdtn">结婚证</td>
                                        <td width="48" class="center bdtn"><a href="/viewfile/8" class="blue">(0)张</a></td>
                                        <td width="135" class="center bdtn"></td>
                                        <td class="bdtn"></td>
                                        <td width="103" class="center bdtn p12 bdrn"> <a class='blue uploadBtn' frontdocumentid=8 description='资料要求： 1、本人结婚证完整照片（按顺序从第一页拍至最后一页），图片文字需清晰可见。图片尺寸需要小于10M。  2、资料请由照相机或高清手机拍摄，并将照片原图上传。请勿将照片剪切或修改，请勿上传复印件或扫描件。'filetype='*.jpg;*.jpeg;*.gif;*.png;*.giff' comment='' href='javascript:void(0);'>上传资料</a></td>
                                    </tr>
                                    <tr>

                                        <td width="191" class="center p5 bdtn">亲友身份证（正反面）</td>
                                        <td width="48" class="center bdtn"><a href="/viewfile/9" class="blue">(0)张</a></td>
                                        <td width="135" class="center bdtn"></td>
                                        <td class="bdtn"></td>
                                        <td width="103" class="center bdtn p12 bdrn"> <a class='blue uploadBtn' frontdocumentid=9 description='资料要求：&nbsp;1、本人亲友二代身份证正反面照片，若已婚，则请上传本人配偶身份证；若未婚，则请上传户口本内任一亲属身份证。图片文字需清晰可见。图片尺寸需要小于10M。&nbsp;2、资料请由照相机或高清手机拍摄，并将照片原图上传。请勿将照片剪切或修改，请勿上传复印件或扫描件。&nbsp;&nbsp;注：提交本项资料时，请同时提交相关关系证明（结婚证或户口本资料）。'filetype='*.jpg;*.jpeg;*.gif;*.png;*.giff' comment='' href='javascript:void(0);'>上传资料</a></td>
                                    </tr>
                                    <tr>

                                        <td width="191" class="center p5 bdtn">亲友合照（3-5张）</td>
                                        <td width="48" class="center bdtn"><a href="/viewfile/10" class="blue">(0)张</a></td>
                                        <td width="135" class="center bdtn"></td>
                                        <td class="bdtn"></td>
                                        <td width="103" class="center bdtn p12 bdrn"> <a class='blue uploadBtn' frontdocumentid=10 description='资料要求：1、本人与亲友合照3-5张。2、图像清晰，图片尺寸小于10M'filetype='*.jpg;*.jpeg;*.gif;*.png;*.giff' comment='' href='javascript:void(0);'>上传资料</a></td>
                                    </tr>
                                    <tr>

                                        <td width="191" class="center p5 bdtn">个人住房租赁合同</td>
                                        <td width="48" class="center bdtn"><a href="/viewfile/11" class="blue">(0)张</a></td>
                                        <td width="135" class="center bdtn"></td>
                                        <td class="bdtn"></td>
                                        <td width="103" class="center bdtn p12 bdrn"> <a class='blue uploadBtn' frontdocumentid=11 description='资料要求：1、本人现居住地址租房合同原件完整照片（按顺序从第一页拍至最后一页），图片文字需清晰可见。图片尺寸需要小于10M。          2、资料请由照相机或高清手机拍摄，并将照片原图上传。请勿将照片剪切或修改，请勿上传复印件或扫描件。'filetype='*.jpg;*.jpeg;*.gif;*.png;*.giff' comment='' href='javascript:void(0);'>上传资料</a></td>
                                    </tr>
                                    <tr>

                                        <td width="191" class="center p5 bdtn">水、电、煤、固定电话账单/信用卡、保险对账单(近3个月)</td>
                                        <td width="48" class="center bdtn"><a href="/viewfile/12" class="blue">(0)张</a></td>
                                        <td width="135" class="center bdtn"></td>
                                        <td class="bdtn"></td>
                                        <td width="103" class="center bdtn p12 bdrn"> <a class='blue uploadBtn' frontdocumentid=12 description='资料要求： 1、最近3个月内任意一月公共事业费账单或个人金融对账单完整照片，图片文字需清晰可见。图片尺寸需要小于10M。  2、资料请由照相机或高清手机拍摄，并将照片原图上传。请勿将照片剪切或修改，请勿上传复印件或扫描件。 注：金融对账单姓名需显示为本人；公共事业费账单户名若显示非本人则需提交先关关系证明。 账单地址为现居住地的水、电、煤、手机、固定电话等公共事业费账单；账单地址为现居住地的信用卡、保险等个人金融对账单'filetype='*.jpg;*.jpeg;*.gif;*.png;*.giff' comment='' href='javascript:void(0);'>上传资料</a></td>
                                    </tr>
                                    <tr>

                                        <td width="191" class="center p5 bdtn">购房证明(房产证，购房合同等)</td>
                                        <td width="48" class="center bdtn"><a href="/viewfile/13" class="blue">(0)张</a></td>
                                        <td width="135" class="center bdtn"></td>
                                        <td class="bdtn"></td>
                                        <td width="103" class="center bdtn p12 bdrn"> <a class='blue uploadBtn' frontdocumentid=13 description='资料要求： 1、本人/配偶房产证、银行房贷合同、房屋买卖合同原件完整照片（按顺序从第一页拍至最后一页），图片文字需清晰可见。图片尺寸需要小于10M。  2、资料请由照相机或高清手机拍摄，并将照片原图上传。请勿将照片剪切或修改，请勿上传复印件或扫描件。 注：1.若以上房产证明所有人为配偶，则需提交结婚证及配合身份证 'filetype='*.jpg;*.jpeg;*.gif;*.png;*.giff' comment='' href='javascript:void(0);'>上传资料</a></td>
                                    </tr>
                                    <tr>

                                        <td width="191" class="center p5 bdtn">机动车行驶证</td>
                                        <td width="48" class="center bdtn"><a href="/viewfile/14" class="blue">(0)张</a></td>
                                        <td width="135" class="center bdtn"></td>
                                        <td class="bdtn"></td>
                                        <td width="103" class="center bdtn p12 bdrn"> <a class='blue uploadBtn' frontdocumentid=14 description='资料要求： 1、本人机动车行驶证正副页完整照片，图片文字需清晰可见。图片尺寸需要小于10M。 2、资料请由照相机或高清手机拍摄，并将照片原图上传。请勿将照片剪切或修改，请勿上传复印件或扫描件。'filetype='*.jpg;*.jpeg;*.gif;*.png;*.giff' comment='' href='javascript:void(0);'>上传资料</a></td>
                                    </tr>
                                    <tr>

                                        <td width="191" class="center p5 bdtn">其他网站借款截屏</td>
                                        <td width="48" class="center bdtn"><a href="/viewfile/15" class="blue">(0)张</a></td>
                                        <td width="135" class="center bdtn"></td>
                                        <td class="bdtn"></td>
                                        <td width="103" class="center bdtn p12 bdrn"> <a class='blue uploadBtn' frontdocumentid=15 description='资料要求： 1、本人他处所有借款账户完整截屏原图，图片文字需清晰可见。图片尺寸需要小于10M。 友情提醒：若发现本人未如实提交他处借款情况，一经发现有权取消借款资格。'filetype='*.jpg;*.jpeg;*.gif;*.png;*.giff' comment='' href='javascript:void(0);'>上传资料</a></td>
                                    </tr>
                                    <tr>

                                        <td width="191" class="center p5 bdtn">其他所有贷款协议/凭证（包括亲戚朋友等处借款）</td>
                                        <td width="48" class="center bdtn"><a href="/viewfile/16" class="blue">(0)张</a></td>
                                        <td width="135" class="center bdtn"></td>
                                        <td class="bdtn"></td>
                                        <td width="103" class="center bdtn p12 bdrn"> <a class='blue uploadBtn' frontdocumentid=16 description='资料要求：1、本人他处所有贷款协议/凭证（包括亲戚朋友等处借款）完整照片原图，图片文字需清晰可见。图片尺寸需要小于10M。&nbsp;2、资料请由照相机或高清手机拍摄，并将照片原图上传。请勿将照片剪切或修改，请勿上传复印件或扫描件。&nbsp;友情提醒：若发现本人未如实提交他处借款情况，一经发现有权取消借款资格。'filetype='*.jpg;*.jpeg;*.gif;*.png;*.giff' comment='' href='javascript:void(0);'>上传资料</a></td>
                                    </tr>
                                    <tr>

                                        <td width="191" class="center p5 bdtn">央行征信报告（央行柜台打印个人查询版）</td>
                                        <td width="48" class="center bdtn"><a href="/viewfile/17" class="blue">(0)张</a></td>
                                        <td width="135" class="center bdtn"></td>
                                        <td class="bdtn"></td>
                                        <td width="103" class="center bdtn p12 bdrn"> <a class='blue uploadBtn' frontdocumentid=17 description='资料要求： 1、最近一年内本人信用报告完整照片原图（按顺序从第一页拍至最后一页，图片文字需清晰可见。图片尺寸需要小于10M。  2、资料请由照相机或高清手机拍摄，并将照片原图上传。请勿将照片剪切或修改，请勿上传复印件或扫描件。'filetype='*.jpg;*.jpeg;*.gif;*.png;*.giff;*.pdf' comment='' href='javascript:void(0);'>上传资料</a></td>
                                    </tr>
                                    <tr>

                                        <td width="191" class="center p5 bdtn">企业/个体户证明（营业执照等）</td>
                                        <td width="48" class="center bdtn"><a href="/viewfile/20" class="blue">(0)张</a></td>
                                        <td width="135" class="center bdtn"></td>
                                        <td class="bdtn"></td>
                                        <td width="103" class="center bdtn p12 bdrn"> <a class='blue uploadBtn' frontdocumentid=20 description='资料要求: 1、本人企业营业执照正副本或税务登记证或组织机构代码证完整照片，图片文字需清晰可见。 2、资料请由照相机或高清手机拍摄，并将照片原图上传。请勿将照片剪切或修改，请勿上传复印件或扫描件。 3、个体工商户只需提供个体工商户营业执照正副本；除个体工商户以外需提供企业法人营业执照正副本、税务登记证、组织机构代码证。 注：除个体工商户以外的企业还需补充企业验资报告。'filetype='*.jpg;*.jpeg;*.gif;*.png;*.giff' comment='' href='javascript:void(0);'>上传资料</a></td>
                                    </tr>
                                    <tr>

                                        <td width="191" class="center p5 bdtn">其他资料（其他能说明您收入、资产职务或素质的有效资料）</td>
                                        <td width="48" class="center bdtn"><a href="/viewfile/41" class="blue">(0)张</a></td>
                                        <td width="135" class="center bdtn"></td>
                                        <td class="bdtn"></td>
                                        <td width="103" class="center bdtn p12 bdrn"> <a class='blue uploadBtn' frontdocumentid=41 description=''filetype='*.jpg;*.jpeg;*.gif;*.png;*.giff' comment='' href='javascript:void(0);'>上传资料</a></td>
                                    </tr>
                                    <tr>

                                        <td width="191" class="center p5 bdtn">支付宝账户信息（支付宝账户基本信息和支付宝上一年度个人年度对账单）</td>
                                        <td width="48" class="center bdtn"><a href="/viewfile/44" class="blue">(0)张</a></td>
                                        <td width="135" class="center bdtn"></td>
                                        <td class="bdtn"></td>
                                        <td width="103" class="center bdtn p12 bdrn"> <a class='blue uploadBtn' frontdocumentid=44 description='资料要求:1、上传本人支付宝账户基本信息和支付宝上一年度个人年度对账单全屏原图，图片文字需清晰可见。图片尺寸需要小于10M。'filetype='*.jpg;*.jpeg;*.gif;*.png;*.giff' comment='' href='javascript:void(0);'>上传资料</a></td>
                                    </tr>
                                    <tr>

                                        <td width="191" class="center p5 bdtn">微博账户截屏（转发拍拍贷官方微博截屏和微博个人信息页面截屏）</td>
                                        <td width="48" class="center bdtn"><a href="/viewfile/45" class="blue">(0)张</a></td>
                                        <td width="135" class="center bdtn"></td>
                                        <td class="bdtn"></td>
                                        <td width="103" class="center bdtn p12 bdrn"> <a class='blue uploadBtn' frontdocumentid=45 description='资料要求:1、上传本人微博账户全屏原图，图片文字需清晰可见。2、转发拍拍贷官方微博截屏，原图，图片文字需清晰可见。图片尺寸需要小于10M。'filetype='*.jpg;*.jpeg;*.gif;*.png;*.giff' comment='' href='javascript:void(0);'>上传资料</a></td>
                                    </tr>
                                    <tr>

                                        <td width="191" class="center p5 bdtn">相关文件（借款详情页展示）</td>
                                        <td width="48" class="center bdtn"><a href="/viewfile/67" class="blue">(0)张</a></td>
                                        <td width="135" class="center bdtn"></td>
                                        <td class="bdtn"></td>
                                        <td width="103" class="center bdtn p12 bdrn"> <a class='blue uploadBtn' frontdocumentid=67 description=''filetype='' comment='' href='javascript:void(0);'>上传资料</a></td>
                                    </tr>

                            </table>
                        </div>
                        <p class="slideToggle">补充提交资料，借款更快速！点击收起</p>

                </div>
                <!--右边结束-->
            </div>
        </div>
    </div>
</div>

<div id="div_download" style="display: none;">
    <form id="form_download">
        <h4 class="downtitle">
            <span class="anytiemtrans">手机也能传资料</span>
        </h4>
        <div class="clearfix" style="padding-top: 20px;">
            <div class="twodimensional float_l">
                <span class="dimensionalcode c39a1ea">立即扫描：</span>
                <div class="dimensionalimg">
                    <img src="./ppd_upLoadMes_files/tookapass.png" alt="" width="150" height="150" />
                </div>
            </div>
            <div class="pl27 float_l">
                <span class="downTwo c39a1ea">其他下载方式：</span>
                <div class="mlt17">
                    <span class="downmoblie fl"></span>
                    <div class="fl" style="position: relative;">
                        <span id="mobileNumberSpn" class="mobileNumber">手机号</span>
                        <input type="text" class="phonenumber" id="PhoneNumber" data-validation-engine="validate[required,custom[phone]]" />
                        <input type="button" class="  sendmobile blue-btn" value="下载到手机" />
                    </div>
                </div>
                <div class="mlt15">
                    <span class="downmocomputer fl"></span>
                    <input class="  clickdown blue-btn" type="button" value="下载到电脑" />
                </div>

            </div>
        </div>
        <div class="friendlind">
            友情提示:<br />
            1.打开任意可扫描软件（如微信、支付宝、手机浏览器等），启动摄像头扫描二维码即可。<br />
            2.若您的手机像素小于300万，建议换用数码相机拍摄并上传。<br />
            3.建议您在wifi环境下操作。
        </div>
    </form>
</div>

<div id="example" onmouseover="OpenExample();" onmouseout='$(this).hide();' class="delog"
    style="display: none; position: absolute">
    <div class="delogtit bold">
        参考样图（此为样图，所以有遮蔽，您上传的图片不能有遮蔽和PS处理。）
    </div>
    <div class="delogimgnav ">
        <div class="delogimg">
            <img style="width: 500px;" id="exampleImg" />
        </div>
        <div class="iconnav">
            <span id="example_left" style="cursor: pointer;" onclick="javascript:eb.left();">&lt;&lt;上一张</span>&nbsp;&nbsp;&nbsp;&nbsp;
                <span id="example_right" style="cursor: pointer;" onclick="javascript:eb.right();">下一张&gt;&gt;</span>
        </div>
        <div class="dian">
        </div>
        <div class="bottomlistnav">
            <div id="example_description">
            </div>
        </div>
    </div>
</div>


    <div class="clear">
    </div>

    <div class="footer">
        <div class="footer_footerBottom">
            <ul class="footer_footerBottomNav clearfix">
                <li><span class="webindex"></span><a href="/">网站首页</a>|</li>
                <li><span class="aboutus"></span><a href="/help/aboutus">关于我们</a>|</li>
                <li><span class="mapsite"></span><a href="/home/sitemap">网站地图</a>|</li>
                <li><span class="webservice"></span><a href="/consult">客服中心</a>|</li>
                <li class="nomr"><span class="onlneserve"></span><a href="./ppd_upLoadMes_files/wpa.php?ln=1&key=XzgwMDAyNzUzNV8xODAzNjBfODAwMDI3NTM1XzJf" target="_blank">在线咨询</a></li>
            </ul>
            <p>Copyright Reserved 2007-2015©拍拍贷（www.ppdai.com）&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;沪ICP备05063398号&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;上海拍拍贷金融信息服务有限公司</p>


        </div>

    </div>

    <script src="./ppd_upLoadMes_files/jquery.js" type="text/javascript" charset="utf-8"></script>
    <script src="./ppd_upLoadMes_files/init.js" type="text/javascript" charset="utf-8"></script>
    <script src="./ppd_upLoadMes_files/servicestack-min.js"></script>
    <script src="./ppd_upLoadMes_files/jquery.cookie.js"></script>
    <script src="./ppd_upLoadMes_files/status?v=2014&tmp=635640113552997500" type="text/javascript"></script>
    
    <script>
        $(".my-f-l-list li a.on").closest(".my-f-l-list").prev(".my-f-l-nav").addClass("my-f-l-nav-sd");
        try {
            $("#tabIcon a[category='" + breadcrumbCategory + "']").addClass("tabon");
        } catch (e) {

        }
    </script>
    

    <script src="./ppd_upLoadMes_files/jquery-migrate-1.2.1.min.js"></script>
    <script type="text/javascript" src="./ppd_upLoadMes_files/swfupload.js"></script>
    <script type="text/javascript" src="./ppd_upLoadMes_files/swfupload.queue.js"></script>
    <script type="text/javascript" src="./ppd_upLoadMes_files/fileprogress.js"></script>
    <script type="text/javascript" src="./ppd_upLoadMes_files/handlers.js"></script>
    <script type="text/javascript" src="./ppd_upLoadMes_files/uploadSetting.js"></script>
    <script type="text/javascript" src="./ppd_upLoadMes_files/jquery.engine.js"></script>
    <script type="text/javascript" src="./ppd_upLoadMes_files/jquery.cookie.js"></script>
    <script type="text/javascript" src="./ppd_upLoadMes_files/ShowExample.js"></script>
    <script src="./ppd_upLoadMes_files/bootstrap.js"></script>
    <script type="text/javascript" src="./ppd_upLoadMes_files/customize.js?v=1"></script>
    <script src="./ppd_upLoadMes_files/validation.js?v=1"></script>
    <script src="./ppd_upLoadMes_files/validation-zh.js?v=1"></script>



    <script type="text/javascript">
        $(document).ready(function () {

            $("#mobileNumberSpn").live("click", function () {
                $(this).hide();
                $("#PhoneNumber").focus();
            });

            $("#PhoneNumber").live("keyup", function () {
                if ($.trim($(this).val()) == "") {
                    $("#mobileNumberSpn").show();
                } else {
                    $("#mobileNumberSpn").hide();
                }
            });
            $("#PhoneNumber").live("blur", function () {
                if ($.trim($(this).val()) == "") {
                    $("#mobileNumberSpn").show();
                } else {
                    $("#mobileNumberSpn").hide();
                }
            });

confirm('您当前无发布借款，如现上传资料将在下次发布借款时进行资料审核。是否现在发布借款。')? window.location='/borrow/createlist/1':'' 

            // 补充资料展开收缩切换
            $(".slideToggle").toggle(function () {
                $("#Can_pass").slideDown('fast');
                var height = $('.PPD_header_nav').outerHeight(true) + $('.footer').outerHeight(true) + 95;
                if ($(window).height() == $(document).height()) {
                    $('.main').animate({
                        height: $(window).height() - height
                    }, 200);

                } else {
                    $('.main').animate({
                        height: 'auto'
                    }, 200);
                }
                $.cookie('hasSlideDown', 'true');
                $(".slideToggle").html("补充提交资料，借款更快速！点击收起");
            }, function () {
                $("#Can_pass").slideUp('fast',function() {
                    var height = $('.PPD_header_nav').outerHeight(true) + $('.footer').outerHeight(true) + 95;
                    if ($(window).height() == $(document).height()) {
                       
                        $('.main').animate({
                            height: $(window).height() - height
                        }, 200);
                       
                    } else {
                      
                        $('.main').animate({
                            height: 'auto'
                        }, 200);
                       
                    }
                });
                $.cookie('hasSlideDown', null);
                $(".slideToggle").html("补充提交资料，借款更快速！点击展开");
            });

            if ($.cookie('hasSlideDown') == 'true') {
                $("#Can_pass").slideDown('fast');
                $(".slideToggle").html("补充提交资料，借款更快速！点击收起");
            } else {
                $(".slideToggle").html("补充提交资料，借款更快速！点击展开");
            }

            // 拍了传Android应用下载框提示
            var ajaxpram = {
                funboxPop: function (functionname, remark) {
                    this.functionname = functionname;
                    this.remark = remark;
                    $.post("/actionlog", { useraction: 'pailechuan', functionname: this.functionname, remark: this.remark });
                    var html = $("#div_download").html();
                    $("#a_download").PPDfloatDiv({
                        floatwidth: 622,
                        floatheight: 460,
                        btnshow: false,
                        floatbgtype: true,
                        handertext: '拍了传<span style="font-size:16px;" >（安卓版）</span>',
                        context: html
                    });
                    $("#div_download").html('');
                    $('#modalbackdroptrue').on('hide', function () {
                        $('#div_download').append(html);
                    });
                }
            };

            $("#a_download").click(function () {
                ajaxpram.funboxPop('拍了传窗口弹出框', '上传资料页，直接点击【点击下载】button弹出');
            });

            var downApp = {
                cookieKey: function () {
                    var user = 'pdu78374482';
                    var key = 'info_userdocuments_dlapp_alertcount_' + user;
                    return key;
                },
                cookieOptions: { expires: 1, path: '/', domain: 'www.ppdai.com', secure: false },
                set: function (num, expires) {
                    var that = this;
                    that.cookieOptions.expires = expires;
                    $.cookie(that.cookieKey(), num, that.cookieOptions);
                    that.cookieOptions.expires = 1;
                },
                get: function () {
                    var that = this;
                    return $.cookie(that.cookieKey());
                },
                alertCount: function () {
                    var that = this;
                    var num = that.get();
                    if (num == null) {
                        num = '0';
                    }
                    return num;
                },
                init: function () {
                    var that = this;
                    var num = that.alertCount();
                    switch (num) {
                        case '-1':
                        case '2':
                            //today have alert
                            break;
                        case '1':
                            ajaxpram.funboxPop('拍了传窗口弹出框', '上传资料页，打开时弹出');
                            downApp.set('2', 1);
                            break;
                        case '4':
                            ajaxpram.funboxPop('拍了传窗口弹出框', '上传资料页，关闭上传控件后弹出');
                            downApp.set('2', 1);
                            break;
                        case '0':
                        default:
                            ajaxpram.funboxPop('拍了传窗口弹出框', '上传资料页，打开时弹出');
                            downApp.set('1', 1);
                            break;
                    }
                    $("#form_download").validationEngine();
                },
                setNerverClick: function () {
                    var that = this;
                    that.set('-1', 3650);
                }
            };
            downApp.init();

            $('.sendmobile').live("click", function () {
                var gateway = new servicestack.ClientGateway('http://' + window.location.host);
                $("#form_download").validationEngine();
                if ($("#form_download").validationEngine('validate')) {
                    $.post("/actionlog", { useraction: 'pailechuan', functionname: "拍了传下载", remark: "发送到手机下载" });
                    downApp.setNerverClick();
                    var data = { PhoneNumber: $('#PhoneNumber').val() };
                    gateway.postToService(
                        {
                            DocumentRequest: data
                        }, function (e) {
                            alert("短信已发送!");
                        }, function (e) {
                            alert(e.message);
                        }
                    );
                }
            });
            $('.clickdown').live("click", function () {
                $.post("/actionlog", { useraction: 'pailechuan', functionname: "拍了传下载", remark: "下载到电脑安装" });
                downApp.setNerverClick();
                window.open('http://static.ppdai.com/skin/PPD_Phone.apk?v=1');
            });


            //上传资料

            var swfu;//上传
            var uc;//备注
            var eb;//示例图
            $(".uploadBtn").newWindow({
                windowTitle: "上传文件",
                content: ResetUploadDiv(),
                width: 430,
                draggable: false,
                autoscrool: true,
                backgroundable: true,
                onBtnClosed: closeUploadBox
            });
            function closeUploadBox() {
                if (downApp.alertCount() == '1') {
                    downApp.set('4', 1);
                }
                document.location.reload();
            }
            function ResetUploadDiv() {
                var html = new Array();
                html.push('<div>');
                html.push('<div class="fieldset flash" style="height:200px; overflow:auto" id="fsUploadProgress"></div>');
                html.push('<div id="divStatus"></div>');
                html.push('<div style="padding-left:10px;">');
                html.push('<span id="spanButtonPlaceHolder" style="display:block;height:200px;overflow:auto"></span>');
                html.push('<input id="btnCancel" class="btn" type="button" style="display:none; margin-left:10px;" value="取消上传"');
                html.push('style="margin-left: 2px; font-size: 8pt; height: 29px;" />');
                html.push('<label style="font-size:12px;display:inline"> (按ctrl或shift键可一次上传多图)</label>');
                html.push('</div>');
                html.push('<div class="uploaddescription" style="padding:10px;"><span id="uploadDescription" ></span></div>');
                html.push('</div>');
                return html.join("");
            }

            $(".uploadBtn").click(function () {
                var frontDocumentId = $(this).attr("frontDocumentId");//documentid
                var fileType = $(this).attr("fileType");//文件类型
                var comment = $(this).attr("comment");//文件评论
                var description = $(this).attr("description");//文件描述
                uc = new UserComment("userComment", "updateComment", "saveComment", "cannelComment", comment, frontDocumentId, description);

                var setting = new UploadSetting({
                    ProgressId: "fsUploadProgress",
                    UploadId: "btnUpload",
                    CancelId: "btnCancel",
                    PlaceId: "spanButtonPlaceHolder",
                    Url: "http://" + window.location.host + "/upload",
                    Size: 10,
                    FileCount: 20,
                    Types: fileType,//"*.jpg;*.jpeg;*.gif;*.png;*.giff;*.txt;*.csv";"*.pdf",
                    TypeDesc: "",
                    //CompletedEvent: function () { setTimeout("document.location.reload();", 3000); },
                    Param: { "FrontDocumentId": frontDocumentId, "UpLoadFileType": 1, "UserId": $("#authid").val() }
                });
                swfu = new SWFUpload(setting);
            });

            $("#btnCancel").live("click", function () {
                swfu.cancelQueue();
            });

        });//document

        var UserComment = function (elementId, updateId, saveId, cannelId, comment, frontDocumentId, description) {
            this.ElementId = elementId;
            this.UpdateId = updateId;
            this.SaveId = saveId;
            this.CannelId = cannelId;
            this.FrontDocumentId = frontDocumentId;
            this.EditId = "EditUserComment";
            this.DescriptionId = "uploadDescription";
            this.DefaultComment = "无";
            this.userCommentValue = comment;
            this.Description = description;
            this.init();
        };
        UserComment.prototype = {
            _getId: function (id) {
                return document.getElementById(id);
            },
            init: function () {
                //var userComment = this.userCommentValue == "" ? this._getId(this.ElementId).innerHTML : this.userCommentValue;
                //this._getId(this.ElementId).innerHTML = userComment == "" ? this.DefaultComment : userComment;
                this._getId(this.DescriptionId).innerHTML = this.Description;
            },
            getUserComment: function () {
                this.userCommentValue = this._getId(this.ElementId).innerHTML;
                this.userCommentValue = this.userCommentValue == this.DefaultComment ? "" : this.userCommentValue;
                return this.userCommentValue;
            },
            UpdateUserComment: function () {
                var comment = this.getUserComment();
                var html = '<input id="' + this.EditId + '" type="text" style="width:280px;" value="' + comment + '" />';
                this._getId(this.ElementId).innerHTML = html;
                this.ControlButton(true);
            },
            SaveUserComment: function () {
                this.userCommentValue = this._getId(this.EditId).value;
                this._getIduserCommentValue = this.userCommentValue == this.DefaultComment ? "" : this.userCommentValue;
                this.CannelUserComment();
                $.ajax({
                    url: "FileView.aspx?Type=UpdateUserComment&FrontDocumentId=" + this.FrontDocumentId + "&UserComment=" + escape(this.userCommentValue)
                });
            },
            CannelUserComment: function () {
                this.userCommentValue = this.userCommentValue == "" ? this.DefaultComment : this.userCommentValue;
                this._getId(this.ElementId).innerHTML = this.userCommentValue;
                this.ControlButton(false);
            },
            ControlButton: function (isEdit) {
                this._getId(this.UpdateId).style.display = isEdit ? "none" : "";
                this._getId(this.SaveId).style.display = isEdit ? "" : "none";
                this._getId(this.CannelId).style.display = isEdit ? "" : "none";
            }
        };
    </script>


    <!-- Google Tag Manager -->
    <noscript>
        <iframe src="//www.googletagmanager.com/ns.html?id=GTM-PVQ5D8"
            height="0" width="0" style="display: none; visibility: hidden"></iframe>
    </noscript>
    <script>(function (w, d, s, l, i) {
    w[l] = w[l] || []; w[l].push({
        'gtm.start':
            new Date().getTime(), event: 'gtm.js'
    }); var f = d.getElementsByTagName(s)[0],
            j = d.createElement(s), dl = l != 'dataLayer' ? '&l=' + l : ''; j.async = true; j.src =
                '//www.googletagmanager.com/gtm.js?id=' + i + dl; f.parentNode.insertBefore(j, f);
})(window, document, 'script', 'dataLayer', 'GTM-PVQ5D8');</script>
    <!-- End Google Tag Manager -->
</body>
</html>
