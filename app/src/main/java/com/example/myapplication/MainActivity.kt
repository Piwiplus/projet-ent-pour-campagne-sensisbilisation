package com.example.myapplication


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.educo_page)


        val validBtn = findViewById<Button>(R.id.button2)


        validBtn.setOnClickListener {
            val Intent = Intent( this, connection::class.java)
            startActivity(Intent)
        }
    }
}



