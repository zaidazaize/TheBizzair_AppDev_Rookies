package com.example.foodbank.provider

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.foodbank.R
import com.example.foodbank.databinding.FragmentActiveOrdersBinding

import com.example.foodbank.provider.placeholder.PlaceholderContent.PlaceholderItem

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class MyactiveOrdersRecyclerViewAdapter(
    private val values: List<PlaceholderItem>
) : RecyclerView.Adapter<MyactiveOrdersRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            FragmentActiveOrdersBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.idView.text = item.id
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentActiveOrdersBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val idView: TextView = binding.textViewId

        override fun toString(): String {
            return super.toString() + " '" + "no" + "'"
        }
    }

}