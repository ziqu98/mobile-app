package com.gammarw.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun signUpBtnClick(view: View) {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }

    fun loginBtnClick(view: View) {
        val intent = Intent(this, DashboardActivity::class.java)
        val edtUname = findViewById<EditText>(R.id.edtUname)
        val edtPass = findViewById<EditText>(R.id.edtPass)

        intent.putExtra("name", edtUname.text.toString())

        val toast = Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT)

        //LOGIN INFORMATION
        if (edtUname.text.toString() == "gammarw" && edtPass.text.toString() == "12345") {
            toast.show()
            startActivity(intent)
        } else if (edtUname.text.toString() == "admin" && edtPass.text.toString() == "admin") {
            toast.show()
            startActivity(intent)
        } else {

        }
    }

    fun forgotPwdBtn(view: View) {
        val intent = Intent(this, ForgotPwdActivity::class.java)
        startActivity(intent)
    }
}