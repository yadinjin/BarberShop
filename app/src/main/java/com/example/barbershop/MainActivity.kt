package com.example.barbershop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
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

        val manHaircutButton: Button = findViewById(R.id.man_haircut_button)
        val selectBarbeIntent = Intent(this, SelectBarberActivity::class.java)
        manHaircutButton.setOnClickListener {
            startActivity(selectBarbeIntent)
        }

        val womanHaircutButton: Button = findViewById(R.id.woman_haircut_button)
        womanHaircutButton.setOnClickListener {
            selectWomanHaircut ()
        }
        val womanHaircutImageButton: ImageButton = findViewById(R.id.woman_haircut_image_button)
        womanHaircutImageButton.setOnClickListener {
            selectWomanHaircut ()
        }
    }
    private fun selectWomanHaircut () {
        Toast.makeText(
            this, "Этот функционал находится в разработке." +
                    " Приносим извинения за неудобства", Toast.LENGTH_LONG
        ).show()
    }


}