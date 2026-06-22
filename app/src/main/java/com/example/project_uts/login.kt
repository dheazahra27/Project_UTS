package com.example.project_uts // Sesuaikan dengan nama package aplikasi Anda

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.project_uts.R
import com.example.project_uts.about
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Menyembunyikan ActionBar atas bawaan tema Android
        supportActionBar?.hide()

        // Inisialisasi komponen UI dari layout XML
        val etUsername = findViewById<TextInputEditText>(R.id.etUsername)
        val etPassword = findViewById<TextInputEditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        // Logika ketika tombol Login ditekan
        btnLogin.setOnClickListener {
            val username = etUsername.text.toString().trim()
            val password = etPassword.text.toString().trim()

            // 1. Validasi input jika masih kosong
            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Harap isi semua kolom!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // 2. Validasi akun dummy (misal menggunakan kredensial 'kel5' seperti di screenshot Anda)
            if (username == "kel5" && password == "123") {
                Toast.makeText(this, "Login Berhasil!", Toast.LENGTH_SHORT).show()

                // 3. Logika Pindah Halaman menggunakan Intent ke AboutActivity
                val intent = Intent(this, about::class.java)
                startActivity(intent)

                // finish() digunakan agar ketika user menekan tombol 'Back' di HP,
                // mereka tidak kembali ke halaman login lagi melainkan langsung keluar aplikasi.
                finish()
            } else {
                Toast.makeText(this, "Username atau Password salah!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}