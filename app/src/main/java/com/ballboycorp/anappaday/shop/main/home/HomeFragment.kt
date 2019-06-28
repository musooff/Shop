package com.ballboycorp.anappaday.shop.main.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ballboycorp.anappaday.shop.base.BaseFragment
import com.ballboycorp.anappaday.shop.databinding.FragmentHomeBinding
import com.ballboycorp.anappaday.shop.main.home.adapter.HeaderAdapter
import com.ballboycorp.anappaday.shop.main.home.adapter.HeaderPagerAdapter
import com.ballboycorp.anappaday.shop.utils.extensions.getViewModel
import com.ballboycorp.anappaday.shop.utils.extensions.observe
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * Created by musooff on 2019-06-28.
 */
class HomeFragment: BaseFragment() {

    private val headerAdapter = HeaderAdapter()

    private val viewModel by lazy { getViewModel<HomeViewModel>() }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initToolbar("For you")

        initialize()
    }

    private fun initialize() {

        initializeViews()

        initializeViewModel()
    }

    private fun initializeViewModel() {

        viewModel.headerItems.observe(this) {
            headerAdapter.submitList(it)
        }

        viewModel.getHeaderItems()

    }

    private fun initializeViews() {

        headerItems.adapter = headerAdapter

    }
}