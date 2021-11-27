package com.example.basicnavigation.fragments

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.DialogFragmentNavigator
import androidx.recyclerview.widget.RecyclerView
import com.example.basicnavigation.DestinationFragment
import com.example.basicnavigation.databinding.ItemUserBinding
import com.example.basicnavigation.fragments.DestinationAdapter.*


class DestinationAdapter(private val users: List<DestinationFragment.User>): RecyclerView.Adapter<DestinationAdapter.DestinationHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DestinationAdapter.DestinationHolder {
        val binding = ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return DestinationHolder(binding)
    }

    override fun onBindViewHolder(holder: DestinationHolder, position: Int) {
        holder.render(users[position])
    }

    override fun getItemCount(): Int = users.size

    class DestinationHolder(val binding: ItemUserBinding): RecyclerView.ViewHolder(binding.root){
        fun render(user: DestinationFragment.User){
            binding.tvUserName.setText(user.username)
            binding.tvUserNumber.setText(user.id)
        }

    }


}










































