package com.example.clase_1

abstract class Persona (
    private val nombre: String,
    private val edad: Int
)
{
    abstract fun getNombre(): String

    abstract fun getEdad(): String

}