package com.example.mastermechuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.mastermechuser.databinding.ActivityForgotpasswordBinding
import com.example.mastermechuser.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView



class UserNewRent : AppCompatActivity() {
private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
    }
    private fun replacefragment(fragment:Fragment){
        val fragmentManager= supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.constraintrent,fragment)
        fragmentTransaction.commit()
    }
}