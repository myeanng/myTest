$(function(){
	var IsFinishSwitchBorrowLoan = parseInt($("#IsFinishSwitchBorrowLoan").val());
	if(IsFinishSwitchBorrowLoan == 1||(IsFinishSwitchBorrowLoan == -1&&!$.cookie("topNav_infoTip_note"))){
		var info_box = $("#tabIcon .hasSubMenu [category='Account']").parent().append('<div class="accountInfo_box">\
		    借款和投资账号切换搬<br>到这里啦\
		    <a href="javascript:;" class="accountInfo_box_close"></a>\
		</div>');
		info_box.find(".accountInfo_box").click(function(e){
			e.stopPropagation();
		}).hover(function(e){
			e.stopPropagation();
		},function(e){
			e.stopPropagation();
		});
		info_box.find(".accountInfo_box_close").click(function(){
			$(this).parent().fadeOut(300);
		});
		$.cookie("topNav_infoTip_note", "You don't need to tip", { expires: 365, path: '/' });
	}
});
/*
if(window.location.){}
	document.getElementById("button_info_border").onclick = function(){
		var siblings = this.parentNode.children;
		for(var i = 0,len = siblings.length;i < len;i++){
			if(siblings[i].nodeName.toLowerCase() == "a"){
				window.location.href = siblings[i].href;
			}
		}
	};
	document.getElementById("button_info_close").onclick = function(){
		var siblings = this.parentNode.children;
		for(var i = 0,len = siblings.length;i < len;i++){
			if(siblings[i].id == "button_info_close" || siblings[i].id == "button_info" || siblings[i].id == "button_info_border"){
				siblings[i].style.display = "none";
			}
		}
	}
}*/