package com.example.myapplication


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val validBtn = findViewById<Button>(R.id.button2)


        validBtn.setOnClickListener {
            val Intent = Intent( this, fin::class.java)
            startActivity(Intent)
        }
    }
}


