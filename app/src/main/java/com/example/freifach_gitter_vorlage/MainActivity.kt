package com.example.freifach_gitter_vorlage

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageButton1: ImageButton = findViewById(R.id.imageButton1)
        // Finde hier weitere ImageButtons

        imageButton1.setOnClickListener(this)
        // Füge hier weitere OnClickListener hinzu

        val imageButton2: ImageButton = findViewById(R.id.imageButton2)
        imageButton2.setOnClickListener(this)

        val imageButton3: ImageButton = findViewById(R.id.imageButton3)
        imageButton3.setOnClickListener(this)

        val imageButton4: ImageButton = findViewById(R.id.imageButton4)
        imageButton4.setOnClickListener(this)

        val imageButton5: ImageButton = findViewById(R.id.imageButton5)
        imageButton5.setOnClickListener(this)

        val imageButton6: ImageButton = findViewById(R.id.imageButton6)
        imageButton6.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.imageButton1 -> showToast("Button 1 geklickt")
            // Füge hier weitere Fälle für die restlichen ImageButtons hinzu
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}


