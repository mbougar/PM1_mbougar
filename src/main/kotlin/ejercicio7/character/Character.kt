package ejercicio7.character

import ejercicio8.Objeto
import kotlin.random.Random

class Character(val nombre:String, private var vida: Int = Random.nextInt(10, 25), private val ataque: Int = Random.nextInt(1, 5)) {

    var nivel = 1
    var experiencia = 0
    val inventario = mutableListOf<Objeto>()

    fun atacar(): Int {
        return ataque
    }

    fun recivirAtaque(ataque: Int): Boolean {
        vida -= ataque
        return vida <= 0
    }

    fun agregarObjeto(objeto: Objeto) {
        inventario.add(objeto)
    }

    fun eliminarObjeto(objeto: Objeto) {
        inventario.remove(objeto)
    }

    fun mostrarObjetos() {
        println("Objetos: ")
        inventario.forEach {
            println(" - $it")
        }
    }

    fun obtenerExperiencia(experienciaObtenida: Int) {
        experiencia += experienciaObtenida

        if (experiencia >= 200) {
            nivel++
            experiencia -= 200
            // Llamamos recursivamente a la funcion en caso de que reciba mucha experiencia y necesite subir varios niveles
            obtenerExperiencia(0)
        }
    }

    override fun toString(): String {
        return "$nombre: Vida [$vida], Ataque [$ataque]"
    }
}