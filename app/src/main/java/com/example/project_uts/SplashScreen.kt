package com.example.project_uts

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash_screen)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Waktu delay untuk SplashScreen dalam milidetik (contoh: 3000 = 3 detik)
        val delayTime = 3000L

        // Menggunakan Handler untuk menunda eksekusi kode
        Handler(Looper.getMainLooper()).postDelayed({
            // Intent untuk berpindah dari SplashScreen ke LoginActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

            // Mengakhiri activity ini agar pengguna tidak bisa kembali ke splash screen
            // saat menekan tombol back (kembali)
            finish()
        }, delayTime)
    }
}