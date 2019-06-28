package com.ballboycorp.anappaday.shop.base

import android.os.Build
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.ballboycorp.anappaday.shop.R

/**
 * Created by musooff on 2019-06-28.
 */
open class BaseActivity: AppCompatActivity() {


    fun requestApplyInsets() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT_WATCH) {
            findViewById<FrameLayout>(R.id.navHostContainer).requestApplyInsets()
        }
    }
}