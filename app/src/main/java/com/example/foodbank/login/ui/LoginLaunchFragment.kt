package com.example.foodbank.login.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.foodbank.R
import com.example.foodbank.databinding.FragmentLoginLaunchBinding


class LoginLaunchFragment : Fragment() {
    private lateinit var binding: FragmentLoginLaunchBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Toast.makeText(context, "hi ", Toast.LENGTH_SHORT).show()
        binding = FragmentLoginLaunchBinding.inflate(layoutInflater, container, false)
        binding.loginAdmin.setOnClickListener { pass(it) }
        binding.loginProvider.setOnClickListener { pass(it) }
        binding.loginCustomer.setOnClickListener { pass(it) }
        return binding.root
    }

    fun pass(value : View){
    }
}