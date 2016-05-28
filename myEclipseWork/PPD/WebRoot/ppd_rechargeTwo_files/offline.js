$(function () {
    $("#Amount").keydown(function (e) { /*只允许输入数字*/
        var key = [8, 37, 39, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 110, 190];
        if ($.inArray(e.which, key) < 0) {
            return false;
        }
    });

    $(".ppb-banner-charge").on('click', function () {
        window.open("http://www.ppdai.com/autobid/addrule");
    })
})

$(function () {
    //手机
    var timeId1 = null;
    $('.swimg').hover(function () {
        var _this = $(this);
        timeId1 = setTimeout(function () {
            _this.children('img').stop(true,true).slideDown();
        }, 400);

    }, function () {
        clearTimeout(timeId1);
        $(this).children('img').stop(true, true).slideUp(0);
    });

    //submit 提示信息
    $(".info_close").click(function () {
        $(this).parent().fadeOut();
    });
});

function IsNumeric(n) {
    return !isNaN(parseFloat(n)) && isFinite(n);
}

function CheckInput() {
    var orderNumber = $('input[id=ExternalDepositNo]').val();
    var $errorMessage = $(".alert-error").html("");

    if (orderNumber == null || orderNumber == "" || orderNumber == 'undefined') {
        $errorMessage.html("商户订单号不能为空");
        $("#ExternalDepositNo").focus();
        return false;
    }

    if (orderNumber.indexOf(" ") != -1) {
        $errorMessage.html("商户订单号不能包含空格");
        $("#ExternalDepositNo").focus();
        return false;
    }

    if (!IsNumeric(orderNumber)) {
        $errorMessage.html("请输入正确商户订单号");
        $("#ExternalDepositNo").focus();
        return false;
    }

    if (orderNumber.length != 17 && orderNumber.length != 19 &&
         orderNumber.length != 18 && orderNumber.length != 30 &&
         orderNumber.length != 28 && orderNumber.length != 32
        ) {
        $errorMessage.html("请输入正确填写交易号\商务订单号，长度应该为17，18，19，28，30或32");
        $("#ExternalDepositNo").focus();
        return false;
    }

    if (!IsNumeric($('input[id=Amount]').val())) {
        $errorMessage.html("请输入正确金额");
        $("#Amount").focus();
        return false;
    }

    var factAmount = parseFloat($('input[id=Amount]').val());
    if (!IsNumeric(factAmount)) {
        $errorMessage.html("请输入正确金额");
        $("#Amount").focus();
        return false;
    }

    if (factAmount <= 0) {
        $errorMessage.html("非即时充值需要大于0元");
        $("#Amount").focus();
        return false;
    }

    if (!checkMoneyFormat(factAmount)) {
        $errorMessage.html("请输入正确金额");
        $("#Amount").focus();
        return false;
    }

    if (factAmount > 10000000) {
        $errorMessage.html("请输入正确金额");
        $("#Amount").focus();
        return false;
    }
    window.onbeforeunload = function () {
    };
    return true;
}

function bind() {
    //window.open("http://b.ppdai.com/thirdpartylogin/thirdpartylogin.aspx?RelatedType=0&amp;ReturnUrlKey=ShowAccountBind");
    window.open("http://ac.ppdai.com/thirdparty/related?apptype=0");
}

var isShowUnload = true;

$(document).ready(function () {
    window.onbeforeunload = function (e) {
        if (isShowUnload) {
            var closeMsg = "请确保您已正确提交交易号或商户订单号！若未正确登记交易号或商户单号，您的充值资金可能无法到账。\n您确定已正确提交交易号并离开此页面吗？";
            return closeMsg;
        }
    };
    $("#10003").attr('class', 'tabon');
    $("#10003012").attr('class', 'li_on');
    $("#costlink").mouseenter(function () {
        $("#costinfo").show();
    });
    $("#costbox").mouseleave(function () {
        $("#costinfo").hide();
    });
    $("#linkalipay").live('mouseover', function () {
        $("body").append("<img src='http://www.ppdaicdn.com/img/recharge/alipay.png' id='alipay2w' style='position:absolute;top:" + ($(this).offset().top) + "px;left:" + $(this).offset().left + "px' width='185' height='185' />");
    });
    $("#alipay2w").live('mouseleave', function () {
        $("#alipay2w").remove();
    });
})

$(".my-f-l-list li a.on").closest(".my-f-l-list").prev(".my-f-l-nav").addClass("my-f-l-nav-sd");

function checkMoneyFormat(val) {
    var reg = /^(([0-9]+)|([0-9]+\.[0-9]{1,2}))$/;
    var isMoneyFormatRight = reg.test(val);
    return isMoneyFormatRight;
} checkMoneyFormat(0.01);

//复制
function copyToClipboard() {
    window.clipboardData.setData('text', 'in@ppdai.com');
}

function bindTranferAlipay()
{
    window.open("https://shenghuo.alipay.com/send/payment/fill.htm?optEmail=in@ppdai.com");
}