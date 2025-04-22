package org.example

class App {
    val greeting: String
        get() {
            return "Paso 1!"
        }
}
fun main() {
    println("¡Hola, Kotlin!")
    imprimirNombreYFecha()
}

fun imprimirNombreYFecha() {
    val nombre = "Juan"
    val fechaActual = "22 de abril"  
    println("Mi nombre es: $nombre")
    println("La fecha actual es: $fechaActual")
}
