package com.ballboycorp.anappaday.shop

import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.navigation.NavController
import com.ballboycorp.anappaday.shop.base.BaseActivity
import com.ballboycorp.anappaday.shop.utils.extensions.makeTransparentStatus
import com.ballboycorp.anappaday.shop.utils.extensions.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    var currentNavController : LiveData<NavController>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        makeTransparentStatus()
        
        if (savedInstanceState == null)
            setupBottomNavigation()


    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        setupBottomNavigation()
    }
    
    private fun setupBottomNavigation() {

        val navGraphIds = listOf(R.navigation.nav_home, R.navigation.nav_discover, R.navigation.nav_my)

        currentNavController = bottomNav.setupWithNavController(
            navGraphIds = navGraphIds,
            fragmentManager = supportFragmentManager,
            containerId = R.id.navHostContainer,
            intent = intent
        )
    }

    override fun onSupportNavigateUp(): Boolean {
        return currentNavController?.value?.navigateUp() ?: false
    }
}
