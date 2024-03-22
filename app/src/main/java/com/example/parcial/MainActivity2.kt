package com.example.parcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val tarifaTotal = intent.getDoubleExtra("TARIFA_TOTAL", 0.0)
        val lbls = findViewById<TextView>(R.id.lbls)
        lbls.text = "Tarifa Total: $tarifaTotal"
    }
}