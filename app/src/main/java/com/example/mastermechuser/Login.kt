package com.example.mastermechuser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Login : AppCompatActivity() {

    lateinit var fgpassword:TextView
    lateinit var entrydash: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        fgpassword=findViewById(R.id.forgottext)
        fgpassword.setOnClickListener{
            val intent:Intent=Intent(applicationContext,Forgotpassword::class.java)
            startActivity(intent)
        }
        entrydash=findViewById(R.id.dashentry)
        entrydash.setOnClickListener{
            val intent:Intent=Intent(applicationContext,userdashboard::class.java)
            startActivity(intent)
            }
        }


    }
