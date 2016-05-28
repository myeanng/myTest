$(function () {
    $(".remind_withdraw .remind_withdraw_content_option input").change(function () {
        var isChecked = $(".other_option:checked").length;
        if (isChecked) {
            $(this).parents(".remind_withdraw").find(".remind_withdraw_content_textBox").css("display", "block");
        } else {
            $(this).parents(".remind_withdraw").find(".remind_withdraw_content_textBox").css("display", "none");
        }
    });

    $(".remind_withdraw_close").click(function () {
        $(this).parents(".remind_withdraw").hide();
        $(".cover").hide();
    });

    $(".remind_withdraw_submit").click(function () {
        var remind_withdraw = $(this).parents(".remind_withdraw").eq(0), text = remind_withdraw.find(".remind_withdraw_content_textBox").val(),
        other = remind_withdraw.find(".remind_withdraw_content_option input.other_option:checked");
        if (!remind_withdraw.find(".remind_withdraw_content_option input:checked").length) {
            remind_withdraw.find(".remind_withdraw_error").text("客官，告诉我们提现的原因吧").show();
        } else if (other.length && !text) {
            remind_withdraw.find(".remind_withdraw_error").text("客官，请写点原因吧").show();
        } else if (other.length && (text.length < 5 || text.length > 200)) {
            remind_withdraw.find(".remind_withdraw_error").text("客官，提现原因需要在5-200个字之间").show();
        } else {
            var content = remind_withdraw.find(".remind_withdraw_content_option input:checked").val();
            if (content == "其他") {
                content += "（" + text + "）";
            }

            var params = {
                Content: escape(content)
            };

            $.post("/Trade/ProcessFeedback", params, function (data) {
                if (data.Code == 0) {
                    remind_withdraw.find(".remind_withdraw_error").hide();
                    $(".remind_withdraw").hide();
                    $(".cover").hide();
                    submit();
                }
                else {
                    remind_withdraw.find(".remind_withdraw_error").text("客官，您提交的信息异常，请重试");
                }
            });
        }
    });
})

$(document).ready(function () {
    $(".editbankcard").click(function (e) {
        e.preventDefault();
        e.stopPropagation()

        var bankAccountId = $(this).attr("bid");
        if (bankAccountId == null || bankAccountId == 'undefined' || bankAccountId == "")
            bankAccountId = 0;

        $(this).PPDfloatDiv({
            floatbgtype: true,
            floattruebtn: '保存帐号',
            floatfalsebtn: '取消',
            handertext: '编辑银行卡',
            btnshow: true,
            truebtnid: 'btnSave',
            btnalign: 'center',
            floatheight: 400, //650
            context: "<iframe scrolling='auto' width='100%' height='320' frameborder='0' src='/Trade/Addbank?BankAccountId=" + bankAccountId + "'></iframe>"
        });

        $('#modalbackdroptrue').on('hidden', function () {
            document.location.reload();
        });
    });
    $(".addbank").click(function () {
        $(this).PPDfloatDiv({
            floatbgtype: true,
            floattruebtn: '保存帐号',
            floatfalsebtn: '取消',
            handertext: '添加新银行卡',
            btnshow: true,
            truebtnid: 'btnSave',
            btnalign: 'center',
            floatheight: 400, //500
            context: "<iframe scrolling='auto' width='100%' height='320' frameborder='0' src='/Trade/Addbank'></iframe>"
        });

        $('#modalbackdroptrue').on('hidden', function () {
            document.location.reload();
        });
    });
    $("#Withdrawrule").mouseenter(function () {
        $(".ruletable").css('display', 'inline');
    });
    $("#Withdrawrule").mouseleave(function () {
        $(".ruletable").css('display', 'none')
    });
    $(".jue").click(function () {
        $(".jue").removeClass('jue_on');
        $(this).addClass('jue_on');
    });

    $(".cd-delete").click(function (e) {
        e.preventDefault();
        e.stopPropagation()
        if (confirm("确定删除该银行卡吗？")) {
            var url = "/Trade/RemoveBank?BankAccountId=" + $(this).attr("bid");

            $.getJSON(url, function (data) {
                if (data.ResponseMessage.Code == 0) {
                    window.location.href = "/Trade/CashWithDrawal?show=choose";
                }
                else {
                    alert("操作失败！");
                }
            })
        }
    });

    $(".cd-item").hover(function () {
        $(this).addClass("cd-item-hover");
        $(this).find(".cd-action").find(".manage").addClass("manage-hover");
    }, function () {
        $(this).removeClass("cd-item-hover");
        $(this).find(".cd-action").find(".manage").removeClass("manage-hover");
    });

    var elementId = $("#BankAccountId").val();
    var $element = $("#cardaccountId" + elementId);
    $element.attr("checked", true);
    radioChangeStyle($element);

    $("input[name='cardaccountId']").click(function () {
        radioChangeStyle($(this));
        var url = "/Trade/CashWithDrawal?BankAccountId=" + $(this).val();
        window.location.href = url;
    });

    $(".cd-item").on('click', function () {
        var $items = $("input[name='cardaccountId']:checked");
        if ($items.length == 0) {
            var $radioElement = $(this).find(".cardaccountId");
            radioChangeStyle($radioElement);
            var url = "/Trade/CashWithDrawal?BankAccountId=" + $radioElement.val();
            window.location.href = url;
        }
    });

    $(".choose-more").click(function () {
        chooseMoreStyle();
    });

    $(".choose-list-bg").on('click', function () {
        chooseMoreStyle();
    });

    $(".cd-action").hover(function () {
        $(this).addClass("cd-action-hover");
        $(".cd-down").addClass("cd-down-show");
        $(this).find(".manage").addClass("managehover");
        $(this).find(".managespan").addClass("managespanhover");
        $(this).find("ul").addClass("cd-action-list-show");

    }, function () {
        $(this).removeClass("cd-action-hover");
        $(".cd-down").removeClass("cd-down-show");
        $(this).find(".manage").removeClass("managehover");
        $(this).find(".managespan").removeClass("managespanhover");
        $(this).find("ul").removeClass("cd-action-list-show");

    });
    /*银行卡*/
});

