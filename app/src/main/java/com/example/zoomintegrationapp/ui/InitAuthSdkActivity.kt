package com.example.zoomintegrationapp.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.zoomintegrationapp.R
import com.example.zoomintegrationapp.initsdk.InitAuthSDKCallback
import com.example.zoomintegrationapp.initsdk.InitAuthSDKHelper
import us.zoom.sdk.ZoomApiError
import us.zoom.sdk.ZoomError
import us.zoom.sdk.ZoomSDK


class InitAuthSdkActivity() : AppCompatActivity() , InitAuthSDKCallback {

    lateinit var mZoomSDK:ZoomSDK

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_init_auth_sdk)

        mZoomSDK= ZoomSDK.getInstance()

        InitAuthSDKHelper.instance?.initSDK(this, this)

    }

    override fun onZoomSDKInitializeResult(errorCode: Int, internalErrorCode: Int) {
        if (errorCode != ZoomError.ZOOM_ERROR_SUCCESS) {
            Toast.makeText(
                this,
                "Failed to initialize Zoom SDK. Error: $errorCode, internalErrorCode=$internalErrorCode",
                Toast.LENGTH_LONG
            ).show()
        } else {
            ZoomSDK.getInstance().meetingSettingsHelper.enable720p(false)
            ZoomSDK.getInstance().meetingSettingsHelper.enableShowMyMeetingElapseTime(true)

            Toast.makeText(this, "Initialize Zoom SDK successfully.", Toast.LENGTH_LONG).show()

            }
        }


    override fun onZoomAuthIdentityExpired() {
        TODO("Not yet implemented")
    }

}