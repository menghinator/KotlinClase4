package com.example.clase_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adulto = Adulto(nombre = "Tomas",edad = 26, profesion = "Soporte", estado_civil = EstadoCivil.SOLTERO)
        Toast.makeText(this, adulto.getNombre(),Toast.LENGTH_LONG).show()

    }
}
