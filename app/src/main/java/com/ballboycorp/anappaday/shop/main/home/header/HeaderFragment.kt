package com.ballboycorp.anappaday.shop.main.home.header

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ballboycorp.anappaday.shop.base.BaseFragment
import com.ballboycorp.anappaday.shop.databinding.ItemHomeHeaderBinding

/**
 * Created by musooff on 2019-06-28.
 */
class HeaderFragment: BaseFragment() {

    companion object {
        const val ITEMS = "items"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = ItemHomeHeaderBinding.inflate(inflater, container, false)
        return binding.root
    }
}