package com.example.companionobjectsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clMain = findViewById<ConstraintLayout>(R.id.clMain)
        val userEnter = findViewById<EditText>(R.id.editTextTextPersonName)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val editText = userEnter.text.toString()
            if(editText == "day"){
                BackgroundClass().change(clMain,"day")
            }else if(editText == "night"){
                BackgroundClass().change(clMain, "night")
            }else{ //neither day or night
                Toast.makeText(applicationContext,"Please Enter Day or Night ONLY!!!",Toast.LENGTH_LONG).show()
            }
        }
    }
}