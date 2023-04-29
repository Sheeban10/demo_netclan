package com.example.demo_netclan.explore_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.demo_netclan.databinding.FragmentNearMeBinding

class NearMeFragment: Fragment() {

    private lateinit var binding: FragmentNearMeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNearMeBinding.inflate(inflater, container, false)

        return binding.root
    }
}