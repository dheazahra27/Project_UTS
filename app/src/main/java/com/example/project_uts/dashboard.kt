package com.example.project_uts

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // RecyclerView Resep
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = RecipeAdapter(
            RecipeData.getRecipes()
        )

        // Bottom Navigation
        val bottomNav =
            findViewById<BottomNavigationView>(R.id.bottomNavigation)

        bottomNav.selectedItemId = R.id.navigation_dashboard

        bottomNav.setOnItemSelectedListener {

            when (it.itemId) {

                R.id.navigation_dashboard -> {
                    true
                }

                R.id.navigation_about -> {
                    startActivity(
                        Intent(this, about::class.java)
                    )
                    true
                }

                R.id.navigation_exit -> {
                    tampilkanDialogExit()
                    true
                }

                else -> false
            }
        }
    }

    private fun tampilkanDialogExit() {

        AlertDialog.Builder(this)
            .setTitle("Konfirmasi Logout")
            .setMessage("Apakah Anda yakin ingin logout dari aplikasi?")
            .setPositiveButton("YA") { _, _ ->

                val intent = Intent(
                    this,
                    LoginActivity::class.java
                )

                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or
                        Intent.FLAG_ACTIVITY_CLEAR_TASK

                startActivity(intent)
                finish()
            }
            .setNegativeButton("TIDAK", null)
            .show()
    }
}