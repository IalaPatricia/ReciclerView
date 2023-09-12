package com.example.myapplicationrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class Adapter (
    private val myList: List<String>
):RecyclerView.Adapter<Adapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.MyViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.item_adapter,parent,false)
        return MyViewHolder(itemView)
          }

    override fun onBindViewHolder(holder: Adapter.MyViewHolder, position: Int) {
        val name=myList[position]
        holder.textName.text = name
          }

    override fun getItemCount()= myList.size
       class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
           val textName: TextView = itemView.findViewById(R.id.textName)
    }
}