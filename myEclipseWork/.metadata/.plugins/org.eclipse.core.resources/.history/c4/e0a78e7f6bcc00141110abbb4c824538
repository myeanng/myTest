/**
 * dialog组件，可以定制弹出窗口位置，依赖于jquery
 * @author 拍拍贷前端组开发并维护
 * @date  2014-08-18
 * @version  1.0 	极简版
 */
function PPD_dialog(){
	this.settings = {
		popEle:$('#pop'), 				//弹出的DOM节点
		position:'center',				//弹出窗口的位置
		isMask:true,					//是否需要遮照层
		maskZindex:999,					//遮照层的zindex
		maskBackground:'#000',			//遮照层背景色
		maskOpacity:0.44,				//遮照层透明度
		closeBtn:$('#close'),			//关闭按钮
		callback:function(){}			//回调函数
	};
};

/**
 * 外部接口，调用pop方法即可
 * @param {object} opts		json对象
 */
PPD_dialog.prototype.pop = function(opts){
	extend(this.settings,opts);
	if(this.settings.isMask){
		this.mask();
	}
	this.creatWindow();
	this.close();
	
};

/**
 * 弹出窗口
 */
PPD_dialog.prototype.creatWindow = function(){
	this.setPosiotion();
	this.settings.popEle.show();
	this.settings.callback();
};

/**
 * 设置弹出窗口的位置
 * @example 
 */
PPD_dialog.prototype.setPosiotion = function(){
	switch (this.settings.position){
		case 'centerTop':
			this.settings.popEle.css({
				'left':parseInt(($(window).width()-this.settings.popEle.width())/2) + $(window).scrollLeft(),
				'top':$(window).scrollTop()
			});
			break;
		case 'centerBottom':
			this.settings.popEle.css({
				'left':parseInt(($(window).width()-this.settings.popEle.width())/2) + $(window).scrollLeft(),
				'top':$(window).height() - this.settings.popEle.height() + $(window).scrollTop()
			});
			break;
		case 'center':
			this.settings.popEle.css({
				'left':parseInt(($(window).width()-this.settings.popEle.width())/2) + $(window).scrollLeft(),
				'top':parseInt(($(window).height()-this.settings.popEle.height())/2) + $(window).scrollTop()
			});
			break;
		case 'rightBottom':
			this.settings.popEle.css({
				'right':0,
				'top':$(window).height() - this.settings.popEle.height() + $(window).scrollTop()
			});
			break;
		case 'rightCenter':
			this.settings.popEle.css({
				'right':0,
				'top':parseInt(($(window).height()-this.settings.popEle.height())/2) + $(window).scrollTop()
			});
			break;
		case 'rightTop':
			this.settings.popEle.css({
				'right':0,
				'top':$(window).scrollTop()
			});
			break;
		case 'leftBottom':
			this.settings.popEle.css({
				'left':0,
				'top':$(window).height() - this.settings.popEle.height() + $(window).scrollTop()
			});
			break;
		case 'leftCenter':
			this.settings.popEle.css({
				'left':0,
				'top':parseInt(($(window).height()-this.settings.popEle.height())/2) + $(window).scrollTop()
			});
			break;
		case 'leftTop':
			this.settings.popEle.css({
				'left':0,
				'top':$(window).scrollTop()
			});
			break;
		default:
			this.settings.popEle.css({
				'left':parseInt(($(window).width()-this.settings.popEle.width())/2) + $(window).scrollLeft(),
				'top':parseInt(($(window).height()-this.settings.popEle.height())/2) + $(window).scrollTop()
			});
			break;
	}
};



/**
 * 添加遮照层
 * @return {null} 
 */
PPD_dialog.prototype.mask = function(){
	var mask = $('<div class="PPD_dialog_mask"></div>');
	mask.css({
		'position':'absolute',
		'width':$(document).width(),
		'height':$(document).height(),
		'background':this.settings.maskBackground,
		'opacity':this.settings.maskOpacity,
		'left':0,
		'top':0,
		'zIndex':this.settings.maskZindex
	});
	$('body').append(mask);
};

/**
 * 关闭弹出及删除遮照层方法
 */
PPD_dialog.prototype.close = function(){
	var This = this;
	this.settings.closeBtn.click(function(){
		This.settings.popEle.hide();
		$('.PPD_dialog_mask').remove();
	});
};

/**
 * 复制对象属性
 * @param {object} obj1			需要继承的object
 * @param {object} obj2			被继承的object
 */
function extend(obj1,obj2){
	for(var attr in obj2){
		obj1[attr] = obj2[attr];
	}
}