package com.battleships

class BattleshipsGame(private val ioStream: IOStream, private val parser: Parser) {
    fun start() {
        val input = ioStream.readInput()
        val command = parser.parse(input)
        command.execute()
    }

}
