package com.example.project_uts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()

        val etUsername = findViewById<TextInputEditText>(R.id.etUsername)
        val etPassword = findViewById<TextInputEditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {

            val username = etUsername.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(
                    this,
                    "Harap isi semua kolom!",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

            if (username == "kel5" && password == "123") {

                Toast.makeText(
                    this,
                    "Login Berhasil!",
                    Toast.LENGTH_SHORT
                ).show()

                startActivity(
                    Intent(this, DashboardActivity::class.java)
                )

                finish()

            } else {

                Toast.makeText(
                    this,
                    "Username atau Password salah!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}