package com.example.freifach_gitter_vorlage

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//hello :))))
        val imageButton1: ImageButton = findViewById(R.id.imageButton1)
        imageButton1.setOnClickListener(this)

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
        var score = 1
        var max = 100
        when (v.id) {
            R.id.imageButton1 -> {replaceImageWithDelay(R.id.imageButton1)
                score = score + 1 }
            //showToast("Button 1 geklickt")
            R.id.imageButton2 -> {replaceImageWithDelay(R.id.imageButton2)
                score = score + 1}
            //showToast("Button 2 geklickt")
            R.id.imageButton3 -> {replaceImageWithDelay(R.id.imageButton3)
                score = score + 1}
            //showToast("Button 3 geklickt")
            R.id.imageButton4 -> {replaceImageWithDelay(R.id.imageButton4)
                score = score + 1}
            //showToast("Button 4 geklickt")
            R.id.imageButton5 -> {replaceImageWithDelay(R.id.imageButton5)
                score = score + 1}
            //showToast("Button 5 geklickt")
            R.id.imageButton6 -> {replaceImageWithDelay(R.id.imageButton6)
                score = score + 1}
            //showToast("Button 6 geklickt")
        }
        if (score == max){
            showToast("Score 100 erreicht")
        }
    }
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
    private fun replaceImageWithDelay(resID: Int) {
        // Referenz zum ImageView, das ersetzt werden soll
        val imageViewToReplace: ImageButton = findViewById(resID)
        imageViewToReplace.setImageResource(R.drawable.ohne_maus)

        // Referenz zum ImageView, das das ursprüngliche ImageView ersetzen soll
        val replacementImageView: ImageButton = findViewById(resID)
        replacementImageView.setImageResource(R.drawable.mit_maus)

        // Handler erstellen
        val handler = Handler()

        // Minimale und maximale Verzögerungszeit in Millisekunden
        val minDelay = 500
        val maxDelay = 1500

        // Zufällige Verzögerungszeit generieren
        val randomDelay = Random.nextInt(minDelay, maxDelay).toLong()

// Verzögerten Task ausführen
        handler.postDelayed({
            // Hier wird das Bild des zu ersetzenden ImageView geändert
            imageViewToReplace.setImageResource(R.drawable.ohne_maus)

            // Zufällige Verzögerungszeit generieren
            val randomDelay2 = Random.nextInt(minDelay, maxDelay).toLong()

            // Handler erneut ausführen, um das Bild wieder zu ändern
            handler.postDelayed({
                imageViewToReplace.setImageResource(R.drawable.mit_maus)
            }, randomDelay2) // Hier wird die zufällige Verzögerungszeit verwendet
        }, randomDelay) }// Hier wird die zufällige Verzögerungszeit verwendet
}
