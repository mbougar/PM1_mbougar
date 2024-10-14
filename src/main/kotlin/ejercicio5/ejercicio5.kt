package ejercicio5

import ejercicio7.character.Character

fun main() {
    val personaje1 = Character("personaje1")
    val personaje2 = Character("personaje2")
    val personaje3 = Character("personaje3")

    personaje2.nivel = 15
    personaje3.nivel = 50

    val personajes = listOf(personaje1, personaje2, personaje3)

    personajes.forEachIndexed { index, personaje ->
        println("Vamos a evaluar al personaje ${index + 1}")
        println(comprobarNivel(personaje))
    }

}

fun comprobarNivel(personaje: Character): String {
    return when {
        (personaje.nivel < 10) -> "Personaje principiante"
        (personaje.nivel in 10..20) -> "Personaje intermedio"
        else -> "Personaje avanzado"
    }
}