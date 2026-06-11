package com.example.pratikum2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Latiahan6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_latiahan6)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val inputNIM = findViewById<EditText>(R.id.etHasil1)
        val inputNama = findViewById<EditText>(R.id.etHasil2)
        val inputKelas = findViewById<EditText>(R.id.etHasil3)
        val btnProses = findViewById<Button>(R.id.button2)
        val tvHasil = findViewById<TextView>(R.id.tvHasil)

        btnProses.setOnClickListener {
            val nim = inputNIM.text.toString()
            val nama = inputNama.text.toString()
            val kelas = inputKelas.text.toString()

            val hasilGabungan = "NIM: $nim\nNama: $nama\nKelas: $kelas"
            tvHasil.text = hasilGabungan
        }
    }
}