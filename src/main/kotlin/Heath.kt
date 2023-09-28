fun playerStatus(){
    println("$spieler1Name hat $spieler1Leben Lebenspunkte.")
    println("$spieler2Name hat $spieler2Leben Lebenspunkte.")
}

fun playerOneHeilung(){
    heilen = heilungen.random()
    println("$spieler1Name heilt sich um $heilen Lebenspunkte.")
    spieler1Leben+=heilen
}
fun playerTwoHeilung(){
    heilen = heilungen.random()
    println("$spieler2Name heilt sich um $heilen Lebenspunkte.")
    spieler2Leben+=heilen
}
fun heilen(){
    println(" __    __   _______  __   __       _______ .__   __. \n" +
            "|  |  |  | |   ____||  | |  |     |   ____||  \\ |  | \n" +
            "|  |__|  | |  |__   |  | |  |     |  |__   |   \\|  | \n" +
            "|   __   | |   __|  |  | |  |     |   __|  |  . `  | \n" +
            "|  |  |  | |  |____ |  | |  `----.|  |____ |  |\\   | \n" +
            "|__|  |__| |_______||__| |_______||_______||__| \\__| \n" +
            "\n")
    println()
    Thread.sleep(2000)
    playerOneHeilung()
    println()
    playerTwoHeilung()
    println()
    Thread.sleep(3000)
    playerStatus()
    Thread.sleep(3500)
    println()
}