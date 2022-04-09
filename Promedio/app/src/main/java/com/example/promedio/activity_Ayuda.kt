package com.example.promedio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activity_Ayuda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ayuda)

        val miBoton: Button = findViewById(R.id.btnRegresar)
        miBoton.setOnClickListener { onClick(1) }
    }

    private fun onClick(boton: Int) {
        when (boton) {
            1 -> {
                val intent = Intent(this, MainActivity::class.java)
                finish()
                startActivity(intent)

            }
        }

    }

}
