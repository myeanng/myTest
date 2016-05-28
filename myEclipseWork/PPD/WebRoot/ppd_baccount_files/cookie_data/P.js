/* Module: 
* Owner:  tangguoan
*/
var $d = document;
function $id(s) { return $d.getElementById(s); }
request = (function () {
    var requests = new Array();
    var createXMLHttp = function () {
        var request = null;
        try {
            if (typeof (XMLHttpRequest) != 'undefined') {
                request = new XMLHttpRequest();
            }
            else {
                request = new ActiveXObject('Msxml2.XMLHTTP');
            }
        }
        catch (e) {
            try {
                request = new ActiveXObject('Microsoft.XMLHTTP');
            }
            catch (ee)
		        { }
        }
        return request;
    };
    this.send = function () {
        var url = arguments[0];
        var func = arguments[1];
        var date = arguments[2];
        var ispost = arguments[3] == null || typeof (arguments[3]) == "undefined" ? false : arguments[3];
        var pos = requests.length;
        requests[pos] = new createXMLHttp();
        var xhr = requests[pos];
        if (typeof xhr.open == "undefined") return;
        if (!ispost) ispost = null;
        var param = "";
        if (date != null && typeof (date) != "undefined" && typeof (date) != "string") {
            var s = [];
            for (var j in date) {
                s.push(encodeURIComponent(j) + "=" + encodeURIComponent(date[j]));
            }
            param = s.join("&").replace(/%20/g, "+");
        }
        url = url + (url.match(/\?/) ? "&" : "?");
        if (!ispost && param.length > 0) url = url + "&" + param;
        xhr.open(ispost ? "POST" : "GET", url, true);
        if (typeof func == "function") {
            xhr.onreadystatechange = function() {
                if (xhr.readyState == 4 && xhr.status == 200) {
                    func(xhr.responseXML != null && xhr.responseXML.xml != null && xhr.responseXML.xml != '' ? xhr.responseXML : xhr.responseText); // xhr.status == 304 || xhr.status == 411
                }
            };
        }
        if (ispost) {
            xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;");
            xhr.send(param);
        }
        else {
            xhr.send(null);
        }
    };
    return this;
})();

browser = (function () {
    var userAgent = navigator.userAgent.toLowerCase();
    this.version = (userAgent.match(/.+(?:rv|it|ra|ie)[\/: ]([\d.]+)/) || [])[1];
    this.safari = /webkit/.test(userAgent);
    this.opera = /opera/.test(userAgent);
    this.ie = (!this.isOpera && /msie/.test(userAgent));
    this.firefox = (!this.isOpera && !this.isIE && /firefox/.test(userAgent));
    this.mozilla = /mozilla/.test(userAgent) && !/(compatible|webkit)/.test(userAgent);
    return this;
})();
flash = function (targetVersion) {
    var FlashDetector_Version;
    var playable = false;

    if (browser.ie) {
        try {
            FlashDetector_Version = "ShockwaveFlash.ShockwaveFlash." + targetVersion;
            FlashObj = new ActiveXObject(FlashDetector_Version);
            playable = true;
        } catch (e) {
            return playable;
        }
    }
    else if (browser.mozilla || browser.safari || browser.opera) {
        var pObj = null;
        var tokens, len, curr_tok;
        var hasVersion = -1;

        if (navigator.mimeTypes && navigator.mimeTypes['application/x-shockwave-flash']) {
            pObj = navigator.mimeTypes['application/x-shockwave-flash'].enabledPlugin;
        }

        if (pObj != null) {
            tokens = navigator.plugins['Shockwave Flash'].description.split(' ');
            len = tokens.length;
            var curr_tok = parseFloat(/\d+(\.\d*)?/.exec(tokens)[0]);
            if (!isNaN(curr_tok)) {
                hasVersion = curr_tok;
                FlashDetector_Version = curr_tok;  // flash版本
            }
            if (hasVersion >= targetVersion) {
                playable = true;
            }
            else {
                playable = false;
            }
        }
    }
    return playable;
};
WatermarkFlash = function (domain, id, value, src) {
    this.watermarkId = id;
    this.domain = domain;
    this.watermarkvalue = value;
    this.watermarksrc = src;
    this.isBeing = $id(id) != null;
    this.flash8 = flash("8");
    this.value = new Date().getTime().toString() + Math.floor(Math.random() * 10);
  
    function getSWF(name) {
        var e = $id(name);
        return e.getElementsByTagName("embed")[0];
    }

    this.getWatermark = function (methode) {
        var w = "";
        var staticUrl = "";
        var msg = "\r\n  Flash:" + _this.flash8;
        try//开始读取
                {
            var obj = $id(_this.watermarkId);
            msg += "\r\n  " + obj;
            try {
                msg += "(" + obj.type + ")";
            } catch (etype) {

            }
            w = obj.getWatermark();

        }
        catch (ex)//读取失败1
                {
           
            msg += "\r\n  读取失败1(name:" + ex.name + ";message:" + ex.message + ");";
            try {
                var obj = getSWF(_this.watermarkId);
                msg += "\r\n  " + obj;
                try {
                    msg += "(" + obj.type + ")";
                } catch (etype) {

                }
                w = obj.getWatermark();
                //alert('fail read1' + msg);

            }
            catch (ex1)//读取失败2
                    {
                msg += "\r\n  读取失败2(name:" + ex1.name + ";message:" + ex1.message + ");";
                w = "-2";
                // alert('fail read2' + msg);

            }
        }

        if (w == undefined)//开始写入
        {
            w = _this.value;
            try {
                if ("flushed" != _this.setWatermark(w))//写入失败1
                {
                    if ("flushed" != _this.setWatermark3(w))//写入失败2
                    {
                        w = "-3";
                    }
                }
                //alert('write');
            }
            catch (ex2)//写入失败1
                    {
                msg += "\r\n  写入失败1(name:" + ex2.name + ";message:" + ex2.message + ");";
                try {
                    _this.setWatermark3(w);
                    //alert('fail write1');
                }
                catch (ex3)//写入失败2
                        {
                    msg += "\r\n  写入失败2(name:" + ex3.name + ";message:" + ex3.message + ");";
                    w = "-3";
                    //alert('fail write2');
                }
            }
        }
        var urlstr = "/cookie";
        if (w == "-2" && _this.flash8 == false) w = "-4";
        request.send(urlstr, function (m) { }, { "Methode": methode, "FlashValue": w, "CookieValue": _this.value }, true);
    };
    this.setWatermark = function (o) {
        return $id(_this.watermarkId).setWatermark(o);
    };

    this.setWatermark3 = function (o) {
        return getSWF(_this.watermarkId).setWatermark(o);
    };
    var _this = this;

    return this;
};