fun attack(){
    println("     ___   .___________.___________.    ___       ______  __  ___ \n" +
            "    /   \\  |           |           |   /   \\     /      ||  |/  / \n" +
            "   /  ^  \\ `---|  |----`---|  |----`  /  ^  \\   |  ,----'|  '  /  \n" +
            "  /  /_\\  \\    |  |        |  |      /  /_\\  \\  |  |     |    <   \n" +
            " /  _____  \\   |  |        |  |     /  _____  \\ |  `----.|  .  \\  \n" +
            "/__/     \\__\\  |__|        |__|    /__/     \\__\\ \\______||__|\\__\\ \n" +
            "\n")
    println()
    Thread.sleep(2000)
    playerOneAttack()
    println()
    playerTwoAttack()
    println()
    Thread.sleep(3000)
    playerStatus()
    Thread.sleep(3500)
    println()
}
fun spezial(){
    println("     _______..______    _______  ________   __       ___       __      \n" +
            "    /       ||   _  \\  |   ____||       /  |  |     /   \\     |  |     \n" +
            "   |   (----`|  |_)  | |  |__   `---/  /   |  |    /  ^  \\    |  |     \n" +
            "    \\   \\    |   ___/  |   __|     /  /    |  |   /  /_\\  \\   |  |     \n" +
            ".----)   |   |  |      |  |____   /  /----.|  |  /  _____  \\  |  `----.\n" +
            "|_______/    | _|      |_______| /________||__| /__/     \\__\\ |_______|\n" +
            "\n")
    println()
    Thread.sleep(2000)
    spezialOne()
    println()
    spezialTwo()
    println()
    Thread.sleep(3000)
    playerStatus()
    Thread.sleep(3500)
    println()
}
fun spezialOne(){
    println("Welche Spezialattacke soll $spieler1Name ausführen?")
    println("Diese Spezialattacken sind verfügbar:")
    println(spezialAttackenOne.keys.shuffled())
    println("Bitte gib die Spezialattacke an.")
    schaden = spezialAttackenOne[readln()]!!
    spieler2Leben -= schaden
    println("$spieler1Name fügt $spieler2Name mit der Spezialattacke $schaden zu")
}
fun spezialTwo(){
    println("Welche Spezialattacke soll $spieler2Name ausführen?")
    println("Diese Spezialattacken sind verfügbar:")
    println(spezialAttackenTwo.keys.shuffled())
    println("Bitte gib die Spezialattacke an.")
    schaden = spezialAttackenTwo[readln()]!!
    spieler1Leben -= schaden
    println("$spieler2Name fügt $spieler1Name mit der Spezialattacke $schaden zu")
}
fun playerOneAttack(){
    schaden = attacken.random()
    println("$spieler1Name greift $spieler2Name an und verursacht $schaden Schadenspunkte.")
    spieler2Leben-=schaden

}
fun playerTwoAttack(){
    schaden = attacken.random()
    println("$spieler2Name greift $spieler1Name an und verursacht $schaden Schadenspunkte.")
    spieler1Leben-=schaden
}
fun round(){
    attack()

    heilen()

    spezial()
}