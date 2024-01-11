package com.example.netclan_clone

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.netclan_clone.Explore.ExploreFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {


    lateinit var drawerLayout: DrawerLayout
    lateinit var bottomNavigationView : BottomNavigationView
    lateinit var navigationView : NavigationView
    lateinit var toolbar: Toolbar
    lateinit var toggle : ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottom_navigation)
        drawerLayout = findViewById(R.id.drawerActivity)
        navigationView = findViewById(R.id.nav_view)
        toolbar = findViewById(R.id.toolbar)

        setSupportActionBar(toolbar)
        toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close).apply {
            setHomeAsUpIndicator(R.drawable.ic_drawer_icon)
            drawerArrowDrawable.color = Color.WHITE
        }
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.explore -> {
                    replaceFragment(ExploreFragment())
                    true
                }
                R.id.Network -> {
                    replaceFragment(NetworkFragment())
                    true
                }
                R.id.chat -> {
                    replaceFragment(ChatFragment())
                    true
                }
                R.id.contacts -> {
                    replaceFragment(ContactsFragment())
                    true
                }
                R.id.groups -> {
                    replaceFragment(GroupFragment())
                    true
                }
                else -> false
            }
        }
        replaceFragment(ExploreFragment())
    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.FrameContainer,fragment).commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu,menu)
        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var id =item.itemId
        if(id ==  R.id.refine){
            val intent = Intent(this, RefinePage::class.java)
            startActivity(intent)

        }
        return true
    }
}