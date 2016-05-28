  //快速投标提交
        function bidlist(lisrid,title,rate,date,type) {
            if (location.href.indexOf("www.ppdai.com") >= 0) {
                location.href = "http://invest.ppdai.com/loan/info?id=" + lisrid + "&from=www";
                return false;
            }
            var content;
            var btnshow;
            if(!/^[0-9\ ]+$/.test(Number($("#" + lisrid).val()))){
                alert("请输入整数金额");
                return;
            }
            if(Number($("#" + lisrid).val())< 50){
                alert("请输入大于50元的整数金额");
                return;
            }
            if (Number($("#" + lisrid).val()) >20000) {
                alert("每次投标最多20000元，请注意风险，谢谢");
                return false;
            }
            if (type=="True")
            {
                content= "<iframe id='frame1' style='over-flow:aoto' scrolling='no' width='100%' height='147' frameborder='0'  src='http://invest.ppdai.com/bid/info?source=2&listingId="+lisrid+"&title="+title+"&date="+date+"&UrlReferrer="+document.referrer+"&money="+$("#" + lisrid).val()+"'></iframe>";
                btnshow = true;
            }
            else
            {
                content="<div style='text-align:center; width:100%'>尚未登录，请先<a href='http://ac.ppdai.com/User/login?redirect=http://"+ window.location.host+"/lend'>登录</a></div>"
                btnshow = false;
            }

            $(this).PPDfloatDiv({
                floatbgtype: true,
                floattruebtn: '确认无误，投标',
                floatfalsebtn: false,
                handertext: '快速投标',
                context: content,
                btnshow: true,
                btnalign: 'center',
                truebtnid: 'btBid',
                subhead: '(投资有风险，投标须谨慎；若怕有万一，请勿乱投标)'
            });
          
        };