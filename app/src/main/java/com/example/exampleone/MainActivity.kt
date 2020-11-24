package com.example.exampleone

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)


        val changeButton = findViewById<Button>(R.id.change_button)
        val redirectButton = findViewById<Button>(R.id.redirect_button)

        val nextButton = findViewById<Button>(R.id.next_button)
        changeButton.setOnClickListener {

            val nameText= findViewById<TextView>(R.id.name_text)

            val editText= findViewById<TextView>(R.id.name_edit)

            nameText.text = editText.text

            // Hide the keyboard.
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(it.windowToken, 0)

        }

        redirectButton.setOnClickListener {

            val intent = Intent("com.example.exampleone.Second")

            startActivity(intent)
        }


        nextButton.setOnClickListener {

            val intent = Intent("com.example.exampleone.Third")

            startActivity(intent)
        }

    }
}