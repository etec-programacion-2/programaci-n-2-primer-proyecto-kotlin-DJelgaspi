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
        val numero = 5
    println("El factorial de $numero es: ${factorial(numero)}")

    saludar("gaspar", 16)
    saludar("facu")

    val base = 2
    val exponente = 3
    println("$base elevado a la potencia de $exponente es: ${potencia(base, exponente)}")
    demostrarAlcanceVariables()

    val numeros = listOf(3, 5, 1, 9, 2, 8)
    val promedio = calcularPromedio(numeros)
    println("El promedio de los números es: $promedio")
    
    val resultado = encontrarMinimoYMaximo(numeros)
    if (resultado != null) {
        println("El número más pequeño es: ${resultado.first}")
        println("El número más grande es: ${resultado.second}")
    } else {
        println("La lista está vacía")
    }
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

//paso 5

fun factorial(n: Int): Int {
    return if (n <= 1) 1 else n * factorial(n - 1)
}

fun saludar(nombre: String, edad: Int = 0) {
    println("Hola $nombre, tienes $edad años")
}

fun potencia(base: Int, exponente: Int): Int {
    return Math.pow(base.toDouble(), exponente.toDouble()).toInt()
}

fun demostrarAlcanceVariables() {
    val variableGlobal = "global de la funci"
    
    if (true) {
        val variableIf = "Soy local del if"
        println("Dentro del if: $variableIf")
        println("Puedo acceder a: $variableGlobal")
    }
    
    for (i in 1..3) {
        val variableFor = "Soy local del for - iteración $i"
        println("Dentro del for: $variableFor")
        println("Puedo acceder a: $variableGlobal")
    }
}

fun calcularPromedio(numeros: List<Int>): Double {
    var suma = 0
    var contador = 0
    
    for (numero in numeros) {
        suma += numero
        contador++
    }
    
    return if (contador > 0) suma.toDouble() / contador else 0.0
}

fun encontrarMinimoYMaximo(numeros: List<Int>): Pair<Int, Int>? {
    if (numeros.isEmpty()) return null
    
    var max = numeros[0]
    var min = numeros[0]
    
    for (numero in numeros) {
        if (numero > max) {
            max = numero
        }
        if (numero < min) {
            min = numero
        }
    }
    
    return Pair(min, max)
}




