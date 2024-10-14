package ejercicio9

import ejercicio7.batallaPersonajes
import ejercicio7.character.Character

fun main() {
    val heroe = Character("Heroe",100, 100)
    val personaje2 = Character("Enemigo1")
    val personaje3 = Character("Enemigo2")
    val personaje4 = Character("Enemigo3")
    val personaje5 = Character("Enemigo4")
    val personaje6 = Character("Enemigo5")

    println("[Heroe] Nivel: ${heroe.nivel} Experiencia: ${heroe.experiencia}")

    val enemigos = listOf(personaje2, personaje3, personaje4, personaje5, personaje6)
    var personajeGanador: Character?

    for (enemigo in enemigos) {
        personajeGanador = batallaPersonajes(heroe, enemigo)
        personajeGanador?.obtenerExperiencia(50)
    }

    println("Después de 5 combates:")
    println("[${heroe.nombre}] Nivel: ${heroe.nivel} Experiencia: ${heroe.experiencia}")
}