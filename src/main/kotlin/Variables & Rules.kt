import kotlin.concurrent.thread
import kotlin.random.Random

var spieler1Name = ""
var spieler2Name = ""

var spieler1Leben = 0
var spieler2Leben = 0

// Die Menge Schaden und Heilung jeder Spieler in einem Mal ausführen kann
val attacken = listOf(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
val heilungen = listOf(5, 10, 15, 20, 25, 30, 35, 40, 45, 50)

// Wird durch User-Input ausgewählt
val spezialAttackenOne: Map<String,Int> = mapOf("Stupsen" to 1,"Ohrlasche" to 5,"Haare ziehen" to 10, "Harte linke" to 25, "Roundhouse-Kick" to 50, "Leberhaken" to 100 )
val spezialAttackenTwo: Map<String,Int> = mapOf("Beleidigen" to 1,"Beinchen stellen" to 5,"Freundschaft kündigen" to 10, "Brüder rufen" to 25, "Mama rufen" to 50, "Chuck Norris rufen" to 100 )

// Diese Variablen werden verwendet, um kurzzeitig Zahlen zu halten
var heilen: Int = 0
var schaden: Int = 0

fun start(){
    // Wenn das Spiel startet, muss der Nutzer einen Namen für Spieler 1 und Spieler 2 eingeben
    println("Spieler 1, bitte gib deinen Namen ein...")
    spieler1Name = readln()
    println("Spieler 2, bitte gib deinen Namen ein...")
    spieler2Name = readln()
    println()

    // Spieler 1 und Spieler 2 bekommen zufällig zwischen 500 und 600 Lebenspunkte
    spieler1Leben = Random.nextInt(500, 600)
    spieler2Leben = Random.nextInt(500, 600)
    println()
    playerStatus()
    println()
}


fun rules(){
    println("-------------------------------------------------------------\n" +
            "    \n" +
            "                          Das Duell\n" +
            "    \n" +
            "      Das Spiel:\n" +
            "    \n" +
            "      Der Spieler sucht sich zu Begin des Spiels für die\n" +
            "      zwei Akteure zwei Namen aus. Dann kämpfen die Akteure\n" +
            "      jeweils 3 Runden gegeneinander, wobei beide Akteure\n" +
            "      sich abwechselnd angreifen und dann heilen.\n" +
            "      Am Ende jeder Runde kann der Spieler für jeden Akteur\n" +
            "      eine Spezialattacke auswählen. Der Akteur, der am Ende\n" +
            "      des Spiels die meisten Lebenspunkte hat, gewinnt.\n" +
            "    \n" +
            "     -------------------------------------------------------------")
}


