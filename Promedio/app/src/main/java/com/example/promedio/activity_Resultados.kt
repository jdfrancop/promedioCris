package com.example.promedio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class activity_Resultados : AppCompatActivity() {

    var miBoton: Button? = null
    var txtDatos: TextView? = null
    var txtResultados: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados)
        iniciarComponentes()
        rellenarDatos()
    }

    private fun iniciarComponentes() {
        findViewById<Button>(R.id.btnRegresar).setOnClickListener { onClick(1) }
        txtDatos = findViewById(R.id.txtingresado)
        txtResultados = findViewById(R.id.txtResultados)
    }

    private fun rellenarDatos(){
        val data: Bundle? = this.intent.extras
        if (data != null){
            txtDatos!!.text = "Nombre: ${data.getString("nombre")}\n" +
                    "Documento: ${data.getString("documento")}\n" +
                    "Edad: ${data.getString("edad")}\n" +
                    "Telefono: ${data.getString("telefono")}\n" +
                    "Direccion: ${data.getString("direccion")}\n" +
                    "Materia 1: ${data.getString("materia1")}\n" +
                    "Nota 1 => ${data.getDouble("n1")}\n" +
                    "Materia 2: ${data.getString("materia2")}\n" +
                    "Nota 2 => ${data.getDouble("n2")}\n" +
                    "Materia 3: ${data.getString("materia3")}\n" +
                    "Nota 3 => ${data.getDouble("n3")}\n" +
                    "Materia 4: ${data.getString("materia4")}\n" +
                    "Nota 4 => ${data.getDouble("n4")}\n" +
                    "Materia 5: ${data.getString("materia5")}\n" +
                    "Nota 5 => ${data.getDouble("n5")}"



            txtResultados!!.text = "Promedio: ${data.getDouble("promedio")}\n" +
                    "Rendimiento: ${data.getString("resultado")}"
        }
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
