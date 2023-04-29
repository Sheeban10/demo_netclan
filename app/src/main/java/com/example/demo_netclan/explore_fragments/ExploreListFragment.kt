package com.example.demo_netclan.explore_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.example.demo_netclan.ExploreFragment
import com.example.demo_netclan.R
import com.example.demo_netclan.databinding.FragmentExploreListBinding

class ExploreListFragment: FragmentActivity(){
    private lateinit var binding: FragmentExploreListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_explore_list)
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        binding = FragmentExploreListBinding.inflate(inflater, container, false)
//
//        return binding.root
    }
}