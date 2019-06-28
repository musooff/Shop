package com.ballboycorp.anappaday.shop.utils.extensions

import android.graphics.drawable.Drawable
import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * Created by musooff on 2019-06-28.
 */

fun ImageView.loadUrl(url: String?, placeholder: Drawable? = null) {
    Glide.with(context)
        .load(url)
        .placeholder(drawable)
        .into(this)
}

fun ImageView.loadUrl(url: String?, placeholder: Int? = null) {
    Glide.with(context)
        .load(url)
        .placeholder(drawable)
        .into(this)
}