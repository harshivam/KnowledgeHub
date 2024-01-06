package com.example.knowledgehub

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.cardview.widget.CardView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val btnCall = findViewById<Button>(R.id.btncall)
        val cardview1 = findViewById<CardView>(R.id.cardView1)
        val cardview2 = findViewById<CardView>(R.id.cardView2)
        val cardview3 = findViewById<CardView>(R.id.cardView3)
        val cardview4 = findViewById<CardView>(R.id.cardView4)
        val cardview5 = findViewById<CardView>(R.id.cardView5)
        val cardview6 = findViewById<CardView>(R.id.cardView6)




        cardview1.setOnClickListener{
            val andrdurl = "https://developer.android.com/"
            val andrIntent = Intent(Intent.ACTION_VIEW, Uri.parse(andrdurl))
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(andrIntent)
            }
            else{
                Toast.makeText(this,"something went wrong",Toast.LENGTH_SHORT).show()
            }
        }


        cardview2.setOnClickListener{
            val weburl  = "https://www.geeksforgeeks.org/web-development/"
            val webIntent = Intent(Intent.ACTION_VIEW, Uri.parse(weburl))
            if(intent.resolveActivity(packageManager)!=null){
                startActivity(webIntent)
            }
            else{
                Toast.makeText(this,"something went wrong",Toast.LENGTH_SHORT).show()
            }

        }
        cardview3.setOnClickListener{
            val iosurl = "https://developer.apple.com/develop/"
            val iosIntent = Intent(Intent.ACTION_VIEW, Uri.parse(iosurl))
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(iosIntent)
            }
            else{
                Toast.makeText(this,"something went wrong",Toast.LENGTH_SHORT).show()
            }
        }
        cardview4.setOnClickListener{
            val MLurl = "https://www.youtube.com/watch?v=i_LwzRVP7bg"
            val MLIntent = Intent(Intent.ACTION_VIEW, Uri.parse(MLurl))
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(MLIntent)
            }
            else{
                Toast.makeText(this,"something went wrong",Toast.LENGTH_SHORT).show()
            }
        }
        cardview5.setOnClickListener{
            val BlockChainurl = "https://www.geeksforgeeks.org/blockchain-technology-introduction/"
            val BlockChainIntent = Intent(Intent.ACTION_VIEW, Uri.parse(BlockChainurl))
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(BlockChainIntent)
            }
            else{
                Toast.makeText(this,"something went wrong",Toast.LENGTH_SHORT).show()
            }
        }

        cardview6.setOnClickListener{
            val UIUXurl = "https://developer.android.com/"
            val UIUXIntent = Intent(Intent.ACTION_VIEW, Uri.parse(UIUXurl))
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(UIUXIntent)
            }
            else{
                Toast.makeText(this,"something went wrong",Toast.LENGTH_SHORT).show()
            }
        }





        btnCall.setOnClickListener {
            val phNumber = "tel:" + "+918953100905"
            val dialIntent = Intent(Intent.ACTION_CALL, Uri.parse(phNumber))
            if (checkSelfPermission(android.Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                if (dialIntent.resolveActivity(packageManager) != null) {
                    startActivity(dialIntent)
                } else {
                    Toast.makeText(this, "Couldn't initiate call", Toast.LENGTH_SHORT).show()
                }
            } else {
                // Request CALL_PHONE permission here if not granted
                requestPermissions(arrayOf(android.Manifest.permission.CALL_PHONE), 1)
            }
        }

    }
}