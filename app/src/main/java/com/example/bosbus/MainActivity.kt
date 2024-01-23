package com.example.bosbus

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClick(v: View?) {
        val intent = Intent(
            applicationContext,
            MapActivity::class.java
        )
        startActivity(intent)
    }
}