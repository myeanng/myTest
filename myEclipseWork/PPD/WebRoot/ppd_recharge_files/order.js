﻿
$(document).ready(function () {
    $("#10003").attr('class', 'tabon');
    $("#10003012").attr('class', 'li_on');

    $(".morebank").live('click', function () {
        $(".card").hide();
        $(".bank_nav").show();
        $("#content_nav").animate({ height: '+=350px' }, 0);
        $("input[name='SelectedBankId']").attr("checked", false);
    });

    $(".inititem").live('click', function () {
        var bgClass = $(this).attr('class');
        var content = "<span class=\"" + bgClass + "\" ></span>";
        $(this).parent().prev().find("input[type='radio']").attr('checked', 'checked');
        var selectedBankId = $("input[name='SelectedBankId']:checked").val();
        var channelId = $("input[name='SelectedBankId']:checked").attr("channel");
        $.cookie("selectedbankId", selectedBankId);
        var viewVersion = $.cookie("ui-version");

        var $card = $(".card");
        $(".bank_nav").hide();

        if (viewVersion == "2014") {
            $card.empty().show().html("<table cellpadding=\"0\" cellspacing=\"0\"><tr><td><input name=\"SelectedBankId\" channel=\"" + channelId + "\" type=\"radio\" value=\"" + selectedBankId + "\"  checked=\"checked\" style=\"margin-left: 0;\" /></td><td>" + content + "</td><td><div class=\"my-ac-rc-other morebank mm\" >选择其他方式充值</div></td></tr></table>");
        }
        else {
            $card.empty().show().html("<table cellpadding=\"0\" cellspacing=\"0\"><tr><td><input name=\"SelectedBankId\" channel=\"" + channelId + "\" type=\"radio\" value=\"" + selectedBankId + "\"  checked=\"checked\" style=\"margin-left: 0;\" /></td><td>" + content + "</td><td><div class=\"morebank\">选择其他充值方式<img src=\"/Resources/images/roll.png\" /></div></td></tr></table>");
        }
        $("#content_nav").height("0px");
    });

    $(".card_nav").find('input[type="radio"]').each(function () {
        $(this).live('click', function () {
            if ($(this).attr("channel") == "2" || $(this).attr("channel") == "3") {
                $(this).parent().find('span').click();
                if ($(this).hasClass('balpay')) {
                    $(this).parent().next().find('span').click();
                }
            } else {
                $(this).next().find('img').click();
            }
        });
    });

    $(".card_nav").find('.item').each(function () {
        inputChange($(this));
    });
});

function inputChange(element) {
    $(element).css('cursor', 'pointer').live('click', function () {
        var bgClass = "";
        var imgSrc = "";
        if ($(element).parent().prev().attr('type') != 'radio') {
            $(element).parent().prev().find("input[type='radio']").attr('checked', 'checked');
            bgClass = $(element).attr('class')//$(this).css('backgroundImage').split('(')[1].split(')')[0];
        } else {
            $(element).parent().prev("input[type='radio']").attr('checked', 'checked');
            imgSrc = $(element).find('img').attr('src');
        }

        var selectedBankId = $("input[name='SelectedBankId']:checked").val();
        $.cookie("selectedbankId", selectedBankId);
        var channelId = $("input[name='SelectedBankId']:checked").attr("channel");
        var viewVersion = $.cookie("ui-version");

        var $card = $(".card");
        var $bank_nav = $(".bank_nav");
        if ($card.css('display') == 'none') {
            if (bgClass != "") {
                var content = "<span class=\"" + bgClass + "\" ></span>";
            }
            else {
                content = "<img src=\"" + imgSrc + "\" style=\"border: 1px solid #CCC;\" />";
            }

            if (viewVersion == "2014") {
                $card.empty().show().html("<table cellpadding=\"0\" cellspacing=\"0\"><tr><td><input name=\"SelectedBankId\" channel=\"" + channelId + "\" type=\"radio\" value=\"" + selectedBankId + "\"  checked=\"checked\" style=\"margin-left: 0;\" /></td><td>" + content + "</td><td><div class=\"my-ac-rc-other morebank mm\" >选择其他方式充值</div></td></tr></table>");
            }
            else {
                $card.empty().show().html("<table cellpadding=\"0\" cellspacing=\"0\"><tr><td><input name=\"SelectedBankId\" channel=\"" + channelId + "\" type=\"radio\" value=\"" + selectedBankId + "\"  checked=\"checked\" style=\"margin-left: 0;\" /></td><td>" + content + "</td><td><div class=\"morebank\">选择其他充值方式<img src=\"/Resources/images/roll.png\" /></div></td></tr></table>");
            }

            $bank_nav.hide();
            $("#content_nav").height("0px");
        } else {
            $card.hide();
            $bank_nav.show();
        }

        ChangeAmount();
    });
}

