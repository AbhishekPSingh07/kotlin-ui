package com.example.netclan_clone

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.netclan_clone.Explore.ExploreAdapter

class RefinePage : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_refine)
        // Set up the Toolbar
        val toolbar: Toolbar = findViewById(R.id.Refinetoolbar)
        setSupportActionBar(toolbar)

        // Enable the Up button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


    }

    // Handle Up button click
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}