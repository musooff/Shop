package com.ballboycorp.anappaday.shop.main.home.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ballboycorp.anappaday.shop.R
import com.ballboycorp.anappaday.shop.databinding.ItemHomeHeaderBinding
import com.ballboycorp.anappaday.shop.main.home.header.model.HeaderItemViewModel
import com.ballboycorp.anappaday.shop.model.Item
import com.ballboycorp.anappaday.shop.utils.extensions.bind

/**
 * Created by musooff on 2019-06-28.
 */
class HeaderAdapter: RecyclerView.Adapter<HeaderAdapter.HeaderViewHolder>() {

    private var mValues = listOf<Item>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeaderViewHolder {
        val binding = parent.bind<ItemHomeHeaderBinding>(R.layout.item_home_header, viewType)
        return HeaderViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return mValues.size
    }

    override fun onBindViewHolder(holder: HeaderViewHolder, position: Int) {
        holder.binding.viewModel = HeaderItemViewModel(mValues[position])
    }


    fun submitList(values: List<Item>) {
        mValues = values
        notifyDataSetChanged()
    }

    inner class HeaderViewHolder(val binding: ItemHomeHeaderBinding): RecyclerView.ViewHolder(binding.root)
}