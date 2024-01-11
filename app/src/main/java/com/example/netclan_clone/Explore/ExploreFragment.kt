package com.example.netclan_clone.Explore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.netclan_clone.R

class ExploreFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_explore, container, false)
        // Find the RecyclerView in your layout
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)

        // Create an instance of the ExploreAdapter and set it on the RecyclerView
        val userList = listOf("Abhishek Singh", "Anmol Mishra", "Suyash Ghabhane","Sunishka Malviya","Reet Agrawal","Sania Sabu","Yashaswi Wahie","Shruti Nath","Harsh kulkarni") // Replace with your actual user data
        val exploreAdapter = ExploreAdapter(userList)
        recyclerView.adapter = exploreAdapter

        // Set the layout manager for the RecyclerView (e.g., LinearLayoutManager)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        return view
    }

}