/* Demo Note:  This demo uses a FileProgress class that handles the UI for displaying the file name and percent complete.
The FileProgress class is not part of SWFUpload.
*/


/* **********************
Event Handlers
These are my custom event handlers to make my
web application behave the way I went when SWFUpload
completes different tasks.  These aren't part of the SWFUpload
package.  They are part of my application.  Without these none
of the actions SWFUpload makes will show up in my application.
********************** */
function fileQueued(file) {
    try {
        var progress = new FileProgress(file, this.customSettings.progressTarget);
        progress.setStatus("待上传..."); //progress.setStatus("Pending...");
        progress.toggleCancel(true, this);

    } catch (ex) {
        this.debug(ex);
    }

}

var hasFileQueueError = false;
function fileQueueError(file, errorCode, message) {

    try {
        if (errorCode === SWFUpload.QUEUE_ERROR.QUEUE_LIMIT_EXCEEDED) {
            alert("您上传的文件过多.\n每次请限制在" + message + "个以内");
            hasFileQueueError = true;
            return;
        }

        var progress = new FileProgress(file, this.customSettings.progressTarget);
        progress.setError();
        progress.toggleCancel(false);
        switch (errorCode) {
			
            case SWFUpload.QUEUE_ERROR.FILE_EXCEEDS_SIZE_LIMIT:
                //progress.setStatus("File is too big.");
                progress.setStatus("文件太大");
                this.debug("Error Code: File too big, File name: " + file.name + ", File size: " + file.size + ", Message: " + message);
                break;
            case SWFUpload.QUEUE_ERROR.ZERO_BYTE_FILE:
                //progress.setStatus("Cannot upload Zero Byte files.");
                progress.setStatus("不能上传空文件");
                this.debug("Error Code: Zero byte file, File name: " + file.name + ", File size: " + file.size + ", Message: " + message);
                break;
            case SWFUpload.QUEUE_ERROR.INVALID_FILETYPE:
                //progress.setStatus("Invalid File Type.");
                progress.setStatus("文件类型错误");
                this.debug("Error Code: Invalid File Type, File name: " + file.name + ", File size: " + file.size + ", Message: " + message);
                break;
            default:
                if (file !== null) {
                    //progress.setStatus("Unhandled Error");
                    progress.setStatus("上传文件出错");
                }
                this.debug("Error Code: " + errorCode + ", File name: " + file.name + ", File size: " + file.size + ", Message: " + message);
                break;
        }
    } catch (ex) {
        this.debug(ex);
    }
}

function fileDialogComplete(numFilesSelected, numFilesQueued) {
    try {
        if (!hasFileQueueError && numFilesSelected > 0) {
            setButtons(true, this);
        }
        hasFileQueueError = false;
        /* I want auto start the upload and I can do that here */
        this.startUpload();//by huihui修改自动上传
    } catch (ex) {
        this.debug(ex);
    }
}

function uploadStart(file) {
    try {
        /* I don't want to do any file validation or anything,  I'll just update the UI and
        return true to indicate that the upload should start.
        It's important to update the UI here because in Linux no uploadProgress events are called. The best
        we can do is say we are uploading.
        */
        var progress = new FileProgress(file, this.customSettings.progressTarget);
        progress.setStatus("正在上传..."); //progress.setStatus("Uploading...");
        progress.toggleCancel(true, this);
    }
    catch (ex) { }

    return true;
}

function uploadProgress(file, bytesLoaded, bytesTotal) {
    try {
        var percent = Math.ceil((bytesLoaded / bytesTotal) * 100);

        var progress = new FileProgress(file, this.customSettings.progressTarget);
        progress.setProgress(percent);
        progress.setStatus("正在上传...");// progress.setStatus("Uploading...");
    } catch (ex) {
        this.debug(ex);
    }
}

function uploadSuccess(file, serverData) {
    try {
        var progress = new FileProgress(file, this.customSettings.progressTarget);
        progress.setComplete();
        progress.setStatus("完成"); //progress.setStatus("Complete.");
        progress.toggleCancel(false);

    } catch (ex) {
        this.debug(ex);
    }
}

