var jqWindowsEngineZIndex = 100;
(function ($) {

    /**
    * @option string windowTitle, the tile to display on the window
    * @option HTML content, the content to display on the window
    * @option string ajaxURL, URL address to load the content, this has priority over content
    * @option int width, the initial width of the window
    * @option int height, the initial height of the window
    * @option int posx, the initial x position of the window
    * @option int posy, the initial y position of the window
    * @option function onDragBegin: onDragBegin callback function,
    * @option function onDragEnd: onDragEnd callback function,
    * @option function onResizeBegin: onResizeBegin callback function,
    * @option function onResizeEnd: onResizeEnd callback function,
    * @option function onAjaxContentLoaded: onAjaxContentLoaded callback function,
    * @option boolean statusBar, enable or disable the window status bar
    * @option boolean minimizeButton, enable or disable the window minimize button
    * @option HTML minimizeIcon, an html text to display as the minize icon
    * @option boolean maximizeButton, enable or disable the window maximize button
    * @option HTML maximizeIcon, an html text to display as the maximize icon
    * @option boolean closeButton, enable or disable the window close button
    * @option HTML closeIcon, an html text to display as the close icon
    * @option boolean draggable, enable or disable the window dragging
    * @option boolean resizeable, enable or disable the window resize button
    * @option HTML resizeIcon, an html text to display as the resize icon
    * @option string windowType, a string "normal", "video", or "iframe"
    */
    $.fn.newWindow = function (options) {

        var lastMouseX = 0;
        var lastMouseY = 0;

        var defaults = {
            windowTitle: "",
            content: "",
            ajaxURL: "",
            width: 200,
            height: 200,
            posx: 50,
            posy: 50,
            onDragBegin: null,
            onDragEnd: null,
            onResizeBegin: null,
            onResizeEnd: null,
            onAjaxContentLoaded: null,
            onBtnClosed:null,
            statusBar: false,
            minimizeButton: false,
            minimizeIcon: "-",
            maximizeButton: false,
            maximizeIcon: "O",
            closeButton: true, //是否显示关闭按钮
            closeIcon: "",
            draggable: false, //是否可以移动
            resizeable: false,
            scrollable: false, //页面是否可以滚动
            autoscrool: false, //窗体是否随着滚动条滚动
            backgroundable: false, //是否显示背景遮罩
            backgroundclick: false, //背景点击事件
            resizeIcon: "#",
            windowType: "standard",
            location: "middle", //窗口的默认位置
            windowTitleBar: true
        }; //rightbottom,leftbottom,lefttop,righttop,middle
        //alert(defaults.position.top);
        var options = $.extend(defaults, options);
        var ie6 = $.browser.msie && $.browser.version == "6.0";

        $windowContainer = $('<div class="window-container modal hide fade in"></div>');
        $windowTitleBar = $('<div class=\"window-titleBar modal-header\"></div>');
        $windowMinimizeButton = $('<div class="window-minimizeButton"></div>');
        $windowMaximizeButton = $('<div class="window-maximizeButton"></div>');
        $windowCloseButton = $('<div class="window-close"></div>');
        $windowCloseIcon = $('<a class="window-closeButton" href="javascript:void(0);"></a>');
        $windowContent = $('<div class="window-content modal-body"></div>');
        $windowStatusBar = $('<div class="window-statusBar"></div>');
        $windowResizeIcon = $('<div class="window-resizeIcon">d</div>');
        $loading = $("<div class=\"loading\"></div>");
        $windowBackground = $('<div class="window-background"></div>');

        if (options.windowType == "video" || options.windowType == "iframe")
            $windowContent.css("overflow", "hidden");

        var setFocus = function ($obj) {
            $obj.css("z-index", jqWindowsEngineZIndex++);
        }


        var resize = function ($obj, width, height) {

            width = parseInt(width);
            height = parseInt(height);

            $obj.attr("lastWidth", width)
		    .attr("lastHeight", height);

            width = width + "px";
            height = height + "px";

           // $obj.css("width", width);//by huihui
            //.css("height", height);

            if (options.windowType == "video") {
                $obj.children(".window-content").children("embed").css("width", width)
	               .css("height", height);
                $obj.children(".window-content").children("object").css("width", width)
	               .css("height", height);
                $obj.children(".window-content").children().children("embed").css("width", width)
	               .css("height", height);
                $obj.children(".window-content").children().children("object").css("width", width)
	               .css("height", height);
            }

            if (options.windowType == "iframe")
                $obj.children(".window-content").children("iframe").css("width", width)
	               .css("height", height);

        }

        var move = function ($obj, x, y) {

            x = parseInt(x);
            y = parseInt(y);

            $obj.attr("lastX", x)
		    .attr("lastY", y);

            x = x + "px";
            y = y + "px";

            $obj.css("left", x)
	        .css("top", y);
        }

        var dragging = function (e, $obj) {
            if (options.draggable) {
                e = e ? e : window.event;
                var newx = parseInt($obj.css("left")) + (e.clientX - lastMouseX);
                var newy = parseInt($obj.css("top")) + (e.clientY - lastMouseY);
                lastMouseX = e.clientX;
                lastMouseY = e.clientY;

                move($obj, newx, newy);
            }
        };

        var resizing = function (e, $obj) {

            e = e ? e : window.event;
            var w = parseInt($obj.css("width"));
            var h = parseInt($obj.css("height"));
            w = w < 100 ? 100 : w;
            h = h < 50 ? 50 : h;
            var neww = w + (e.clientX - lastMouseX);
            var newh = h + (e.clientY - lastMouseY);
            lastMouseX = e.clientX;
            lastMouseY = e.clientY;

            resize($obj, neww, newh);
        };
        $windowContainer.bind('mousedown', function (e) {
            if (e.target.tagName == "INPUT" || e.target.tagName == "A" || e.target.tagName == "TEXTAREA" || e.target.className.indexOf("no-dragg") != -1 || options.draggable == false) return;
            if ($(e.target).is(".window-container")) {
                $obj = $(e.target);
            }
            else {
                $obj = $(e.target).parents(".window-container");
            }
            //alert($obj.attr("className"));
            $obj.css("filter", "alpha(opacity=50)");
            $obj.css("opacity", "0.5");
            $obj.css("-moz-opacity", "0.5");
            //alert( $obj.html());
            setFocus($obj);
            $obj.find(".window-contain").css("opacity", "1");
            if ($obj.attr("state") == "normal") {
                e = e ? e : window.event;
                lastMouseX = e.clientX;
                lastMouseY = e.clientY;

                $(document).bind('mousemove', function (e) {
                    dragging(e, $obj);
                });


                $(document).bind('mouseup', function (e) {
                    if (options.onDragEnd != null) options.onDragEnd();
                    $obj.css("opacity", "1");
                    $obj.css("filter", "alpha(opacity=100)");
                    $obj.css("-moz-opacity", "1");
                    $(document).unbind('mousemove');
                    $(document).unbind('mouseup');
                });

                if (options.onDragBegin != null) options.onDragBegin();
            }
        });

        $windowResizeIcon.bind('mousedown', function (e) {
            $obj = $(e.target).parent().parent();
            setFocus($obj);

            if ($obj.attr("state") == "normal") {
                e = e ? e : window.event;
                lastMouseX = e.clientX;
                lastMouseY = e.clientY;

                $(document).bind('mousemove', function (e) {
                    resizing(e, $obj);
                });

                $(document).bind('mouseup', function (e) {
                    if (options.onResizeEnd != null) options.onResizeEnd();
                    $(document).unbind('mousemove');
                    $(document).unbind('mouseup');
                });

                if (options.onResizeBegin != null) options.onResizeBegin();
            }

        });

        $windowMinimizeButton.bind('click', function (e) {
            $obj = $(e.target).parents(".window-container");
            setFocus($obj);
            if ($obj.attr("state") == "normal") {
                $obj.css("overflow", "hidden");
                //$(e.target).parent().next().slideToggle("slow");
                if (!$(e.target).is(".min")) {
                    var h1 = $obj.height()
                    var t1 = $obj.offset().top;
                    $(e.target).attr("t", t1);
                    $(e.target).attr("h", h1);
                    $(e.target).attr("w1", $obj.outerWidth());
                    $(e.target).attr("h1", $obj.outerHeight());
                    $obj.animate({
                        top: (t1 + h1 - $(".window-titleBar", $obj).outerHeight() - $(".window-close", $obj).outerHeight()) + "px",
                        height: ($(".window-titleBar", $obj).outerHeight() + $(".window-close", $obj).outerHeight()) + "px"
                    });
                    $(e.target).addClass("min");
                }
                else {
                    var l = win_location($(e.target).attr("w1"), $(e.target).attr("h1"));
                    $obj.animate({
                        top: l.top,
                        height: $(e.target).attr("h")
                    });
                    $(e.target).removeClass("min");
                }
            }
        });

        $windowMaximizeButton.bind('click', function (e) {
            $obj = $(e.target).parents(".window-container");
            setFocus($obj);
            if ($obj.attr("state") == "normal") {
                if (options.windowType == "standard") {
                    $obj.animate({
                        top: "5px",
                        left: "5px",
                        width: $(window).width() - 15,
                        height: $(window).height() - 45
                    }, "slow");
                }
                else {
                    tmpx = $obj.attr("lastX");
                    tmpy = $obj.attr("lastY");
                    tmpwidth = $obj.attr("lastWidth");
                    tmpheight = $obj.attr("lastHeight");
                    move($obj, 5, 5);
                    resize($obj, $(window).width() - 15, $(window).height() - 45);
                    $obj.attr("lastX", tmpx);
                    $obj.attr("lastY", tmpy);
                    $obj.attr("lastWidth", tmpwidth);
                    $obj.attr("lastHeight", tmpheight);
                }
                $obj.attr("state", "maximized")
            }
            else if ($obj.attr("state") == "maximized") {
                if (options.windowType == "standard") {
                    $obj.animate({
                        top: $obj.attr("lastY"),
                        left: $obj.attr("lastX"),
                        width: $obj.attr("lastWidth"),
                        height: $obj.attr("lastHeight")
                    }, "slow");
                }
                else {
                    resize($obj, $obj.attr("lastWidth"), $obj.attr("lastHeight"));
                    move($obj, $obj.attr("lastX"), $obj.attr("lastY"));
                }
                $obj.attr("state", "normal")
            }

        });

        $windowCloseIcon.bind('click', function (e) {
            $(e.target).parents(".window-container").fadeOut();
            $(e.target).parents(".window-container").children(".window-content").html("");
            if (options.scrollable) {
                $(e.target).parents("body").css("overflow", "visible");
                $(e.target).parents("html").css("overflow", "auto");
            }
            $windowBackground.remove();
            if(options.onBtnClosed){
                options.onBtnClosed();
            }
        });

        $windowContent.click(function (e) {
            setFocus($(e.target).parent());
        });
        $windowStatusBar.click(function (e) {
            setFocus($(e.target).parent());
        });
        $windowTitleBar.append($windowCloseButton);
        $windowCloseButton.append($windowCloseIcon);
        if (!options.closeButton) {
            $windowCloseButton.css("display", "none");
        }
        //move($windowContainer,options.posx,options.posy);
        resize($windowContainer, options.width, options.height);
        $windowContainer.attr("state", "normal");
        $windowTitleBar.append("<h3>" + options.windowTitle + "</h3>");
        //if(options.windowTitle.length == 0) $windowTitleBar.hide();
        $windowContain = $('<div class="window-contain"></div>');
        $windowContainer.append($windowContain);

        if (options.minimizeButton)
            $windowTitleBar.append($windowMinimizeButton)
        if (options.maximizeButton)
            $windowTitleBar.append($windowMaximizeButton)


        if (options.resizeable)
            $windowStatusBar.append($windowResizeIcon);
        if (options.windowTitleBar)
            $windowContain.append($windowTitleBar)
        $windowContain.append($windowContent)

        if (options.statusBar)
            $windowContain.append($windowStatusBar);

        $windowContainer.css("display", "none");

        var win_location = function (w, h) {
            var windowWidth = document.documentElement.clientWidth;
            var windowHeight = document.documentElement.clientHeight;
            var popupHeight = h;
            var popupWidth = w;
            var top = 0, left = 0;
            switch (options.location) {
                case "lefttop":
                    top = 0;
                    left = 0;
                    break;
                case "leftbottom":
                    top = windowHeight - popupHeight;
                    left = 0;
                    break;
                case "righttop":
                    top = 0;
                    left = windowWidth - popupWidth;
                    break;
                case "rightbottom":
                    top = windowHeight - popupHeight;
                    left = windowWidth - popupWidth;
                    break;
                case "middle":
                default:
                    top = (windowHeight- popupHeight)/2;
                    left = (windowWidth - popupWidth)/2;
                    break;
            }
            return { "top": top, "left": left };
        }
        var win_Location1 = function (w, h) {
            var windowWidth = document.documentElement.clientWidth;
            var windowHeight = document.documentElement.clientHeight;
            var popupHeight = h;
            var popupWidth = w;
            var top = 0, left = 0;
            switch (options.location) {
                case "lefttop":
                    top = 0;
                    left = 0;
                    break;
                case "leftbottom":
                    top = windowHeight - popupHeight;
                    left = 0;
                    break;
                case "righttop":
                    top = 0;
                    left = windowWidth - popupWidth;
                    break;
                case "rightbottom":
                    top = windowHeight - popupHeight;
                    left = windowWidth - popupWidth;
                    break;
                case "middle":
                default:
                    top = windowHeight / 2;
                    left = windowWidth / 2;
                    break;
            }
            return { "top": top, "left": left };
        }
        var position = function ($obj) {
            var l = win_location($obj.outerWidth(), $obj.outerHeight());
            if (options.scrollable) {
                $obj.parents("body").css("overflow", "hidden");
                $obj.parents("html").css("overflow", "visible");
            }

            if (options.autoscrool) {
                if (ie6) {
                    $obj.css("position", "absolute");
                    $obj.addClass("ie6_bottom ie6_right");
                    $obj.parent("body").css({ "background-image": "url(about:blank)", "background-attachment": "fixed" });
                    //$(document).css({"margin":"0","padding":"0"});   
                }
                else {
                    l = win_Location1($obj.outerWidth(), $obj.outerHeight());
                    $obj.css({
                        "position": "fixed",
                        "top": l.top,
                        "left": l.left
                    });
                    $(window).bind("resize", function () {
                        l = win_Location1($obj.outerWidth(), $obj.outerHeight());
                        $windowBackground.css({
                            "z-index": "99",
                            "cursor": "default",
                            "border": "medium none",
                            "margin": "0",
                            "padding": "0",
                            "top": "0",
                            "left": "0",
                            "background-color": "#000",
                            "position": "absolute",
                            "filter": "alpha(opacity=50)",
                            "opacity": "0.5",
                            "-moz-opacity": "0.5",
                            "width": $('body').outerWidth() < document.documentElement.clientWidth ? document.documentElement.clientWidth : $('body').outerWidth(),
                            "height": $('body').outerHeight() < document.documentElement.clientHeight ? document.documentElement.clientHeight : $('body').outerHeight()
                        });
                        $obj.css({ "position": "fixed", "top": l.top, "left": l.left });
                    });
                }
            } else {
                $obj.css({
                    "position": "absolute",
                    "top": "",  //配合bootstrap所以去掉  by：beihua
                   	"left": ""
                });
            }
        };

        return this.each(function (index) {
            var $this = $(this);

            $windowMinimizeButton.html(options.minimizeIcon);
            $windowMaximizeButton.html(options.maximizeIcon);
            $windowCloseIcon.html(options.closeIcon);
            //$windowCloseButton.html(options.closeIcon);
            $windowResizeIcon.html(options.resizeIcon);

            $this.data("window", $windowContainer);
            $('body').append($windowContainer);

            if (ie6) {
                $windowContainer.append("<iframe style=\"display: block; z-index: -5; left: 0; filter: Alpha(Opacity='0'); width: expression(this.parentNode.offsetWidth+'px');POSITION: absolute; ; TOP: 0; ; height: expression(this.parentNode.offsetHeight+'px')\" tabIndex=-1 src=\"javascript:false;\" frameBorder=0></iframe>");
            }
            $this.click(function (event) {
                if (options.backgroundable) {
                    $windowBackground.css({
                        "z-index": "99",
                        "cursor": "default",
                        "border": "medium none",
                        "margin": "0",
                        "padding": "0",
                        "top": "0",
                        "left": "0",
                        "background-color": "#000",
                        "position": "absolute",
                        "filter": "alpha(opacity=50)",
                        "opacity": "0.5",
                        "-moz-opacity": "0.5",
                        "width": $('body').outerWidth() < document.documentElement.clientWidth ? document.documentElement.clientWidth : $('body').outerWidth(),
                        "height": $('body').outerHeight() < document.documentElement.clientHeight ? document.documentElement.clientHeight : $('body').outerHeight()
                    });
                    $('body').append($windowBackground);
                }
                if (options.backgroundclick) {
                    $windowBackground.bind('click', function (e) {
                        $windowCloseIcon.click();
                    });
                }
                event.preventDefault();
                $window = $this.data("window").children(".window-contain");

                //$window.children(".window-contain").html(options.content)
                if (options.ajaxURL != "") {
                    $window.children(".window-content").html("").append($loading);
                    $.ajax({
                        type: "GET",
                        cache: false,
                        url: options.ajaxURL,
                        dataType: "html",
                        success: function (data) {
                            $window.children(".window-content").html(data);
                            //$window.children(".window-content").children(".loading").remove();
                            if (options.onAjaxContentLoaded != null) options.onAjaxContentLoaded();
                            position($window.parent());
                        },
                        error: function () {
                            $window.children(".window-content").html("<div class=\"error\">加载出错，请稍后再试或者与管理员联系</div>");
                        }
                    });

                }
                else {
                    $window.children(".window-content").html(options.content);
                    if (options.windowType == "iframe") {
                        $window.children(".window-content").append($loading);
                        $window.children(".window-content").children("iframe").hide();
                        position($window.parent());
                        $window.children(".window-content").children("iframe").load(function () {
                            $(this).show();
                            try { $(this).height($(this).contents().find("body").height() + 30); } catch (ex) { }
                            $window.children(".window-content").children(".loading").remove();

                            position($window.parent());
                        });
                    }
                    else {
                        position($window.parent());
                    }
                }
                if (!options.draggable) {
                    $window.children(".window-titleBar").css("cursor", "default");
                }
                $window.parent().css("cursor", "default");
                //$window.parent().append("<div class='clear'></div>");
                setFocus($window.parent());

                //alert($window.find("div").length);
                // $window.find("div").bind("mousedown" ,function(){$windowTitleBar.mousedown()});
                $window.parent().fadeIn();
            });
        });


    } 
})(jQuery);