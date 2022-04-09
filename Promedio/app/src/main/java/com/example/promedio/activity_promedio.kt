package com.example.promedio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class activity_promedio : AppCompatActivity() {

    var nombre: EditText? = null
    var documento: EditText? = null
    var edad: EditText? = null
    var telefono: EditText? = null
    var direccion: EditText? = null

    var materia1: EditText? = null
    var materia2: EditText? = null
    var materia3: EditText? = null
    var materia4: EditText? = null
    var materia5: EditText? = null

    var n1: EditText? = null
    var n2: EditText? = null
    var n3: EditText? = null
    var n4: EditText? = null
    var n5: EditText? = null
    var promedio: Double? = null
    var resultado: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_promedio)
        inicializarComponentes()
    }

    private fun inicializarComponentes() {
        // Añadimos los eventos del boton
        findViewById<Button?>(R.id.btnRegresar).setOnClickListener{ onClick(1) }
        findViewById<Button?>(R.id.btnCalcular).setOnClickListener{ onClick(2) }

        // Inicializamos vistas
        nombre = findViewById(R.id.editTextNombre)
        documento  = findViewById(R.id.editTextDocumento)
        edad = findViewById(R.id.editTextEdad)
        telefono = findViewById(R.id.editTextTelefono)
        direccion = findViewById(R.id.editTextDireccion)
        materia1 = findViewById(R.id.editTextMateria1)
        materia2 = findViewById(R.id.editTextMateria2)
        materia3 = findViewById(R.id.editTextMateria3)
        materia4 = findViewById(R.id.editTextMateria4)
        materia5 = findViewById(R.id.editTextMateria5)
        n1 = findViewById(R.id.editTextNota1)
        n2 = findViewById(R.id.editTextNota2)
        n3 = findViewById(R.id.editTextNota3)
        n4 = findViewById(R.id.editTextNota4)
        n5 = findViewById(R.id.editTextNota5)
    }

    private fun registrarEstudiante(){
        promedio = Procesos.promedio(
            n1!!.text.toString().toDouble(),
            n2!!.text.toString().toDouble(),
            n3!!.text.toString().toDouble(),
            n4!!.text.toString().toDouble(),
            n5!!.text.toString().toDouble()
        )
        resultado = Procesos.rendimiento(promedio!!)

        Procesos.anadirEstudiante(
            Estudiante(
                nombre!!.text.toString(),
                documento!!.text.toString(),
                edad!!.text.toString(),
                telefono!!.text.toString(),
                direccion!!.text.toString(),
                materia1!!.text.toString(),
                materia2!!.text.toString(),
                materia3!!.text.toString(),
                materia4!!.text.toString(),
                materia5!!.text.toString(),
                n1!!.text.toString().toDouble(),
                n2!!.text.toString().toDouble(),
                n3!!.text.toString().toDouble(),
                n4!!.text.toString().toDouble(),
                n5!!.text.toString().toDouble(),
                promedio!!,
                resultado!!
            )
        )
        val intent = Intent(applicationContext, activity_Resultados::class.java)
        val data = Bundle()
        data.putString("nombre", nombre!!.text.toString())
        data.putString("documento", documento!!.text.toString())
        data.putString("edad", edad!!.text.toString())
        data.putString("telefono", telefono!!.text.toString())
        data.putString("direccion", direccion!!.text.toString())
        data.putString("materia1", materia1!!.text.toString())
        data.putString("materia2", materia2!!.text.toString())
        data.putString("materia3", materia3!!.text.toString())
        data.putString("materia4", materia4!!.text.toString())
        data.putString("materia5", materia5!!.text.toString())
        data.putDouble("n1", n1!!.text.toString().toDouble())
        data.putDouble("n2", n2!!.text.toString().toDouble())
        data.putDouble("n3", n3!!.text.toString().toDouble())
        data.putDouble("n4", n4!!.text.toString().toDouble())
        data.putDouble("n5", n5!!.text.toString().toDouble())
        data.putDouble("promedio", promedio!!)
        data.putString("resultado", resultado)
        intent.putExtras(data)
        startActivity(intent)
    }

    private fun onClick(boton: Int) {


        when (boton) {
            1 -> {
                val intent = Intent(this, MainActivity::class.java)
                finish()
                startActivity(intent)
            }

            2 -> {

                registrarEstudiante()



            }
        }
    }
}