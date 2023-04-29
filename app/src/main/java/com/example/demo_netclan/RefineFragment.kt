package com.example.demo_netclan

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.demo_netclan.databinding.FragmentRefineBinding
import com.example.demo_netclan.explore_fragments.AvailableConnectionsFragment

class RefineFragment: Fragment() {
    private lateinit var binding: FragmentRefineBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRefineBinding.inflate(inflater, container, false)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val spinner: Spinner = binding.spinner
        val items = listOf(
            "Available | Hey Let Us Connect",
            "Away | Stay Discreet And Watch",
            "Busy | Do Not Disturb | Will Catch Up Later",
            "SOS | Emergency! Need Assistance! HELP"
        )
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, items)
        spinner.adapter = adapter

        // Set the hint as the default selection
        spinner.setSelection(0)

        val myEditText: EditText = binding.addYourStatusTv
        val counterTextView: TextView = binding.counterTextView

            val currentLength = myEditText.text.toString().length
            counterTextView.text = "$currentLength/250"

        myEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // This method is not used in this example
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Update the counter text view with the current character count
                val currentLength = s.toString().length
                counterTextView.text = "$currentLength/250"
            }

            override fun afterTextChanged(s: Editable?) {
                // This method is not used in this example
            }
        })

        val button = view.findViewById<Button>(R.id.btn_refine)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_refine_to_explore)

        }

    }

}



