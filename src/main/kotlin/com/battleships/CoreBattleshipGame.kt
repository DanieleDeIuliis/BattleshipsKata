package com.battleships

class CoreBattleshipGame(override var status: String = "init") : BattleshipsGame {

    private val players = mutableListOf<String>()

    override fun addPlayerWith(name: String) {
        players.add(name)
        status = "Player $name added!"
    }
}
