package com.example.task3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var number= Random.nextInt(0,1000)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickButton=findViewById<Button>(R.id.clickButton)
        val inputValue=findViewById<TextInputLayout>(R.id.dynamicText)
        val userGuess=findViewById<TextView>(R.id.textView2)

        clickButton.setOnClickListener {
            val inputGuess = inputValue.editText?.text.toString().toInt()
            if(inputGuess==0)
            {
                userGuess.text="Enter the valid number"
            }
            else if(inputGuess>number)
            {
                userGuess.text="NO :)) My number is smaller"
            }
            else if(inputGuess<number)
            {
                userGuess.text="NO:))My number is larger"
            }
            else
            {
                userGuess.text="you are right"
            }
        }
    }
}