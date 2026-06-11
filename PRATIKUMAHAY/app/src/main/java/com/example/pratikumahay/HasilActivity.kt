package com.example.pratikumahay

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HasilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val tvHasilNama = findViewById<TextView>(R.id.hasilnm)
        val tvHasilNim = findViewById<TextView>(R.id.hasilnim)
        val tvHasilNilai = findViewById<TextView>(R.id.hasilnilai)
        val tvHasilGrade = findViewById<TextView>(R.id.tvHasil)


        val nama = intent.getStringExtra("nama")
        val nim = intent.getStringExtra("nim")
        val nilai = intent.getIntExtra("nilai", 0)
        val grade = intent.getStringExtra("grade")


        tvHasilNama.text = "Nama : $nama"
        tvHasilNim.text = "NIM : $nim"
        tvHasilNilai.text = "Nilai : $nilai"
        tvHasilGrade.text = "Grade : $grade"

        tvHasilGrade.setTextColor(
            when(grade) {
                "A" -> 0xFF4CAF50.toInt() // hijau
                "B" -> 0xFF2196F3.toInt() // biru
                "C" -> 0xFFFF9800.toInt() // orange
                else -> 0xFFF44336.toInt() // merah
            }
        )
    }
}