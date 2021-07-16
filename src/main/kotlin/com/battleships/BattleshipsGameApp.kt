package com.battleships

class BattleshipsGameApp(private val ioStream: IOStream, private val parser: Parser, private val battleshipGame: BattleshipsGame) {
    fun start() {
        val input = ioStream.readInput()
        val command = parser.parse(input)
        command.execute()
        val status = battleshipGame.status
        ioStream.writeOutput(status)
    }

}
