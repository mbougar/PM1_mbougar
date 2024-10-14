package ejercicio4

fun main() {
    var monedas = 0
    println("Tengo $monedas monedas.")
    repeat(10) {
        monedas = recogerMonedas(monedas, 5)
        println("He recogido 5 monedas, ahora tengo $monedas monedas.")
    }
}

fun recogerMonedas(monedasTotal: Int, monedasRecoger: Int): Int {
    return monedasTotal + monedasRecoger
}