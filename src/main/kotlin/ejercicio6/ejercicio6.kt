package ejercicio6

import kotlin.random.Random

fun main() {
    var danio: Int
    println("Se realizan 6 ataques: ")
    repeat(6) {
        danio = calcularDanio()
        when {
            danio > 50 -> println("¡Golpe Crítico! Daño total: ${danio * 2}")
            else -> println("Daño: $danio")
        }
    }
}

fun calcularDanio(): Int {
    return Random.nextInt(10, 60)
}