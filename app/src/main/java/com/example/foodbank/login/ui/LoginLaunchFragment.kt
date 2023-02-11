package com.example.foodbank.login.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.foodbank.R


class LoginLaunchFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Toast.makeText(context,"hi ",Toast.LENGTH_SHORT).show()
        return inflater.inflate(R.layout.fragment_login_launch, container, false)
    }

}