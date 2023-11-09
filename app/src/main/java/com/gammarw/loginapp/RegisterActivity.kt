package com.gammarw.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun backBtn(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}