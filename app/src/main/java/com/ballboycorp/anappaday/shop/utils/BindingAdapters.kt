package com.ballboycorp.anappaday.shop.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import com.ballboycorp.anappaday.shop.R
import com.ballboycorp.anappaday.shop.common.HorizontalSpaceDecoration
import com.ballboycorp.anappaday.shop.common.VerticalSpaceDecoration
import com.ballboycorp.anappaday.shop.utils.extensions.loadUrl

/**
 * Created by musooff on 2019-06-28.
 */
object BindingAdapters {

    @JvmStatic
    @BindingAdapter("app:uri")
    fun setImageUri(imageView: ImageView, uri: String?) {
        imageView.loadUrl(uri, R.color.colorDefaultImageBackground)
    }

    @JvmStatic
    @BindingAdapter("app:emptyItemDecorator")
    fun setEmptyItemDecorator(recyclerView: RecyclerView, isHorizontal: Boolean = false) {
        if (isHorizontal){
            recyclerView.addItemDecoration(HorizontalSpaceDecoration(recyclerView.context, R.dimen.default_item_margin))
        }
        else {
            recyclerView.addItemDecoration(VerticalSpaceDecoration(recyclerView.context, R.dimen.default_item_margin))
        }
    }

    @JvmStatic
    @BindingAdapter("app:snapHelper")
    fun setSnapHelper(recyclerView: RecyclerView, enabled: Boolean = false) {
        if (enabled) {
            val snapHelper = LinearSnapHelper()
            snapHelper.attachToRecyclerView(recyclerView)
        }
    }
}