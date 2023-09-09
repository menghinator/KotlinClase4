package com.example.clase_1

class Menor(
    private val nombre: String,
    private val edad: Int,
    private val colegio: String,
    private val actividad: Actividad

):Persona(nombre, edad),Acciones,AccionesMenor
{
    override fun getNombre(): String {
        return "Mi nombre es: ${this.nombre}"
    }
    override fun getEdad(): String {
        return "Mi edad es reservada."
    }
    override fun estudiar(): String {
        return "Estoy estudiando en el cole"
    }
    override fun comer(): String {
        TODO("Not yet implemented")
    }
    override fun jugar(): String {
        return "Estoy jugando a ${this.actividad}"
    }
}
enum class Actividad{
    FUTBOL,
    DANZA,
    PINTURA,
    HANDBALL,
    GUITARRA
}