$(function () {
    $("#Amount").keydown(function (e) { /*只允许输入数字*/
        var key = [8, 37, 39, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 110, 190];
        if ($.inArray(e.which, key) < 0) {
            return false;
        }
    });

    $("#Amount").change(ChangeAmount);
    $("#Amount").keyup(ChangeAmount);
    $("#Amount").blur(checkAmount);
    $("#btnOk").click(function () {
        var amount = $('input[id=Amount]').val();
        if (amount.length < 1) {
            $(".error").html("请输入金额");
            updateAmount(0);
            $("#fee").html("￥0.00");
            return false;
        }
        if (!/^\d+(\.\d{1,2})?$/.test(amount)) {
            $(".error").html("请输入正确金额");
            updateAmount(0);
            $("#fee").html("￥0.00");
            return false;
        }

        if (checkAmount() == true) {
            $("#aibankform").submit();
        }
    })
});

function checkAmount(e) {
    $(".error").html("");
    var amount = $('input[id=Amount]').val();
    if (amount.length < 1) {
        updateAmount(0);
        $("#fee").html("￥0.00");
        return false;
    }

    if (!/^\d+(\.\d{1,2})?$/.test(amount)) {
        $(".error").html("请输入正确金额");
        updateAmount(0);
        $("#fee").html("￥0.00");
        return false;
    }
    var factAmount = parseFloat(amount);
    //var freeAmount = parseFloat($("#txtFreeAmount").val());
    if (factAmount <= 0.01) {
        $(".error").html("充值金额需大于0.01元");
        updateAmount(0);
        $("#fee").html("￥0.00");
        return false;
    }

    if (factAmount > inpourAmountMax) {
        $(".error").html("充值金额需小于" + inpourAmountMax + "元");
        updateAmount(0);
        $("#fee").html("￥0.00");
        return false;
    }

    return ChangeAmount();
    return true;
}

function ChangeAmount() {
    var amount = parseFloat($('input[id=Amount]').val());
    var userId = $("#hidUserId").val();
    if (isNaN(amount)) {
        $(".error").html("");
        updateAmount(0);
        return false;
    }

    var $bank = $('input[name=SelectedBankId]:checked');
    var bankId = $('input[name=SelectedBankId]:checked').val();
    var channelId = $bank.attr("channel");
    var $factAmount = $("#factAmount");
    var $fee = $("#fee");
    var feeAmount = 0;
    var factAmount = amount;

    if ($bank.length <= 0 || bankId == "" || bankId == null || bankId == 'undefined') {
        $(".error").html("请选择充值支付方式");
        return false;
    }

    /*免费充值流量大于总充值金额，不需要手续费*/
    if (freeAmout >= amount) {
        feeAmount = 0;
    }
    else {
        if (channelId == "3") { /*财付通 0.009*/
            feeAmount = Math.ceil((amount - freeAmout) * 0.009 * 100) / 100;
        } else {
            feeAmount = Math.ceil((amount - freeAmout) * 0.01 * 100) / 100;
        }

        if (amount > 0) {
            if (feeAmount < 0.01)
                feeAmount = 0.01;
        }

        factAmount = amount - feeAmount;
    }

    $fee.html("").html('￥' + feeAmount.toFixed(2));
    updateAmount(factAmount);

    return true;
}

function updateAmount(factAmount) {
    $('#factAmount').html('￥' + factAmount.toFixed(2));
    factAmount = parseFloat($('input[id=currentAmount]').val()) + factAmount;
    $('#AfterInpourAmount').html('￥' + factAmount.toFixed(2));
    if (factAmount == 0) {
        $("#fee").html("").html("￥0.00");
    }
}

$(function () {
    $(".ppb-banner-charge").on('click', function () {
        window.open("http://www.ppdai.com/autobid/addrule");
    })
})
