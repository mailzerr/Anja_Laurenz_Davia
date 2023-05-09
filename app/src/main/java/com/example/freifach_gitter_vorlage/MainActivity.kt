package com.example.freifach_gitter_vorlage

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


