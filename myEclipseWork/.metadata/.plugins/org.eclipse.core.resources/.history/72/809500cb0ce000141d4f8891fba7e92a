$(function(){
//	发送消息弹出窗口
/*	(function($){
		$('#sendMessageBtn').click(function(){
			var dialog = new PPD_dialog();
			dialog.pop({
				popEle:$('#sendMessageBox'),
				closeBtn:$('.closeBtn')
			});
		});
	})(jQuery);*/
	
//	用户投诉
	/*(function($){
		$('#complainBtn').click(function(){
			var dialog = new PPD_dialog();
			dialog.pop({
				popEle:$('#complainBox'),
				closeBtn:$('.closeBtn')
			});
		});
	})(jQuery);*/

	
    
	
	/*$('#sendMessageBtn').click(function(){
		var pophtml	= '<iframe src="sendMessage.html" style="over-flow:aoto" scrolling="no" width="100%" height="294" frameborder="0"></iframe>'
		$(this).PPDfloatDiv({
            floatbgtype: true,
            floattruebtn: "发送",
            floatfalsebtn: "取消",
            handertext: '发送站内信',
            context: pophtml,
            btnalign:'center',
            truebtnid: 'btn_sendPms',
            floatheight: 294
        });
      
	});
	
	$('#complainBtn').click(function(){
		var pophtml	= '<iframe src="complaint.html" style="over-flow:aoto" scrolling="no" width="100%" height="374" frameborder="0"></iframe>'
		$(this).PPDfloatDiv({
            floatbgtype: true,
            floattruebtn: "发送",
            floatfalsebtn: "取消",
            handertext: '投诉用户',
            context: pophtml,
            btnalign:'center',
            truebtnid: 'btn_sendPms',
            floatheight: 374
        });
       
	});*/

	
	//举报用户
	 var usernameHidden = $('#usernameHidden').val();
	 $("#ReportAbuse").click(function() {
	 	
        $(this).PPDfloatDiv({
            floatbgtype: true,
            floattruebtn: '提交',
            floatfalsebtn: '取消',
            handertext: '举报用户',
            context: "<iframe id='frame1' style='over-flow:hidden' scrolling='no' width='100%' height='374' frameborder='0'  src='http://invest.ppdai.com/Loan/ReportUser?username="+usernameHidden+"'></iframe>",
            btnshow: true,
            btnalign: 'center',
            truebtnid: 'ReportAbuseOkButton'
        });
    });

	//回到顶部
	(function() {
        var $backToTopTxt = "返回顶部", $backToTopEle = $('<div class="backToTop"></div>').appendTo($("body"))
            .text($backToTopTxt).attr("title", $backToTopTxt).click(function() {
                $("html, body").animate({ scrollTop: 0 }, 120);
            }), $backToTopFun = function() {
                var st = $(document).scrollTop(), winh = $(window).height();
                (st > 10) ? $backToTopEle.show() : $backToTopEle.hide();
                //IE6下的定位
                if (!window.XMLHttpRequest) {
                    $backToTopEle.css("top", st + winh - 166);
                }
            };
        $(window).bind("scroll", $backToTopFun);
        $(function() { $backToTopFun(); });
    })();


    //非正在投标中的标
    if ($('.lendDetailContent_buy .right').children().length == 1) {
        $('.lendDetailContent_buy .right').css('background', 'none');
    }



	// 自动加投资额度
	(function($){
		$(".inputSum").keydown(function(e){
            var num = e.keyCode;
            if(((num<37&&num!=8)||(num<48&&num!=46&&num>40)||(num>57&&num<96)||(num>105))||e.altKey){
                e.preventDefault();
            }
        });

		//账户总额
		var acountTotal = parseFloat($('#accountTotal').text().replace(/,/g,'').substring(1));
		
		//列表余额
		var listRestMoney = parseFloat($('#listRestMoney').text().replace(/,/g,'').substring(1));
		//最小余额
		var minMoney = Math.min(acountTotal,listRestMoney);
		if(minMoney<50){
			$(".inputSum").val(50);
		}else if(minMoney<200){
			$(".inputSum").val(Math.floor(minMoney));
		}else{
			$(".inputSum").val(200);
		}
		$(".inputSum").blur(function() {
			if(minMoney<50){
				$(".inputSum").val(50);
			}else if(isNaN($(this).val()) || parseInt($(this).val()) > minMoney){
				$(".inputSum").val(Math.floor(minMoney));
				alert('只能输入小于账户余额和借款余额的整数金额');
			}else if (isNaN($(this).val()) || parseInt($(this).val()) < 50) {
                $(".inputSum").val(50);
                alert('只能输入大于50的整数金额');
                return;
            }
           	 window.computeIncome&&computeIncome();
        });

		
		window.computeIncome&&computeIncome();

		if(minMoney>50){
			$('.aotuadd span').click(function(){
				//输入框金额
				var inputMoney = parseFloat($('.inputSum').val());
				
				//alert($(this).attr('money'))
				if(typeof $(this).attr('money') != 'undefined'){
					var addSum = parseInt($(this).attr('money'));
					var updateMoney = addSum+inputMoney;
					if(updateMoney <= acountTotal && updateMoney <= listRestMoney&&updateMoney>=50){//如果更新金额小于账户总额 并且 更新金额小于剩余金额
						$('.inputSum').val(updateMoney);
					}else if(updateMoney<50){
						$('.inputSum').val(50);
					}else{
						$('.inputSum').val(Math.floor(minMoney));
					}
				}else if($(this).attr('total') == 'total'){
					$('.inputSum').val(Math.floor(minMoney));
				}
				window.computeIncome&&computeIncome();
			});
		}
		

	})(jQuery);

	
});
