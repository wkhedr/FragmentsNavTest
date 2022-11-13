package com.wik4apps.fragmentsnavtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*val appBarConfiguration = AppBarConfiguration
            .Builder(
                R.id.firstFragment,
                R.id.secondFragment)
            .build()
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.frag_cont_view) as NavHostFragment
        val navController = navHostFragment.findNavController()
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)*/

    }
}