function uploadError(file, errorCode, message) {
    try {
        var progress = new FileProgress(file, this.customSettings.progressTarget);
        progress.setError();
        progress.toggleCancel(false);
        switch (errorCode) {
            case SWFUpload.UPLOAD_ERROR.HTTP_ERROR:
				if(message == 300){
					progress.setStatus("<span style='color:red'>请重新上传，上传图片必须是原图，请勿使用图片编辑软件修改</span>");
				}else{
					progress.setStatus("Upload Error: " + message);	
				}
                this.debug("Error Code: HTTP Error, File name: " + file.name + ", Message: " + message);
                break;
            case SWFUpload.UPLOAD_ERROR.UPLOAD_FAILED:
                progress.setStatus("Upload Failed.");
                this.debug("Error Code: Upload Failed, File name: " + file.name + ", File size: " + file.size + ", Message: " + message);
                break;
            case SWFUpload.UPLOAD_ERROR.IO_ERROR:
                //progress.setStatus("Server (IO) Error");
                progress.setStatus("上传文件过大");
                this.debug("Error Code: IO Error, File name: " + file.name + ", Message: " + message);
                break;
            case SWFUpload.UPLOAD_ERROR.SECURITY_ERROR:
                progress.setStatus("Security Error");
                this.debug("Error Code: Security Error, File name: " + file.name + ", Message: " + message);
                break;
            case SWFUpload.UPLOAD_ERROR.UPLOAD_LIMIT_EXCEEDED:
                progress.setStatus("Upload limit exceeded.");
                this.debug("Error Code: Upload Limit Exceeded, File name: " + file.name + ", File size: " + file.size + ", Message: " + message);
                break;
            case SWFUpload.UPLOAD_ERROR.FILE_VALIDATION_FAILED:
                progress.setStatus("Failed Validation.  Upload skipped.");
                this.debug("Error Code: File Validation Failed, File name: " + file.name + ", File size: " + file.size + ", Message: " + message);
                break;
            case SWFUpload.UPLOAD_ERROR.FILE_CANCELLED:
                // If there aren't any files left (they were all cancelled) disable the cancel button
                if (this.getStats().files_queued === 0) {
                    setButtons(false,this);
                }
                progress.setStatus("已取消");
                progress.setCancelled();
                break;
            case SWFUpload.UPLOAD_ERROR.UPLOAD_STOPPED:
                progress.setStatus("已停止");
                break;
            default:
                progress.setStatus("Unhandled Error: " + errorCode);
                this.debug("Error Code: " + errorCode + ", File name: " + file.name + ", File size: " + file.size + ", Message: " + message);
                break;
        }
    } catch (ex) {
        this.debug(ex);
    }
}

function uploadComplete(file) {
    if (this.getStats().files_queued === 0) {
        setButtons(false,this);
    }
    if (this.customSettings.CompletedEvent) {
        this.customSettings.CompletedEvent();
    }
}

// This event comes from the Queue Plugin
function queueComplete(numFilesUploaded) {
    //var status = document.getElementById("divStatus");
    //status.innerHTML = "已上传文件数:" + numFilesUploaded;
}

function setButtons(isSelected,obj) {
   // if (isSelected) {
      //  obj.setButtonText('<span class="theFont">确认上传</span>');
      //  obj.setButtonAction(SWFUpload.BUTTON_ACTION.START_UPLOAD);
      //  document.getElementById(obj.customSettings.cancelButtonId).style.display = "";
      //  document.getElementById(obj.customSettings.cancelButtonId).disabled = false;
        //document.getElementById(obj.customSettings.uploadButtonId).disabled = false;
    //} else {
        obj.setButtonText('<span class="theFont">选择文件</span>');
        obj.setButtonAction(SWFUpload.BUTTON_ACTION.SELECT_FILES);
        document.getElementById(obj.customSettings.cancelButtonId).style.display = "none";
        document.getElementById(obj.customSettings.cancelButtonId).disabled = false;
        //document.getElementById(obj.customSettings.uploadButtonId).disabled = true;
   // }
    obj.setButtonTextPadding(8, 7);
    obj.setButtonTextStyle(".theFont { font-size: 13;border:1px solid #ddd;cursor:pointer; }");
}

function swfUploadPreLoad() {
    var self = this;
    var loading = function () {
        //document.getElementById("divSWFUploadUI").style.display = "none";
        document.getElementById("divLoadingContent").style.display = "";        

        var longLoad = function () {
            document.getElementById("divLoadingContent").style.display = "none";
            document.getElementById("divLongLoading").style.display = "";
        };
        this.customSettings.loadingTimeout = setTimeout(function () {
            longLoad.call(self)
        },
			15 * 1000
		);
    };

    this.customSettings.loadingTimeout = setTimeout(function () {
        loading.call(self);
    },
		1 * 1000
	);
}

function swfUploadLoaded() {
    var self = this;
    clearTimeout(this.customSettings.loadingTimeout);
    //document.getElementById("divSWFUploadUI").style.visibility = "visible";
    //document.getElementById("divSWFUploadUI").style.display = "block";
    document.getElementById("divLoadingContent").style.display = "none";
    document.getElementById("divLongLoading").style.display = "none";
    document.getElementById("divAlternateContent").style.display = "none";

    //document.getElementById("btnBrowse").onclick = function () { self.selectFiles(); };
    document.getElementById("btnCancel").onclick = function () { self.cancelQueue(); };
}

function swfUploadLoadFailed() {
    clearTimeout(this.customSettings.loadingTimeout);
    //document.getElementById("divSWFUploadUI").style.display = "none";
    document.getElementById("divLoadingContent").style.display = "none";
    document.getElementById("divLongLoading").style.display = "none";
    document.getElementById("divAlternateContent").style.display = "";
}