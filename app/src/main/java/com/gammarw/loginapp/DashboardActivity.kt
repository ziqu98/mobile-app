package com.gammarw.loginapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DashboardActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val name = intent.getStringExtra("name")?.uppercase()

        val welcomeSplash = findViewById<TextView>(R.id.welcome)

        welcomeSplash.text = "WELCOME, ${name}!"
    }
}