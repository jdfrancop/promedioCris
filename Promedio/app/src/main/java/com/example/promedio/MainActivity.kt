package com.example.promedio

import android.app.PendingIntent.getActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val miBoton: Button = findViewById(R.id.btnRegistro)
        miBoton.setOnClickListener{onClick(1)}

        val miBoton2: Button = findViewById(R.id.btnEstadistica)
        miBoton2.setOnClickListener{onClick(2)}

        val miBoton3: Button = findViewById(R.id.btnAyuda)
        miBoton3.setOnClickListener{onClick(3)}

        val miBoton4: Button = findViewById(R.id.btnSalir)
        miBoton4.setOnClickListener{onClick(4)}


    }

    private fun onClick(boton: Int) {
        when(boton){
            1 -> {
                val intent = Intent(this, activity_promedio::class.java)
                finish()
                startActivity(intent)

            }
            2 -> {
                val intent = Intent(this, activity_Estadistica::class.java)
                finish()
                startActivity(intent)

            }

            3 -> {
                val intent = Intent(this, activity_Ayuda::class.java)
                finish()
                startActivity(intent)

            }


            4 -> {
                finish()

                this.finishAffinity();



            }
        }




    }
}