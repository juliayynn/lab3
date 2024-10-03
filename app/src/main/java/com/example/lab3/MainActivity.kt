package com.example.lab3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import android.widget.EditText
import android.widget.Button
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var stroka1: EditText
    private lateinit var stroka2: EditText
    private lateinit var result: EditText
    private lateinit var execute: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        stroka1 = findViewById(R.id.editTextTextMultiLine)
        stroka2 = findViewById(R.id.editTextTextMultiLine2)
        result = findViewById(R.id.editTextTextMultiLine3)

        execute = findViewById(R.id.button)




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}