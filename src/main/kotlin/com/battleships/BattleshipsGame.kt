package com.battleships

class BattleshipsGame(private val ioStream: IOStream, private val parser: Parser) {
    fun start() {
        val input = ioStream.readInput()
        parser.parse(input)
    }

}
