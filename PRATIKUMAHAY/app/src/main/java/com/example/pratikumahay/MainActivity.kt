package com.example.pratikumahay

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var etmain1: EditText
    lateinit var etmain2: EditText
    lateinit var etmain3: EditText
    lateinit var tvhasilmain: TextView
    lateinit var btProses: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        etmain1 = findViewById<EditText>(R.id.inputnama)
        etmain2 = findViewById<EditText>(R.id.inputnim)
        etmain3 = findViewById<EditText>(R.id.inputnilai)
        btProses = findViewById<Button>(R.id.btnproses)

        btProses.setOnClickListener {

            val nama = etmain1.text.toString()
            val nim = etmain2.text.toString()
            val nilaiStr = etmain3.text.toString()


            // Validasi input
            if (nama.isEmpty() || nim.isEmpty() || nilaiStr.isEmpty()) {
                Toast.makeText(this, "Semua field harus diisi!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val nilai = nilaiStr.toInt()

            // Hitung grade
            val grade = when {
                nilai >= 85 -> "A"
                nilai >= 70 -> "B"
                nilai >= 60 -> "C"
                nilai >= 50 -> "D"
                else -> "E"
            }

            val intent = Intent(this@MainActivity, HasilActivity::class.java)

            intent.putExtra("nama", nama)
            intent.putExtra("nim", nim)
            intent.putExtra("nilai", nilai)
            intent.putExtra("grade", grade)

            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}