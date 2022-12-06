package com.geektech.a6m4.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geektech.a6m4.adapters.RecyclerAdater.*
import com.geektech.a6m4.databinding.ItemRecyclerBinding

class RecyclerAdater (private var data: ArrayList<String>) :
    RecyclerView.Adapter<RecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        return RecyclerViewHolder(
            ItemRecyclerBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.onBind(position)
    }

    override fun getItemCount(): Int = data.size

    inner class RecyclerViewHolder(private var binding: ItemRecyclerBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(position: Int) {
            binding.tvThird.text = data[position]
        }
    }
}