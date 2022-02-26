package com.example.ticketapp.onboarding.screens

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.ticketapp.HomeFragment
import com.example.ticketapp.R


class SecondScreen : Fragment() {

    lateinit var button: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second_screen, container, false)
        button= view.findViewById(R.id.nextbtn)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.view_pager)
        button.setOnClickListener {
            viewPager?.currentItem = 2
        }

        return view
    }


}