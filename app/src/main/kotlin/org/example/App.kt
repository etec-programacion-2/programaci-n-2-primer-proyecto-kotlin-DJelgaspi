package org.example

class App {
    val greeting: String
        get() {
            return "Paso 2!"
        }
}
fun main() {
    println("¡Hola, Kotlin!")
    mostrarTiposDeDatos()
    calcularYMostrarAreaRectangulo()
    printeos()
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
}

fun calcularYMostrarAreaRectangulo() {
    val base = 5
    val altura = 3
    val area = base * altura
    println("El área del rectángulo con base $base y altura $altura es: $area")
}

//paso 3

fun esParOImpar(numero: Int): String {
    return if (numero % 2 == 0) {
        "Par"
    } else {
        "Impar"
    }
}
fun determinarSigno(numero: Int): String {
    return when {
        numero > 0 -> "Positivo"
        numero < 0 -> "Negativo"
        else -> "Cero"
    }
}
fun printeos() {
    val numero1: Int = 4
    val numero2: Int = -3

    println("El número $numero1 es: ${esParOImpar(numero1)}")
    println("El número $numero2 es: ${esParOImpar(numero2)}")

    println("El número $numero1 es: ${determinarSigno(numero1)}")
    println("El número $numero2 es: ${determinarSigno(numero2)}")
}

//paso 4




