package com.alyousefcode.duaafragmentswithnav.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alyousefcode.duaafragmentswithnav.R
import com.google.firebase.database.*

class NightFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_night, container, false)


    }




}