package com.battleships

fun main() {
    val battleshipsGame = CoreBattleshipGame()
    val parser = GameParser(CommandFactory(battleshipsGame))
    val console = IOConsole()

    val app = BattleshipsGameApp(console, parser, battleshipsGame)

    app.start()
}