package com.ballboycorp.anappaday.shop.main.home.adapter

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.ballboycorp.anappaday.shop.main.home.header.HeaderFragment
import com.ballboycorp.anappaday.shop.model.Item

/**
 * Created by musooff on 2019-06-28.
 */
class HeaderPagerAdapter(fragmentManager: FragmentManager): FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private var mValues = listOf<Item>()

    override fun getItem(position: Int): Fragment {
        return HeaderFragment()
            .apply { arguments = bundleOf(HeaderFragment.ITEMS to mValues) }
    }

    fun submitList(values: List<Item>) {
        mValues = values
        notifyDataSetChanged()
    }

    override fun getCount(): Int {
        return 5
    }

}