package com.example.nyotanjemaapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity() {

    private var username: EditText? = null
    private var password: TextInputEditText? = null
    private var loginButton: Button? = null
    private var signupText: TextView? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username= findViewById(R.id.username)
        password= findViewById(R.id.password)
        loginButton =findViewById(R.id.loginButton)
        signupText= findViewById(R.id.signupText)

        signupText?.setOnClickListener {
            val intent = Intent(this, RegisterPage::class.java)
            startActivity(intent)
        }

        loginButton?.setOnClickListener {
            if (username?.text.toString() == "user" && password?.text.toString() == "1234") {
                Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()
            }
        }

    }


}