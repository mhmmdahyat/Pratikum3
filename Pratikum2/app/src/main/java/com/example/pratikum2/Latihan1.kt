package com.example.pratikum2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Latihan1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_latihan1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val etHasilLatihan1 = findViewById<TextView>(R.id.etHasilLat1)
        val btProsesLatihan1 = findViewById<Button>(R.id.btProsesLat1)

        btProsesLatihan1.setOnClickListener {
            val nama = etHasilLatihan1.text.toString()
            if (nama == "teal") {
                etHasilLatihan1.text = nama
                btProsesLatihan1.setBackgroundColor(ContextCompat.getColor(this, R.color.teal_700))
            }
        }
    }
}