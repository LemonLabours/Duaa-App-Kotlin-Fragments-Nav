package com.alyousefcode.duaafragmentswithnav.Models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alyousefcode.duaafragmentswithnav.Repository.DuaaRepo

class DuaaViewModel: ViewModel() {

    private val repository : DuaaRepo
    private val _allduaa = MutableLiveData<List<DuaaData>>()
    val allduaa : LiveData<List<DuaaData>> = _allduaa


    init {
        repository = DuaaRepo().getInstance()
        repository.LoadDuaa(_allduaa)
    }
}