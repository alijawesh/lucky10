package com.example.lucky10

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lucky10.Adapter.ViewHolder

class Adapter(val data :List<lands> ):RecyclerView.Adapter<ViewHolder>() {


    inner class ViewHolder
    internal constructor(MyView :View): RecyclerView.ViewHolder(MyView){
        val MyView :TextView = MyView.findViewById(R.id.list_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val luck = LayoutInflater.from(parent.context).inflate(R.layout.list,parent,false)
        return ViewHolder(luck)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.MyView.text=data[position].char.toString()

    }


    override fun getItemCount(): Int {
        return data.size

    }

}
