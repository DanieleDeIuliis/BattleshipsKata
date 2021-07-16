package com.battleships

class CommandFactory(private val battleshipsGame: BattleshipsGame) {

    fun build(action: String, args: String): Command {
        return when(action) {
            "add" -> AddCommand(args, battleshipsGame)
            else -> throw RuntimeException()
        }
    }

}
