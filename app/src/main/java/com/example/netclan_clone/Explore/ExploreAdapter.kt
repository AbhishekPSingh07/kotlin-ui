package com.example.netclan_clone.Explore

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.netclan_clone.R

class ExploreAdapter(
    private val userList: List<String>
) : RecyclerView.Adapter<ExploreAdapter.ViewHolder>() {

    // ViewHolder class that holds references to the views in each list item
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userNameTextView: TextView = itemView.findViewById(R.id.NameTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Inflate the item layout and return the ViewHolder
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_display, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        // Return the size of your data list
        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Bind data to the views in each list item
        val userName = userList[position]
        holder.userNameTextView.text = userName
    }
}
