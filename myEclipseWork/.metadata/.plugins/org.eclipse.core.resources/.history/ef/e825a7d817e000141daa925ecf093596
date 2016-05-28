$(function(){
	var IsShowBlacklist = parseInt($("#IsShowBlacklist").val());
	if(IsShowBlacklist == 1||(IsShowBlacklist == -1&&!$.cookie("leftNav_infoTip_note"))){
		var info_box = $(".my-f-l-list li.info_box").append('<img src="http://www.ppdaicdn.com/2014/img/button_info_border.png" class="button_info_border"/>\
                <img src="http://www.ppdaicdn.com/2014/img/button_info.png" class="button_info"/>\
                <img src="http://www.ppdaicdn.com/2014/img/button_info_close.png" class="button_info_close"/>');
		info_box.find(".button_info_border").click(function(){
			window.location.href = $(this).siblings("a").attr("href");
		}).hover(function(){
			$(this).siblings("a").addClass("on");
		},function(){
			$(this).siblings("a").removeClass("on");
		});
		info_box.find(".button_info_close").click(function(){
			$(this).parent().find("img").fadeOut(300);
		});
		$.cookie("leftNav_infoTip_note", "You don't need to tip", { expires: 365, path: '/' });
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