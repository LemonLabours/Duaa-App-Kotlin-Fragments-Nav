package com.alyousefcode.duaafragmentswithnav.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.alyousefcode.duaafragmentswithnav.Models.DuaaData
import com.alyousefcode.duaafragmentswithnav.R

class MyAdapter : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    private val DuaaLista = ArrayList<DuaaData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.cardforduaa,
            parent,false
        )
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
      val currentitem = DuaaLista[position]
        holder.DataText.text = currentitem.DuaaText
    }

    override fun getItemCount(): Int {
        return DuaaLista.size
    }

    fun UpdateDuaaList(DuaaLista: List<DuaaData>){
       this.DuaaLista.clear()
        this.DuaaLista.addAll(DuaaLista)
        notifyDataSetChanged()
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val DataText : TextView = itemView.findViewById(R.id.DuaaTextincard)
    }
}