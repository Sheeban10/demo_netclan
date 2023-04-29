package com.example.demo_netclan.explore_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.demo_netclan.ExploreFragment
import com.example.demo_netclan.R
import com.example.demo_netclan.databinding.FragmentNearMeBinding

class NearMeFragment: FragmentActivity() {

    private lateinit var binding: FragmentNearMeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_near_me)
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        binding = FragmentNearMeBinding.inflate(inflater, container, false)
//
//        return binding.root
    }
}