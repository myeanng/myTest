function PPD_dialog(){this.settings={popEle:$("#pop"),iframesrc:"",height:0,width:0,position:"center",isMask:!0,maskZindex:999,maskBackground:"#000",maskOpacity:.44,callback:function(){}}}function extend(n,t){for(var i in t)n[i]=t[i]}PPD_dialog.prototype.pop=function(n){extend(this.settings,n);this.settings.isMask&&this.mask();this.creatWindow();var t=this;$("#acpopclose").click(function(){t.settings.popEle.hide();t.settings.popEle.children().remove();$(".PPD_dialog_mask").remove()})};PPD_dialog.prototype.creatWindow=function(){this.setPosiotion();this.iframe();this.creatCloseBtn();this.settings.popEle.show();this.settings.callback()};PPD_dialog.prototype.setPosiotion=function(){switch(this.settings.position){case"center":this.settings.popEle.css({left:parseInt(($(window).width()-this.settings.width)/2)+$(window).scrollLeft(),top:parseInt(($(window).height()-this.settings.height)/2)+$(window).scrollTop(),position:"absolute","z-index":9999})}};PPD_dialog.prototype.iframe=function(){this.settings.popEle.append($('<iframe src="'+this.settings.iframesrc+'" style="over-flow:auto" scrolling="no" width="'+this.settings.width+'" height="'+this.settings.height+'" frameborder="no" border="0"><\/iframe>'))};PPD_dialog.prototype.creatCloseBtn=function(){this.settings.popEle.append($('<span id="acpopclose" style="position:absolute;top:0px;right:10px;color:#999;font-size:24px;cursor:pointer;">×<\/span>'))};PPD_dialog.prototype.mask=function(){var n=$('<div class="PPD_dialog_mask"><\/div>');n.css({position:"absolute",width:$(document).width(),height:$(document).height(),background:this.settings.maskBackground,opacity:this.settings.maskOpacity,left:0,top:0,zIndex:this.settings.maskZindex});$("body").append(n)};PPD_dialog.prototype.close=function(){var n=this;$("ac_quickLogin_pop").delegate("#acpopclose","click",function(){alert(1);n.settings.popEle.hide();$(".PPD_dialog_mask").remove()})}