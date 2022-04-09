package com.example.promedio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast

class activity_splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed(Runnable {

            Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, MainActivity::class.java))
        }, 3000 )
    }

}