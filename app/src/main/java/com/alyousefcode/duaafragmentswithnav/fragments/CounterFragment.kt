package com.alyousefcode.duaafragmentswithnav.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.alyousefcode.duaafragmentswithnav.R


class CounterFragment : Fragment() {





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_counter, container, false)



    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val count = view.findViewById<TextView>(R.id.txViewMe)

        view.findViewById<Button>(R.id.btnClickMe).setOnClickListener {
            var countValue = count.text.toString().toInt()
            count.text=(++countValue).toString()
        }
        view.findViewById<Button>(R.id.btnClear).setOnClickListener {
            var countValue = count.text.toString().toInt()
            count.text=(0).toString()

        }

    }

    }
