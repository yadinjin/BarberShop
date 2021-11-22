package com.example.barbershop

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BarberViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

    fun bind (barberName: BarberList){
        val barberNameTextView: TextView =itemView.findViewById(R.id.barber_name_text_view)
        barberNameTextView.text = barberName.name
        val barberSurNameTextView: TextView = itemView.findViewById(R.id.barber_surname_text_view)
        barberSurNameTextView.text = barberName.surName
        val barberPhoneTextView: TextView = itemView.findViewById(R.id.barber_phone_text_view)
        barberPhoneTextView.text = barberName.phone
    }

}