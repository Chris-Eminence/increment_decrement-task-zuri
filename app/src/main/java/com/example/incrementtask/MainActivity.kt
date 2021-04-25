package com.example.incrementtask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var _number = 0;

        val incrementButton : TextView = findViewById(R.id.increment_text_button)
        val decrementButton : TextView = findViewById(R.id.decrement_text_button)
        val _textView : TextView = findViewById(R.id._Text)

        incrementButton.setOnClickListener {
           _number++

            _textView.text = _number.toString()
        }

        decrementButton.setOnClickListener {
            _number--

            _textView.text = _number.toString()
        }

    }
}