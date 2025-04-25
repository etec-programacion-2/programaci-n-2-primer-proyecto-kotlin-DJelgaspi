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
    mostrarNumerosConLoops()
    mostrarNumerosParesConLoops()
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

fun mostrarNumerosConLoops() {
    println("Usando for:")
    for (i in 1..10) {
        println(i)
    }
    
    println("\nUsando while:")
    var j = 1
    while (j <= 10) {
        println(j)
        j++
    }
    
    println("\nUsando do-while:")
    var k = 1
    do {
        println(k)
        k++
    } while (k <= 10)
}

fun mostrarNumerosParesConLoops() {
    println("Usando for (números pares del 2 al 20):")
    for (i in 2..20 step 2) {
        println(i)
    }

    println("\nUsando while (números pares del 2 al 20):")
    var j = 2
    while (j <= 20) {
        println(j)
        j += 2
    }

    println("\nUsando do-while (números pares del 2 al 20):")
    var k = 2
    do {
        println(k)
        k += 2
    } while (k <= 20)
}