function validateSubmit() {
    var BankAccountId = $("#BankAccountId").val();
    if (BankAccountId == "0" || BankAccountId == "" || BankAccountId == 'undefined' || BankAccountId == 0) {
        $(".error-summary").show().html("对不起，请选择银行卡");
        return false;
    }

    BankAccountId = $("input[name='cardaccountId']:checked").val();
    if (BankAccountId == "0" || BankAccountId == "" || BankAccountId == 'undefined' || BankAccountId == null) {
        $(".error-summary").show().html("对不起，请选择银行卡");
        return false;
    }

    var regex = /^(([1-9]\d{0,9})|0)(\.\d{1,2})?$/
    if (!regex.test($("#WithdrawAmount").val())) {
        $(".error-summary").show().html("请正确填写金额，最多2位小数");
        return false;
    }

    return true;
}

function radioChangeStyle(element) {
    if ($(element).prop("checked")) {
        if ($(element).parent().parent().index() > 0) {
            var zindex = $(element).parent().parent().siblings(":first").css("z-index");
            $(element).parent().parent().css("z-index", zindex);
        }

        $(element).parent().parent().css("top", "0").addClass("cd-item-select").siblings(".cd-item").css("top", "0");
        $(".cd-items").height(90);
        $(".choose-more").show();
        $(".choose-list-bg").show();
        $(element).parent().siblings(".cd-action").find(".manage").addClass("manage-select");
    } else {
        $(".choose-list-bg").hide();
        $(".choose-more").hide();
        $(element).parent().siblings(".cd-action").find(".manage").removeClass("manage-select");
    }
}

function chooseMoreStyle() {
    var zindex = $(".cd-item-select").css("z-index");
    $(".cd-item-select").find(".manage").removeClass("manage-select");

    $(".cd-item-select").removeClass("cd-item-select").find("input:radio").prop("checked", false);

    var i = 0;
    var maxtop = 0;
    $("[name='cardaccountId']").each(function () {
        $(this).parent().parent().css("z-index", zindex);
        zindex--;
        maxtop = i * 55;
        $(this).parent().parent().css("top", i * 55 + "px");
        i++;

    });
    maxtop = i * 56;
    $(".cd-items").height(maxtop);
    $(".choose-list-bg").hide();
    $(".choose-more").hide();
}

