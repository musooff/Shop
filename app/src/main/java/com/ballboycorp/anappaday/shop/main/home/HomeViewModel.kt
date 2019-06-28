package com.ballboycorp.anappaday.shop.main.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ballboycorp.anappaday.shop.model.Item

/**
 * Created by musooff on 2019-06-28.
 */
class HomeViewModel: ViewModel() {

    val headerItems = MutableLiveData<List<Item>>()

    fun getHeaderItems() {
        headerItems.value = listOf(
            Item().apply {
                title = "Laminated Tablecloth"
                content = "Solid wood, a durable natural material. Practical storage space underneath the table top. Care instructions Wipe clean with a damp cloth. Wipe clean with a dry cloth. Check regularly that all assembly fastenings are properly tightened and retighten when necessary."
                thumbnail = "https://static.zarahome.net/8/photos4/2019/V/4/1/p/0783/021/402/0783021402_1_1_4.jpg"
            },
            Item().apply {
                title = "Floral Tablecloth"
                content = "Solid wood, a durable natural material. Practical storage space underneath the table top. Care instructions Wipe clean with a damp cloth. Wipe clean with a dry cloth. Check regularly that all assembly fastenings are properly tightened and retighten when necessary."
                thumbnail = "https://static.zarahome.net/8/photos4/2019/V/4/1/p/6847/021/400/6847021400_1_1_4.jpg"
            },
            Item().apply {
                title = "Check linen Tablecloth"
                content = "Solid wood, a durable natural material. Practical storage space underneath the table top. Care instructions Wipe clean with a damp cloth. Wipe clean with a dry cloth. Check regularly that all assembly fastenings are properly tightened and retighten when necessary."
                thumbnail = "https://static.zarahome.net/8/photos4/2019/V/4/1/p/6960/021/999/6960021999_1_1_4.jpg"
            },
            Item().apply {
                title = "Printed Linen Tablecloth"
                content = "Solid wood, a durable natural material. Practical storage space underneath the table top. Care instructions Wipe clean with a damp cloth. Wipe clean with a dry cloth. Check regularly that all assembly fastenings are properly tightened and retighten when necessary."
                thumbnail = "https://static.zarahome.net/8/photos4/2019/V/4/1/p/8369/021/800/8369021800_1_1_4.jpg"
            }
        )
    }
}