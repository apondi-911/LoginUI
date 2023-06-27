package com.example.nyotanjemaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class RegisterPage : AppCompatActivity() {

    private lateinit var signInText: TextView
    private lateinit var confirm_password: TextInputEditText
    private lateinit var password: TextInputEditText
    private lateinit var btnRegister: Button
    private lateinit var email: TextView
    private lateinit var tvPhone: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page)

        signInText =findViewById(R.id.signinText)
        confirm_password= findViewById(R.id.confirm_password)
        password= findViewById(R.id.password)
        email = findViewById(R.id.email)
        tvPhone = findViewById(R.id.number)

        signInText.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}