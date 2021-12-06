package com.example.task4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var clickCount=0
    var secretValue=Random.nextInt(0,1000)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textinput = findViewById<TextInputLayout>(R.id.inputtext)
        val buttonclick = findViewById<TextView>(R.id.clickButton)
        val displaytextview = findViewById<TextView>(R.id.displaytext)


        buttonclick.setOnClickListener {
            val enteredtext = textinput.editText?.text?.toString()?.toInt()
            if (enteredtext!! > secretValue && clickCount<=12 ){
                displaytextview.text= "No:) My number is smaller"
                clickCount++

            }
            else if (enteredtext < secretValue && clickCount<=12){
                displaytextview.text="No:) My number is bigger"
                clickCount++
            }
            else if (enteredtext == 0 && clickCount<=12) {
                displaytextview.text="Enter a valid number"
                clickCount++
            }
            else if(enteredtext == secretValue && clickCount<=12){
                val newScreenIntent = Intent(this, WonActivity::class.java)
                newScreenIntent.putExtra("nameOfSecretvalue","$secretValue")
                startActivity(newScreenIntent)
                secretValue=Random.nextInt(0,1000)
                clickCount=0
            }

            else if(clickCount>12){
                val newScreenIntent = Intent(this, EndGameActivity::class.java)
                newScreenIntent.putExtra("nameOfSecretvalue", "$secretValue")
                startActivity(newScreenIntent)
                secretValue=Random.nextInt(0,1000)
                clickCount=0
            }
        }
    }

}