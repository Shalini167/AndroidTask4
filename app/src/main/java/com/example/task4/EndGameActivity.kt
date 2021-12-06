package com.example.task4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class EndGameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end_game)
        val secretValue=intent.getStringExtra("nameOfSecretvalue")
        findViewById<TextView>(R.id.newdisplay).text="You lost after 12 attempts."
        findViewById<TextView>(R.id.losttext).text="The number is"
        findViewById<TextView>(R.id.lostvalue).text="$secretValue"


    }
}