package com.example.barbershop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SelectBarberActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_barber)

        val nameBarberList: List<BarberList> = listOf(
            BarberList("Иван", "Петров", "+ 7 123 123 12 12"),
            BarberList("Петр", "Иванов", "+ 7 231 321 21 21"),
            BarberList("Василий", "Сидоров", "+ 7 456 654 75 75"),
            BarberList("Сидор", "Васильев", "+ 7 333 444 55 66")
        )

        //val nameBarberList:List<String> = listOf("Иван","Петр","Юрий")

        val barberRecyclerView: RecyclerView = findViewById(R.id.barber_recycler_view)
        barberRecyclerView.layoutManager =
            LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false)
        barberRecyclerView.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )
        barberRecyclerView.adapter = BarberAdapter(nameBarberList)


        }
}
