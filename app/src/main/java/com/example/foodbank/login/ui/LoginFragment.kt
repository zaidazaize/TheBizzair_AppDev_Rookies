package com.example.foodbank.login.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.foodbank.R


class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //TODO: SAVE LOGIN DATA TO SQLITE DB
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

}