package com.example.foodbank

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.foodbank.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = DataBindingUtil.setContentView(this,R.layout.activity_main)


//        add bottom navigation
        val navController = Navigation.findNavController(this,R.id.nav_host_fragment)
        NavigationUI.setupWithNavController(binding.bottomNavigation ,navController)

        //checking user type
        var userType:String = "NO"

        val sharedPref = getSharedPreferences(getString(R.string.LOGIN_DETAILS), MODE_PRIVATE)
        if(!sharedPref.getBoolean(getString(R.string.LOGIN_STATUS),false)){
            Toast.makeText(this,"no user",Toast.LENGTH_SHORT).show()
//            move to login screen
//            navController.navigate(R.id.action_global_loginLaunchFragment)
        }else{
            userType = sharedPref.getString(getString(R.string.USER_TYPE),"NO").toString()
        }
        //hide bottom navigations
        navController.addOnDestinationChangedListener{_,destination,_ ->
            Toast.makeText(this,destination.displayName,Toast.LENGTH_SHORT).show()
            when(destination.id){
                R.id.loginLaunchFragment -> binding.bottomNavigation.visibility = View.GONE
                else -> binding.bottomNavigation.visibility = View.VISIBLE
            }
        }

        //dynamically change the menu of bottom navigation
//        binding.bottomNavigation.menu.clear()
//        binding.bottomNavigation.inflateMenu(R.menu.bottom_navigation_provider)
        setContentView(binding.activityMain)
    }
}