package com.example.clase_1

class Adulto(
    private val nombre: String,
    private val edad: Int,
    private val profesion: String,
    private val estado_civil: EstadoCivil
):Persona(nombre, edad),AccionesAdulto,Acciones
{
    override fun getNombre(): String {
        return "Mi nombre es: ${this.nombre}"
    }
    override fun getEdad(): String {
        return "Mi edad es: ${this.edad}"
    }
    fun getProfesion(): String
    {
        return "Mi nombre es: ${this.profesion}"
    }
    override fun trabajar(): String {
        return "Estoy trabajando"
    }
    override fun estudiar(): String {
        return "Estoy estudiando"
    }

    override fun comer(): String {
        TODO("Not yet implemented")
    }

}
enum class EstadoCivil{
    CASADO,
    SOLTERO,
    DIVORCIADO,
    CONVIVENCIA,
    VIUDO
}