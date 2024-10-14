package ejercicio8

import ejercicio7.character.Character

fun main() {
    val personaje = Character("personaje1")
    val objeto1 = Objeto("Poción de Vida")
    val objeto2 = Objeto("Trozo de Tela")

    personaje.agregarObjeto(objeto1)
    personaje.agregarObjeto(objeto2)

    println("Mostramos los objetos del personaje.")

    personaje.mostrarObjetos()

    personaje.eliminarObjeto(objeto2)

    println("Mostramos los objetos del personaje después de eliminar uno.")

    personaje.mostrarObjetos()

}