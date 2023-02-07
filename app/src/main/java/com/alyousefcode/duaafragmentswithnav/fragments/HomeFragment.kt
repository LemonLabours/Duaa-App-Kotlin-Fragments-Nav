package com.alyousefcode.duaafragmentswithnav.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.alyousefcode.duaafragmentswithnav.Adapter.MyAdapter
import com.alyousefcode.duaafragmentswithnav.Models.DuaaViewModel
import com.alyousefcode.duaafragmentswithnav.R

class HomeFragment : Fragment() {

private lateinit var viewModel : DuaaViewModel
private lateinit var duaaRV : RecyclerView
private lateinit var adapter: MyAdapter

    override fun onCreateView(


        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        duaaRV = view.findViewById(R.id.DuaaListRV)
        duaaRV.layoutManager = LinearLayoutManager(context)
        duaaRV.setHasFixedSize(true)
        adapter = MyAdapter()
        duaaRV.adapter = adapter

        viewModel = ViewModelProvider(this).get(DuaaViewModel::class.java)
        viewModel.allduaa.observe(viewLifecycleOwner, Observer {
            adapter.UpdateDuaaList(it)
        })
    }



    }







