import kotlin.concurrent.thread
import kotlin.random.Random

fun main() {

    rules()

    start()

    Thread.sleep(2000)

    println("Es findet ein Duell zwischen $spieler1Name und $spieler2Name statt. \n" +
            "\n" +
            "Möge der Bessere gewinnen!")

    println("Runde Eins")
    round()

    println("Runde Zwei")
    round()

    println("Runde Drei")
    round()

    println("Spiel zu Ende!")
    if (spieler1Leben > spieler2Leben)
        println("$spieler1Name hat gewonnen")
    else
        println("$spieler2Name hat gewonnen")
}

