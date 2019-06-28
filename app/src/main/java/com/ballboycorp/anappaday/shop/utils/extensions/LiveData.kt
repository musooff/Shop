package com.ballboycorp.anappaday.shop.utils.extensions

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

/**
 * Created by musooff on 2019-06-28.
 */


fun <T> LiveData<T>.observe(owner: LifecycleOwner, action: (T) -> Unit) {
    this.observe(owner, Observer {
        action(it)
    })
}