package com.battleships

class CoreBattleshipGame(override var status: String = "init") : BattleshipsGame {

    private val players = mutableListOf<String>()

    override fun addPlayerWith(name: String) {
        if(players.contains(name)) {
            throw AlreadyExistingPlayerException()
        }
        players.add(name)
        status = "Player $name added!"
    }
}
