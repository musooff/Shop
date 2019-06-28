package com.ballboycorp.anappaday.shop.utils.extensions

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders

/**
 * Created by musooff on 2019-06-28.
 */


inline fun <reified T: ViewModel> AppCompatActivity.getViewModel(factory: ViewModelProvider.Factory? = null): T {
    return ViewModelProviders
        .of(this, factory)
        .get(T::class.java)
}

inline fun <reified T: ViewModel> Fragment.getViewModel(factory: ViewModelProvider.Factory? = null): T {
    return ViewModelProviders
        .of(this, factory)
        .get(T::class.java)
}

inline fun <reified T: ViewModel> Fragment.getViewModelFromActivity(factory: ViewModelProvider.Factory? = null): T {
    return ViewModelProviders
        .of(activity!!, factory)
        .get(T::class.java)
}