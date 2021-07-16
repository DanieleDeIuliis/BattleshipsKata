package com.battleships

data class AddCommand(private val playerName: String, private val game: BattleshipsGame): Command {

    override fun execute() {
        game.addPlayerWith(playerName)
    }

}
