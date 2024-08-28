package com.rahmi.latihan2kotlin_rahmi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var loginButton: Button
    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Pastikan Anda memiliki layout ini

        // Inisialisasi elemen UI
        loginButton = findViewById(R.id.login)
        usernameEditText = findViewById(R.id.username)
        passwordEditText = findViewById(R.id.password)

        // Set OnClickListener untuk tombol login
        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Cek username dan password
            if (username == "admin" && password == "12345") {
                val intent = Intent(this, activity_main2::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Username atau password salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
