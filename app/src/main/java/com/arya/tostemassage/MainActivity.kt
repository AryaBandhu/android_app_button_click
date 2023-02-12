package com.arya.tostemassage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val Btndown = findViewById<Button>(R.id.btndown)
        val Btnup = findViewById<Button>(R.id.btnup)

        Btndown.setOnClickListener{
            Toast.makeText(applicationContext,"Downloading....",Toast.LENGTH_SHORT).show()
        }

        Btnup.setOnClickListener{
            Toast.makeText(applicationContext,"Uploading...",Toast.LENGTH_SHORT).show()
        }

        val BtnDark = findViewById<Button>(R.id.darkbtn)
        val Btnlight = findViewById<Button>(R.id.lightbtn)
        val Layout = findViewById<LinearLayout>(R.id.theme_layout)

        BtnDark.setOnClickListener{
            Layout.setBackgroundResource(R.color.black)
            Toast.makeText(applicationContext, "Dark Theme Activated..", Toast.LENGTH_SHORT).show()
        }

        Btnlight.setOnClickListener{
            Layout.setBackgroundResource(R.color.white)
            Toast.makeText(applicationContext,"Light Theme Activated...", Toast.LENGTH_SHORT).show()
        }
    }


}