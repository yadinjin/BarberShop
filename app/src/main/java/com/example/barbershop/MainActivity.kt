package com.example.barbershop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aboutButton: Button = findViewById(R.id.about_button)
        val aboutIntent = Intent(this, AboutActivity::class.java)
        aboutButton.setOnClickListener {
            startActivity(aboutIntent)
        }

        val shareButton: Button = findViewById(R.id.share_button)
        val shareIntent = Intent(this, ShareActivity::class.java)
        shareButton.setOnClickListener {
            startActivity(shareIntent)
        }

        val selectBarberButton: Button = findViewById(R.id.mens_haircut_button)
        val selectBarbeIntent = Intent(this, SelectBarberActivity::class.java)
        selectBarberButton.setOnClickListener {
            startActivity(selectBarbeIntent)
        }

        val selectHairDresserButton: Button = findViewById(R.id.womens_haircut_button)
        selectHairDresserButton.setOnClickListener {
            Toast.makeText(
                this, "Этот функционал находится в разработке." +
                        " Приносим извинения за неудобства", Toast.LENGTH_LONG
            ).show()
        }

    }
}