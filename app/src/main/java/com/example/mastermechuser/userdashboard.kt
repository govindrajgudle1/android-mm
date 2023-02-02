package com.example.mastermechuser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout


class userdashboard : AppCompatActivity() {
    lateinit var drawerLayout: DrawerLayout
    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle

    lateinit var addnewrent1: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_userdashboard)
        drawerLayout=findViewById(R.id.drawer1)
        actionBarDrawerToggle= ActionBarDrawerToggle(this,drawerLayout,R.string.nav_open,R.string.nav_close)
        actionBarDrawerToggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        drawerLayout.addDrawerListener(actionBarDrawerToggle)

        addnewrent1=findViewById(R.id.addnrew)
        addnewrent1.setOnClickListener {
            val intent: Intent=Intent(applicationContext,UserNewRent::class.java)
            startActivity(intent)
        }


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (actionBarDrawerToggle.onOptionsItemSelected(item)){
            true
        } else super.onOptionsItemSelected(item)
    }
}