package ejercicio7

import ejercicio7.character.Character

fun main() {

    val personaje1 = Character("Luchador1")
    val personaje2 = Character("Luchador2")

    batallaPersonajes(personaje1, personaje2)
}

fun batallaPersonajes(personaje1: Character, personaje2: Character): Character? {
    var batallaFinalizada = false
    var personaje1Ganador: Boolean
    var personaje2Ganador: Boolean
    var personajeGanador: Character? = null

    println("$personaje1")
    println("$personaje2")

    while (!batallaFinalizada) {
        personaje1Ganador = personaje2.recivirAtaque(personaje1.atacar())
        personaje2Ganador = personaje1.recivirAtaque(personaje2.atacar())

        if (personaje1Ganador && personaje2Ganador) {
            println("Empate, se han matado mutuamente.")
            batallaFinalizada = true
        } else if (personaje1Ganador) {
            println("${personaje1.nombre} ganador.")
            batallaFinalizada = true
            personajeGanador = personaje1
        } else if (personaje2Ganador) {
            println("${personaje2.nombre} ganador.")
            batallaFinalizada = true
            personajeGanador = personaje2
        }
    }

    return personajeGanador
}