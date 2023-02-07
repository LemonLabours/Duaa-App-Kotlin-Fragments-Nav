package com.alyousefcode.duaafragmentswithnav.Repository

import androidx.lifecycle.MutableLiveData
import com.alyousefcode.duaafragmentswithnav.Models.DuaaData
import com.google.firebase.database.*

class DuaaRepo {
    private val dbref : DatabaseReference = FirebaseDatabase.getInstance().getReference("DuaaData")

    @Volatile private var INSTANCE : DuaaRepo ?= null


    fun getInstance() : DuaaRepo {
        return INSTANCE ?: synchronized (this) {
            val instance = DuaaRepo()
            INSTANCE = instance
            instance
        }
    }


    fun LoadDuaa(datalist : MutableLiveData<List<DuaaData>>){
       dbref.addValueEventListener(object : ValueEventListener{

           override fun onDataChange(snapshot: DataSnapshot) {

               try {
                 val _datalist: List<DuaaData> = snapshot.children.map { dataSnapshot ->
                  dataSnapshot.getValue(DuaaData::class.java)!!
                 }

                   datalist.postValue(_datalist)

               } catch (e: Exception){

               }


           }

           override fun onCancelled(error: DatabaseError) {
               TODO("Not yet implemented")
           }


       })


    }
}