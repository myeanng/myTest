$(function(){
	//alert(1)
	(function($){
		$('#tabNav>li>a').click(function(){
			$(this).parent().addClass('current').siblings().removeClass('current');
			var index = $(this).parent().index();
			$('.borrowListContent>.wrapTable').eq(index).show().siblings('.wrapTable').hide();
		});
	})(jQuery);
	
	(function($){
		$('.add').click(function(){
			var val = $(this).parent().children('input[type=text]').val();
			var newVal = parseInt(val)+100;
			$(this).parent().children('input[type=text]').val(newVal);
		    if (newVal > 100) {
		        $(this).parent().children('.reduce').addClass('orange');
		    } else {
		        $(this).parent().children('.reduce').removeClass('orange');
		    }
		});
		
		$('.reduce').click(function(){
			var val = $(this).parent().children('input[type=text]').val();
			var newVal = parseInt(val)-100;
			if(newVal<=100){
			    $(this).parent().children('input[type=text]').val('100');
			    $(this).removeClass('orange');
			}else{
			    $(this).parent().children('input[type=text]').val(newVal);
			    $(this).addClass('orange');
			}
		});
	})(jQuery);
	

    
    //table布局所用的投资满标状态Js
	$('.borrowListContent table td').find('.inner').each(function () {

	    if ($(this).css('width') == '92px') {
	        $(this).parents('tr').find('.operate').children('a').attr('onclick', '').css({
	            'background': '#ccc',
	            'cursor': 'default'
	        });
	        
	        $(this).parents('tr').find('.operate').children('.input').children('.reduce').removeClass('orange').css('cursor', 'default').unbind('click');
	        $(this).parents('tr').find('.operate').children('.input').children('.add').css({ 'background': '#e0e0e0', 'cursor': 'default' }).unbind('click');
	    }
	});
    
    //div+css布局所用的投资满标状态js
    $('.wapBorrowList .processBar>.inner').each(function(){
        if($(this).width()==92){
            $(this).parents('li').children('.operate').children('.input').children('span').removeClass('orange').css({'background':'#e0e0e0','cursor':'default'}).unbind('click');
            $(this).parents('li').children('.operate').children('a').attr('onclick','');
            if($(this).parents('li').children('.operate').children('a').text()=='马上登录'){
                $(this).parents('li').children('.operate').children('a').attr('onclick','').css('cursor','pointer');
            }else{
                $(this).parents('li').children('.operate').children('a').attr('onclick','').css('cursor','default');
            }
        }
        
    });
	
	//弹窗
	
	/*var dialog = new PPD_dialog();
	var oBtn = $('.wrapTable .operate>a');
	oBtn.click(function(){
		dialog.pop({
			popEle:$('#popWindow'),
			closeBtn:$('.closeBtn')
		});
	});*/
	
});
