package com.ballboycorp.anappaday.shop.utils.extensions

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/**
 * Created by musooff on 2019-06-28.
 */

fun <T: ViewDataBinding> ViewGroup.bind(layoutId: Int, viewType: Int, attachToParent: Boolean = false): T {
    return DataBindingUtil.inflate(LayoutInflater.from(this.context), layoutId, this, attachToParent)
}