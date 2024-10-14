package ejercicio3

fun main() {
    val ataque1 = 4
    val ataque2 = 6
    val ataque3 = 10

    println("El ataque 1 realizará ${multiplicarAtaques(ataque1)} de daño")
    println("El ataque 2 realizará ${multiplicarAtaques(ataque2)} de daño")
    println("El ataque 3 realizará ${multiplicarAtaques(ataque3)} de daño")
}

fun multiplicarAtaques(numero: Int): Int {
    return numero * 5
}