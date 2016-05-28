/*
**
用于构造一个表示百分比的弧形图的插件
如果是ie8一下则是直线图

**
依赖库是jquery和raphael

**
使用方式
$("#a").scaleMap({scale:0.6381,pathWidth:30,width:250});

**
以下是参数，打*号的是必传参数  其他随意,不过默认参数会让图形略粗大
width:opt.width||this.innerWidth(),
height:opt.height||this.innerHeight(),
pathWidth:opt.pathWidth||4,
scale:opt.scale||0,    *****
fontSize:opt.fontSize||40,
fontFamily:opt.fontFamily||"Microsoft Yahei",
fontColor:opt.fontColor||"#333",
completeColor:opt.completeColor||"#f58220",
noCompleteColor:opt.noCompleteColor||"#efefef"

**
开发者就是洒家王纳
电话13916950274
妹子们联系我

**
该插件只经过简单测试  如果有任何问题
————你来打我呀~~~  (￣▽ ￣)
*/
(function(win,jquery){
	jquery.fn.extend({
		scaleMap:function(opt){
			this.css("position",this.css("position")!="absolute"?"relative":"absolute")
			.setOption(opt)
			.handleParam()
			.createGraph()
			.createInfo();
			return this;
		},
		//根据浏览器版本,重设参数
		setOption:function(opt){
			if(!opt.scale&&opt.scale!==0){
				throw new Error("The scale parameter is not defined");
			}
			//如果没有传输width和height 则获取容器width和height
			var scaleMapOption = this.scaleMapOption = $.extend(opt,{
				width:opt.width||this.innerWidth(),
				height:opt.height||this.innerHeight(),
				scale:opt.scale||0,
				fontSize:opt.fontSize||20,
				fontFamily:opt.fontFamily||"microsoft yahei,arial",
				fontColor:opt.fontColor||"#333",
				completeColor:opt.completeColor||"#F19E00",
				noCompleteColor:opt.noCompleteColor||"#EEEEEE"
			});
			scaleMapOption.pathWidth = scaleMapOption.pathWidth||scaleMapOption.width/10;
			return this;
		},
		//图形路径参数构造,区分浏览器版本
		handleParam:(function(){
			if(!-[1,]){
				//IE8-
				return function(){
					var scaleMapOption = this.scaleMapOption,
					PI = Math.PI,
					width = scaleMapOption.width,
					height = scaleMapOption.height,
					radius = scaleMapOption.radius||(Math.min(width/2,height)-scaleMapOption.pathWidth/2),
					scale = scaleMapOption.scale;
					//Mx yLx y
					scaleMapOption.completeArcStr = "M0 " + (height-radius) + "L"+(width*scale)+" " + (height-radius);
					scaleMapOption.noCompleteArcStr = "M" + (width*scale) + " " + (height-radius) + "L"+width+" " + (height-radius);
					return this;
				};
			}else{
				//IE9+,firefox,chrome....
				return function(){
					var scaleMapOption = this.scaleMapOption,
					PI = Math.PI,
					width = scaleMapOption.width,
					height = scaleMapOption.height,
					radius = scaleMapOption.radius||(Math.min(width/2,height)-scaleMapOption.pathWidth/2),
					scale = scaleMapOption.scale,
					centre = {y:height,x:width/2},
					completeArc = {
						start:{
							y:height,
							x:scaleMapOption.pathWidth/2
						},
						end:{
							y:centre.y + (radius * Math.cos(PI * (scale*1000+500)/1000)),
							x:centre.x - (radius * Math.sin(PI * (scale*1000+500)/1000))
						}
					},
					noCompleteArc = {
						start:{
							y:completeArc.end.y,
							x:completeArc.end.x
						},
						end:{
							y:height,
							x:width-scaleMapOption.pathWidth/2
						}
					};
					//Mx yArx ry x-axis-rotation large-arc-flag sweep-flag x y
					scaleMapOption.completeArcStr = "M"+completeArc.start.x + " " + completeArc.start.y + "A"+radius+" " + radius + " 0 0 1 " + completeArc.end.x + " " + completeArc.end.y;
					scaleMapOption.noCompleteArcStr = "M"+noCompleteArc.start.x + " " + noCompleteArc.start.y + "A"+radius+" " + radius + " 0 0 1 " + noCompleteArc.end.x + " " + noCompleteArc.end.y;
					return this;
				};
			}
		})(),
		//构造图形
		createGraph:function(){
			var elm = this,
			scaleMapOption = this.scaleMapOption;
			elm.each(function(){
				paper = Raphael(this,scaleMapOption.width,scaleMapOption.height);
				paper.path(scaleMapOption.completeArcStr).attr({"stroke-width":scaleMapOption.pathWidth,"stroke":scaleMapOption.completeColor});
				paper.path(scaleMapOption.noCompleteArcStr).attr({"stroke-width":scaleMapOption.pathWidth,"stroke":scaleMapOption.noCompleteColor});
			});
			return this;
		},
		//创建文字,在div中底部居中,话说是否需要操蛋的保留几位小数呢
		createInfo:function(){
		    var scaleMapOption = this.scaleMapOption;
			this.each(function(){
				$(this).append($("<div></div>").css({
					"width":scaleMapOption.width,
					"color":scaleMapOption.fontColor,
					"font-size":scaleMapOption.fontSize,
					"font-family":scaleMapOption.fontFamily,
					"position":"absolute",
					"bottom":0,
					"left":0,
					"text-align":"center"
				}).html(Math.round(scaleMapOption.scale*10000)/100+"%"));
			});
			return this;
		}
	});
})(window,$);
