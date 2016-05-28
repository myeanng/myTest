$(function(){
	var IsFinishSwitchBorrowLoan = parseInt($("#IsFinishSwitchBorrowLoan").val());
	if(!$.cookie("mypqb_infoTip_note")){
		var info_box = $(".mypqb .my-ac-ctTitle").append('<div class="info_box pos">\
                            <div class="info_close">\
                            </div>\
                            <p class="info_message">\
                                随时转入享收益，随时转出去投标。开通即享资金不闲置！\
                            </p>\
                        </div>');
		info_box.find(".info_box").click(function(e){
			e.stopPropagation();
		}).hover(function(e){
			e.stopPropagation();
		},function(e){
			e.stopPropagation();
		});
		info_box.find(".info_close").click(function(){
			$(this).parent().fadeOut(300);
			$.cookie("mypqb_infoTip_note", "You don't need to tip", { expires: 365, path: '/' });
		});
	}
});
$(function(){
	var IsFinishSwitchBorrowLoan = parseInt($("#IsFinishSwitchBorrowLoan").val());
	if(!$.cookie("bdb_infoTip_note")){
		var info_box = $(".bdb:not(.mypqb) .my-ac-ctTitle").append('<div class="info_box pos">\
                            <div class="info_close">\
                            </div>\
                            <p class="info_message">\
                                选标略感疲惫？让闲置资金在拍钱包内休息一下吧！\
                            </p>\
                        </div>');
		info_box.find(".info_box").click(function(e){
			e.stopPropagation();
		}).hover(function(e){
			e.stopPropagation();
		},function(e){
			e.stopPropagation();
		});
		info_box.find(".info_close").click(function(){
			$(this).parent().fadeOut(300);
			$.cookie("bdb_infoTip_note", "You don't need to tip", { expires: 365, path: '/' });
		});
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