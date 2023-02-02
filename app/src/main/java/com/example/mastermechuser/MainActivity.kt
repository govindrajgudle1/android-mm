package com.example.mastermechuser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button

class MainActivityn : AppCompatActivity()



{
    lateinit var signupbtn:Button
    lateinit var signinbtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        signupbtn=findViewById(R.id.signup)
         signupbtn.setOnClickListener {
             val intent: Intent = Intent(applicationContext, Register::class.java)
             startActivity(intent)
         }
        signinbtn=findViewById(R.id.signinn)
        signinbtn.setOnClickListener{
            val intent: Intent= Intent(applicationContext,Login::class.java)
            startActivity(intent)
        }
}
}


