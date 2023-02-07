package com.alyousefcode.duaafragmentswithnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.alyousefcode.duaafragmentswithnav.databinding.ActivityMainBinding
import com.alyousefcode.duaafragmentswithnav.fragments.HomeFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(HomeFragment())


        navController= Navigation.findNavController(this,R.id.activity_main_nav_host_fragment)
        setupWithNavController(binding.bottomNavigationView,navController)

    }



    private fun  replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()

    }
}