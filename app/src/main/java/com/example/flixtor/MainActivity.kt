package com.example.flixtor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val usernameInput = findViewById<EditText>(R.id.username)
        val passwordInput = findViewById<EditText>(R.id.password)
        val loginButton = findViewById<Button>(R.id.loginButton)
        
        loginButton.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()
            
            if (username.isNotEmpty() && password.length >= 6) {
                val intent = Intent(this, WebViewActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Enter valid credentials", Toast.LENGTH_SHORT).show()
            }
        }
    }
}