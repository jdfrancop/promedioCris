package com.example.promedio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class activity_Estadistica : AppCompatActivity() {

    var miBoton: Button? = null
    var txtEstadisticas: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estadistica)
        iniciarComponentes()
        rellenarDatos()
    }

    private fun iniciarComponentes() {
        findViewById<Button>(R.id.btnRegresar).setOnClickListener { onClick(1) }
        txtEstadisticas = findViewById(R.id.estadistica)
    }

    private fun rellenarDatos(){
        val datos = Procesos.estadisticas()
        txtEstadisticas!!.text = "Procesados: ${datos[0]}\nGanan: ${datos[1]}\nPierden: ${datos[2]}\nRecuperan: ${datos[3]}"
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
