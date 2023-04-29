package com.example.demo_netclan.explore_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.example.demo_netclan.ExploreFragment
import com.example.demo_netclan.R
import com.example.demo_netclan.databinding.FragmentAvailableConnectionsBinding

class AvailableConnectionsFragment: FragmentActivity(){

    private lateinit var binding: FragmentAvailableConnectionsBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_available_connections)

        val fragment = ExploreFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.explore_fragment, fragment)
        transaction.commit()
    }

//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        binding = FragmentAvailableConnectionsBinding.inflate(inflater, container, false)
//
//        return binding.root
//    }
}