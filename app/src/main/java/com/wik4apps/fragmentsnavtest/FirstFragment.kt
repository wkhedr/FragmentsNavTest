package com.wik4apps.fragmentsnavtest

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val helloBtn = view.findViewById<Button>(R.id.buttonHello)
        val nameEditText = view.findViewById<android.widget.EditText>(R.id.editTextName)
        helloBtn.setOnClickListener {
            //navigate to second fragment
            //val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(nameEditText.text.toString())
            //view.findNavController().navigate(action)
           // val b : Bundle = Bundle()
           // b.putString("name", nameEditText.text.toString())
            view.findNavController().navigate(R.id.action_firstFragment_to_secondFragment, Bundle().apply {
                putString("name", nameEditText.text.toString())
            })
            val name = nameEditText.text.toString()
            Log.d("FirstFragment", "Name: $name")
        }
        return view
    }


}