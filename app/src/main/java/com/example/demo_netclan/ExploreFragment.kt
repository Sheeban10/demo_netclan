package com.example.demo_netclan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.demo_netclan.databinding.FragmentExploreBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class ExploreFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_explore, container, false)


//        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_top)
//
//        val TopNavigationView = view?.findViewById<BottomNavigationView>(R.id.nav_view_explore)
//        TopNavigationView?.setupWithNavController(navController)

        return view
    }

}