$(function () {
    if (window.location.href.toLowerCase().indexOf("?show=choose") > -1) {
        chooseMoreStyle();
    }

    changemoney(0);

    $(".cancelCashWithDrawal").on('click', function () {
        var money = parseFloat($(this).attr("money")).toFixed(2);
        var id = $(this).attr("wid");
        if (confirm("您确定要取消金额为：" + money + " 的取现申请吗？")) {
            $(this).attr("disabled", true);
            var url = "/Trade/CancelWithDrawal?withDrawalOrderId=" + id;

            $.get(url, function (data) {
                if (data.Code == 0) {
                    window.location = "/trade/cashwithdrawal";
                }
                else {
                    alert(data.Message);
                    $(this).attr("disabled", false);
                }
            });
        }
    });
});

function changemoney(str) {
    var thiss = $('.shoufei_nav').find('.inormal');
    var moneylevel = $("#WithdrawAmount").val();
    if (str == 0) {
        $("#txtCrawWithType").val(0);
        if (moneylevel <= 30000.00) {
            thiss.text(3);
        } else if (moneylevel > 30000.00) {
            thiss.text(6);
        }
        if (userLevel == 1) {
            thiss.text(3);
        } else if (userLevel == 2) {
            thiss.text(3);
        }
        thiss.text();
        $("#warmPrompt").hide();
    } else if (str == 1) {
        $("#txtCrawWithType").val(1);
        if (moneylevel <= 30000.00) {
            thiss.text(10);
        } else if (moneylevel > 30000.00) {
            thiss.text(20);
        }
        $("#warmPrompt").show();
    }
}
function IsNumeric(n) {
    return !isNaN(parseFloat(n)) && isFinite(n);
}

function submitWithdrawl() {
    if (!validateSubmit())
        return false;

    if (!IsNumeric($("#WithdrawAmount").val())) {
        $("#WithdrawAmount").focus();
        return false;
    }

    var crawWithType = $("#txtCrawWithType").val();
    var withdrawAmount = $("#WithdrawAmount").val();
    if (crawWithType == "1") {
        if (parseFloat(withdrawAmount) <= 10) {
            $("#WithdrawAmount").focus();
            $(".error-summary").empty().html("由于每笔手续费最低10元，因此提现金额必须高于10元。");
            return false;
        }
    }
    else {
        if (parseFloat(withdrawAmount) <= 3) {
            $("#WithdrawAmount").focus();
            $(".error-summary").empty().html("由于每笔手续费最低3元，因此提现金额必须高于3元。");
            return false;
        }
    }

    if (parseFloat(withdrawAmount) > 49999) {
        $("#WithdrawAmount").focus();
        $(".error-summary").empty().html("您的提现金额超过银行受理的49999元的额度，请分两笔或多笔提现。");
        return false;
    }

    $(".error-summary").empty();
    return true;
}

function submit() {
    var url = "/Trade/CashWithDrawalValid";
    var Poundage = $('.shoufei_nav').find('.inormal').text();
    url += "?BankAccountId=" + $("input[name='cardaccountId']:checked").val();
    url += "&WithdrawAmount=" + $("#WithdrawAmount").val();
    url += "&RealName=" + $("#RealName").val();
    url += "&LastUpdateDate=" + $("#LastUpdateDate").val();
    url += "&CrawWithType=" + $("#txtCrawWithType").val();
    url += "&ValidationNumber=";
    url += "&Poundage=" + Poundage;

    $(this).PPDfloatDiv({
        floatbgtype: true,
        floattruebtn: '确认提交',
        floatfalsebtn: false,
        handertext: '提现信息确认',
        btnshow: true,
        truebtnid: 'submitApply',
        btnalign: 'center',
        floatheight: 260, //650
        context: "<iframe scrolling='auto' width='100%' height='260' frameborder='0' src='" + url + "'></iframe>"
    });
}

$("#btn_submit").click(function () {
    if (!submitWithdrawl())
        return;

    var url = "/Trade/IsShowFeedback";
    var params = {
        amount: $("#WithdrawAmount").val()
    };

    $.post(url, params, function (data) {
        if (data.Code == 0) {
            $(".cover,.remind_withdraw").show();
            $(".remind_withdraw_content_title").empty().html("客官，提现后每年将损失" + (parseFloat(params.amount) * 0.12).toFixed(2) + "元收益呢。能告诉我们取现的原因吗?")
        }
        else {
            submit();
        }
    });
});

$("#WithdrawAmount").keyup(function () {
    changemoney($("#txtCrawWithType").val());
});