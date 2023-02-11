package com.example.foodbank

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.foodbank.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        //get navcontroler
        var userType:String = "NO"

//        val sharedPref = getSharedPreferences(getString(R.string.LOGIN_DETAILS), MODE_PRIVATE)
//        if(!sharedPref.getBoolean(getString(R.string.LOGIN_STATUS),false)){
//            //move to login screen
//            Navigation.findNavController(binding.bottomNavigation).navigate(R.id.action_global_loginLaunchFragment)
//        }else{
//            userType = sharedPref.getString(getString(R.string.USER_TYPE),"NO").toString()
//        }

        //add bottom navigation
//        val navController = Navigation.findNavController(binding.root)
//        NavigationUI.setupWithNavController(binding.bottomNavigation,navController)
//
//        //hide bottom navigations
//        navController.addOnDestinationChangedListener{_,destination,_ ->
//            when(destination.id){
//                R.id.loginFragment,
//                R.id.loginLaunchFragment -> binding.bottomNavigation.visibility = View.GONE
//                else -> binding.bottomNavigation.visibility = View.VISIBLE
//            }
//        }
        setContentView(binding.activityMain)
    }
}