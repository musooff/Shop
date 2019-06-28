package com.ballboycorp.anappaday.shop.base

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.ballboycorp.anappaday.shop.R

/**
 * Created by musooff on 2019-06-28.
 */
open class BaseFragment: Fragment() {

    val mActivity by lazy { activity as BaseActivity }

    fun initToolbar(title: String? = null, withBackButton: Boolean = false) {
        val toolbar: Toolbar = view?.findViewById(R.id.toolbar) ?: return
        toolbar.title = title

        val activity = activity as AppCompatActivity
        activity.setSupportActionBar(toolbar)

        if (withBackButton) {
            activity.supportActionBar?.apply {
                setDisplayHomeAsUpEnabled(true)
                setDisplayShowHomeEnabled(true)
            }
        }
    }

    override fun onResume() {
        super.onResume()
        mActivity.requestApplyInsets()
    }
}