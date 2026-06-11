package com.example.praktikum2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.content.ContextCompat
import android.widget.Button
import android.widget.TextView

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

        val etHasilLatihan1 = findViewById<TextView>(R.id.etHasilCob1)
        val btProseesLatihan1 = findViewById<Button>(R.id.btProsesLat1)

        btProseesLatihan1.setOnClickListener {
            val name = etHasilLatihan1.text.toString()

            if (name == "teal") {
                etHasilLatihan1.text = name
                btProseesLatihan1.setBackgroundColor(ContextCompat.getColor(this, R.color.teal_700))
            }
        }
    }}