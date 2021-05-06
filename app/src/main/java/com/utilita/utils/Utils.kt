package com.utilita.utils

import android.util.Log

object Utils {

    const val TAG = "UTILITA"
    public const val TAG_STATUS_DETAILS_RESPONSE_CODE = "com.utilita.STATUS_DETAILS_RESPONSE_CODE"
    public const val TAG_STATUS_DETAILS_RESPONSE_TIME = "com.utilita.STATUS_DETAILS_RESPONSE_TIME"
    public const val TAG_STATUS_DETAILS_RESPONSE_CLASS = "com.utilita.STATUS_DETAILS__RESPONSE_CLASS"
    public const val TAG_STATUS_DETAILS_RESPONSE_URL = "com.utilita.STATUS_DETAILS_RESPONSE_URL"
    public const val TAG_STATUS_TITLE = "com.utilita.STATUS_TITLE"

    public fun vLog( msg : String){
        Log.d(TAG,msg)
    }

}