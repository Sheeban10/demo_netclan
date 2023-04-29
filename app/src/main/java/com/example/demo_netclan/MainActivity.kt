package com.example.demo_netclan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.demo_netclan.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)

        setSupportActionBar(findViewById(R.id.toolbar))


        val appBarConfiguration = AppBarConfiguration(
            setOf(R.id.refine, R.id.explore)
        )

        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)



    }

//    fun setupDrawerLayout(){
//    actionBarDrawerToggle = ActionBarDrawerToggle(this, rightDrawer, R.string.app_name, R.string.app_name)
//    actionBarDrawerToggle.syncState()
//
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        if(actionBarDrawerToggle.onOptionsItemSelected(item)){
//            return true
//        }
//        return super.onOptionsItemSelected(item)
//    }
}

