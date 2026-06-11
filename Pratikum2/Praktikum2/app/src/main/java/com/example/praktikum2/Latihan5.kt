package com.example.praktikum2
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.praktikum2.R

class Latihan5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        delegate.localNightMode = AppCompatDelegate.MODE_NIGHT_NO
        setContentView(R.layout.activity_latihan5)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val etSisiKubus = findViewById<EditText>(R.id.etSisiKubus)
        val cb1 = findViewById<CheckBox>(R.id.cbPilihan1)
        val cb2 = findViewById<CheckBox>(R.id.cbPilihan2)
        val cb3 = findViewById<CheckBox>(R.id.cbPilihan3)
        val btnProses = findViewById<Button>(R.id.btnProsesCheckBox)
        val tvHasil = findViewById<TextView>(R.id.tvHasilCheckBox)

        btnProses.setOnClickListener {
            val sisi = etSisiKubus.text.toString().toIntOrNull()

            if (sisi == null || sisi == 0) {
                tvHasil.text = "Input tidak valid"
                return@setOnClickListener
            }

            val hasil1 = sisi * sisi
            val hasil2 = 6 * sisi * sisi
            val hasil3 = sisi * sisi * sisi

            val jumlahCek = listOf(cb1, cb2, cb3).count { it.isChecked }

            if (jumlahCek >= 2) {
                var hasilText = ""

                if (cb1.isChecked) hasilText += "Luas Persegi = $hasil1 cm²\n"
                if (cb2.isChecked) hasilText += "Luas Permukaan Kubus = $hasil2 cm²\n"
                if (cb3.isChecked) hasilText += "Volume Kubus = $hasil3 cm³\n"

                tvHasil.text = hasilText
            } else {
                AlertDialog.Builder(this)
                    .setTitle("Peringatan")
                    .setMessage("Silahkan centang minimal 2 pilihan")
                    .setPositiveButton("OK") { dialog, _ ->
                        dialog.dismiss()
                    }
                    .show()

                tvHasil.text = "--------"
            }
        }
    }
}