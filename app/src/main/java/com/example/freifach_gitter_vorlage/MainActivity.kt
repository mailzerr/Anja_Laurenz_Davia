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
//hello :))))
        val imageButton1: ImageButton = findViewById(R.id.imageButton1)
        // Finde hier weitere ImageButtons

        imageButton1.setOnClickListener(this)
        // Füge hier weitere OnClickListener hinzu
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.imageButton1 -> showToast("Button 1 geklickt")
            R.id.imageButton2 -> showToast("Button 2 geklickt")
            R.id.imageButton3 -> showToast("Button 3 geklickt")
            R.id.imageButton4 -> showToast("Button 4 geklickt")
            R.id.imageButton5 -> showToast("Button 5 geklickt")
            R.id.imageButton6 -> showToast("Button 6 geklickt")
        }
    }


    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}


