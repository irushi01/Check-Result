package com.example.firstprogram

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText as EditText1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val editTextTextEditText = findViewById<EditText1>(R.id.editTextText)
        val editTextText3EditText = findViewById<EditText1>(R.id.editTextText3)
        val buttonButton = findViewById<Button>(R.id.button )
        val textViewTextView = findViewById<TextView>(R.id.textView)
        buttonButton.setOnClickListener{
            val num1 = editTextTextEditText.text.toString().toDoubleOrNull()
            val num2 = editTextText3EditText.text.toString().toDoubleOrNull()

            if(num1 != null && num2 != null){
                val highest = if (num1 > num2) num1 else num2
                textViewTextView.text = "The highest number is: $highest"
            }
            else{
                textViewTextView.text = "Please enter valid number."
            }
    }
}
}