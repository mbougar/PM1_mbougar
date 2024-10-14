package ejercicio10

import ejercicio7.character.Character

fun main() {

    val heroe = Character("Heroe",100, 100)
    val aliado1 = Character("Aliado1")
    val aliado2 = Character("Aliado2")
    val aliado3 = Character("Aliado3")
    val aliado4 = Character("Aliado4")
    val enemigo = Character("Enemigo", 500)

    val aliados = listOf(heroe, aliado1, aliado2, aliado3, aliado4)

    batallaGrupal(aliados, enemigo)
}

fun batallaGrupal(personajesAliados: List<Character>, enemigo: Character) {
    var batallaFinalizada = false

    println("$enemigo")

    while (!batallaFinalizada) {

        personajesAliados.forEach { aliado ->
            batallaFinalizada = enemigo.recivirAtaque(aliado.atacar())
            println("$aliado ataca.")
            println(enemigo)
            if (batallaFinalizada) {
                println("El enemigo ha sido derrotado")
            }
        }
    }
}