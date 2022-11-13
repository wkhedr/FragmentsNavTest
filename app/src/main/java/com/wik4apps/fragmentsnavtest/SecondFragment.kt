package com.wik4apps.fragmentsnavtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.app.Person.fromBundle

class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        //get arguments from first fragment
        val name = arguments?.getString("name")
        val textView = view.findViewById<TextView>(R.id.hello_msg)
        textView.text = "Hello $name"
        return view
    }


}