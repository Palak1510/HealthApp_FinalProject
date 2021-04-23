package com.example.healthwiseapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var patient:Button
    private lateinit var doctor:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        patient= findViewById(R.id.patient)
        doctor=findViewById(R.id.doctor)

        patient.setOnClickListener {
            val i = Intent(
                this@MainActivity,
                Doctor::class.java
            )
            startActivity(i)
        }
    }

}