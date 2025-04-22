package org.example

class App {
    val greeting: String
        get() {
            return "Paso 2!"
        }
}
fun main() {
    println("¡Hola, Kotlin!")
}

fun mostrarTiposDeDatos() {
    val nombre: String = "Gaspar Giemenez"
    val edad: Int = 16
    val altura: Double = 1.80
    val esEstudiante: Boolean = true

    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Altura: $altura")
    println("Es estudiante: $esEstudiante")
    mostrarTiposDeDatos()
}

fun calcularYMostrarAreaRectangulo() {
    val base = 5
    val altura = 3
    val area = base * altura
    println("El área del rectángulo con base $base y altura $altura es: $area")
    calcularYMostrarAreaRectangulo()
}