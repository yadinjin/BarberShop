package com.example.barbershop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.switchmaterial.SwitchMaterial

class ShareActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share)


            val shareButtonOnShareActivity: Button =
                findViewById(R.id.share_button_on_share_activity)

            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(
                Intent.EXTRA_TEXT,
                "Поделись приложением " + getString(R.string.app_name) + " с друзьями"
            )

            val chooser = Intent.createChooser(shareIntent, "Поделиться!!!")

            shareButtonOnShareActivity.setOnClickListener {
                startActivity(chooser)
            }
            val showShareSwitchMaterial: SwitchMaterial = findViewById(R.id.show_share_switch_material)

            showShareSwitchMaterial.setOnCheckedChangeListener { View, isChecked ->
               if (isChecked)  shareButtonOnShareActivity.isEnabled = true
                 else shareButtonOnShareActivity.isEnabled = false
                }
            }

}

