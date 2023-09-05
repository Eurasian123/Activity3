package com.example.activity3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isInvisible

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val theButton = findViewById<Button>(R.id.button)
        val welcomeText = findViewById<TextView>(R.id.textView)
        val theGoods = findViewById<EditText>(R.id.editTextText)

        theButton.setOnClickListener {
            welcomeText.text = "Glad to have you on the team, " + theGoods.text + "."
            theGoods.isInvisible = true
        }

    }
}