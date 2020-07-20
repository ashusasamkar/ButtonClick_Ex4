package com.example.buttonclick_ex4

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val layout = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.layout)
        val button_click = findViewById<Button>(R.id.btn_click)
        button_click.setOnClickListener {
            layout.setBackgroundResource(R.color.yellow)
        }
    }
}