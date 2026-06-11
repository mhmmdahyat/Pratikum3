package com.example.praktikum2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText

class Latihan6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan6)

        val etHasilCob1 = findViewById<EditText>(R.id.etHasilCob1)
        val etHasilCob2 = findViewById<EditText>(R.id.etHasilCob2)
        val etHasilCob3 = findViewById<EditText>(R.id.etHasilCob3)
        val btProsesCob1 = findViewById<Button>(R.id.btProsesCob1)

        val tvHasil = findViewById<TextView>(R.id.tvHasil)

        btProsesCob1.setOnClickListener {
            val nim = etHasilCob1.text.toString()
            val nama = etHasilCob2.text.toString()
            val kelas = etHasilCob3.text.toString()

            tvHasil.text = "NIM: $nim\nNama: $nama\nKelas: $kelas"
        }
    }
}