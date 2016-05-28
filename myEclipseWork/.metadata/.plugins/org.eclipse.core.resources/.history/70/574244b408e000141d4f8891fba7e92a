
//////////////////////显示示例图/////////////////////
var ExampleBox = function (imgArr, description) {
    this.ImgArr = imgArr;
    this.Description = description;
    this.CurrentIndex = 0;
    this.init();
};
ExampleBox.prototype = {
    init: function () {
        this.setImg();
        document.getElementById("example").style.display = "";
        document.getElementById("example_description").innerHTML = this.Description;
        //this.controlNav();
    },
    setImg: function () {
        var img = this.ImgArr[this.CurrentIndex];
		//alert(img);
        document.getElementById("exampleImg").src = img;
        //document.getElementById("exampleImg").style.backgroundImage = "url(" + img + ")";
        this.controlNav();
    },
    left: function () {
        this.CurrentIndex = this.CurrentIndex > 0 ? --this.CurrentIndex : 0;
        this.setImg();
    },
    right: function () {
        this.CurrentIndex = this.CurrentIndex < (this.ImgArr.length - 1) ? ++this.CurrentIndex : (this.ImgArr.length - 1);
        this.setImg();
    },
    controlNav: function () {
        if (this.CurrentIndex <= 0) {
            $("#example_left").removeClass("color2");
        } else {
            $("#example_left").addClass("color2");
        }

        if (this.CurrentIndex >= (this.ImgArr.length - 1)) {
            $("#example_right").removeClass("color2");
        } else {
            $("#example_right").addClass("color2");
        }
    },
    hide: function () {
        document.getElementById("example").style.display = "none";
    },
    show: function () {
        document.getElementById("example").style.display = "block";
    },
    setPosition: function (top, left) {
        document.getElementById("example").style.top = top + "px";
        document.getElementById("example").style.left = left + "px";
    }
};

//Show Example
function OpenExample(obj) {
    if (obj) {
        var left = $(obj).offset().left + 19;
        var top = $(obj).offset().top - 200; ;
        var description = $(obj).attr("description");
        var frontDocumentId = $(obj).attr("frontDocumentId");
        eb = new ExampleBox(GetExampleImages(frontDocumentId), description);
        eb.setPosition(top, left);
    } else {
        if (eb) {
            eb.show();
        }
    }
}

function hideExample(obj) {
    $("#example").hide();
}

function GetExampleHtml() {
    var html = new Array();
    html.push('<img id="exampleImg" style="width: 500px; height: 400px;"></img>');
    html.push('<div style="text-align: center;">');
    html.push('<a id="example_left" href="javascript:eb.left();" title="上一张"><<</a> <a id="example_right"');
    html.push('href="javascript:eb.right();" title="下一张">>></a>');
    html.push('</div>');
    html.push('<div id="example_description">');
    return html.join("");
}

var ExampleImagesArr = [
                [1, 3],
                [10, 1],
                [11, 1],
                [12, 4],
                [13, 4],
                [14, 1],
                [15, 1],
                [16, 4],
                [17, 5],
                [18, 7],
                [19, 10],
                [2, 1],
                [20, 6],
                [21, 4],
                [22, 10],
                [23, 2],
                [24, 3],
                [25, 1],
                [26, 1],
                [27, 1],
                [28, 1],
                [29, 3],
                [3, 1],
                [30, 2],
                [31, 5],
                [33, 2],
                [34, 2],
                [35, 1],
                [36, 1],
                [37, 1],
                [38, 2],
                [4, 1],
                [5, 1],
                [6, 2],
                [7, 6],
                [8, 1],
                [9, 2],
		[44,2],
		[45,2]
            ];

function GetExampleImages(frontDocumentId) {
    var imgCount = 0;
    for (var i = 0; i < ExampleImagesArr.length; i++) {
        var id = ExampleImagesArr[i][0];
        var len = ExampleImagesArr[i][1];
        if (id == frontDocumentId) {
            imgCount = len;
            break;
        }
    }
    var imgArr = new Array();
    for (var i = 1; i <= imgCount; i++) {
		
        var name = "http://static.ppdai.com/skin/images/ExampleImages/" + frontDocumentId + "_0" + (i < 10 ? "0" + i : i) + ".jpg";
        if (frontDocumentId=="1") {
            name = "http://www.ppdaicdn.com/img/showexamples/" + frontDocumentId + "_0" + (i < 10 ? "0" + i : i) + ".jpg";
        }
        imgArr.push(name);
		//alert(name);
    }
    return imgArr;
}