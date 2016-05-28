// PlaceId ProgressId CancelId Url Size Types TypeDesc  CompletedEvent
UploadSetting = function (settingObj) {
    var settings = {
        flash_url: "http://www.ppdaicdn.com/js/swfupload/swfupload.swf",
        flash9_url: "http://www.ppdaicdn.com/js/swfupload/swfupload_FP9.swf", // Relative to this file
        upload_url: settingObj.Url,
        post_params: settingObj.Param, //{ "PHPSESSID": "" },
        file_size_limit: settingObj.Size + " MB",
        file_types: settingObj.Types,
        file_types_description: settingObj.TypeDesc,
        file_upload_limit: settingObj.FileCount,
        file_queue_limit: 0,
        custom_settings: {
            progressTarget: settingObj.ProgressId, // "fsUploadProgress",
            //uploadButtonId: settingObj.UploadId, //btnUpload
            cancelButtonId: settingObj.CancelId, // "btnCancel"
            CompletedEvent: settingObj.CompletedEvent
        },
        debug: false,

        // Button settings
        button_image_url: "http://www.ppdaicdn.com/js/swfupload/images/upload_button.jpg",
        button_width: "73",
        button_height: "29",
        button_placeholder_id: settingObj.PlaceId,
        button_text: '<span class="theFont">选择文件</span>',
        button_text_top_padding: 7,
        button_text_left_padding:8,
		button_text_color:"#CCC",
        button_text_style: ".theFont {font-size: 13px;border:1px solid #ddd;cursor:pointer;}",
        button_cursor:SWFUpload.CURSOR.HAND,

        // The event handler functions are defined in handlers.js
        file_queued_handler: fileQueued,
        file_queue_error_handler: fileQueueError,
        file_dialog_complete_handler: fileDialogComplete,
        upload_start_handler: uploadStart,
        upload_progress_handler: uploadProgress,
        upload_error_handler: uploadError,
        upload_success_handler: uploadSuccess,
        upload_complete_handler: uploadComplete,
        queue_complete_handler: queueComplete,	// Queue plugin event

        // SWFObject settings
		minimum_flash_version : "9.0.28",
		swfupload_pre_load_handler : swfUploadPreLoad
		//swfupload_load_failed_handler : swfUploadLoadFailed
    };

    return settings;
}