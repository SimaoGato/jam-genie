package com.example.jamgenie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var generateRandomChordButton = findViewById<Button>(R.id.buttonRandomChord)
        generateRandomChordButton.setOnClickListener {
            val generateRandomChordIntent = Intent (this, RandomChordActivity::class.java)
            startActivity(generateRandomChordIntent)
        }
    }
}