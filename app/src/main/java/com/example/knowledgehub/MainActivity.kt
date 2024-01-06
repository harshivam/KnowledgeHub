package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonLg = findViewById<Button>(R.id.btnLg)


        buttonLg.setOnClickListener {
            var BtnIntent = findViewById<Button>(R.id.btnLg)
            BtnIntent.setOnClickListener{
                //opens a new activity

                intent = Intent(applicationContext,Activity2::class.java)
                startActivity(intent)
        }

    }
}}