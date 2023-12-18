package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class connection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connection)

        val validBtn = findViewById<Button>(R.id.button3)


        validBtn.setOnClickListener {
            val Intent = Intent( this, login::class.java)
            startActivity(Intent)
        }
        val validBtn2 = findViewById<Button>(R.id.button4)


        validBtn2.setOnClickListener {
            val Intent = Intent( this, login::class.java)
            startActivity(Intent)
        }
    }
}