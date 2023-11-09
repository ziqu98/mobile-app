package com.gammarw.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ForgotPwdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_pwd)
    }

    fun backBtn(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}