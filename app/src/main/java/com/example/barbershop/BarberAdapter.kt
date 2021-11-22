package com.example.barbershop

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class BarberAdapter(private val barberNameList: List<BarberList>):RecyclerView.Adapter<BarberViewHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BarberViewHolder {

        val barberItemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.barber_list_item,parent,false)

        return BarberViewHolder(barberItemView)
    }

    override fun onBindViewHolder(holder: BarberViewHolder, position: Int) {
        val barberName = barberNameList[position]
        holder.bind(barberName)
    }

    override fun getItemCount(): Int {
        return barberNameList.size
    }
}