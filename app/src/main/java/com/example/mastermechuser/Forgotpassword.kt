package com.example.mastermechuser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Forgotpassword : AppCompatActivity() {

    lateinit var otp:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgotpassword)
        otp=findViewById(R.id.sendotp1)
        otp.setOnClickListener{
           val intent:Intent= Intent(applicationContext,Otp::class.java)
            startActivity(intent)
        }
    }
}