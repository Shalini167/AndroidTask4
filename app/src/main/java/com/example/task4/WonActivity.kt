package com.example.task4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class WonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_won)
        val secretValue=intent.getStringExtra("nameOfSecretvalue")
       findViewById<TextView>(R.id.wontext).text="You won! The number is"
        findViewById<TextView>(R.id.wonvalue).text="$secretValue"
    }
}