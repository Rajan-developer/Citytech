package com.google.testLogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText
    lateinit var textView: TextView
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        textView = findViewById(R.id.textView)
        btn = findViewById(R.id.btn)

        btn.setOnClickListener(View.OnClickListener {
            var text = editText.text.toString().toInt()
            setText(text)
        })
    }

    fun setText(text: Int) {
        textView.text = text.toString()
    }
}