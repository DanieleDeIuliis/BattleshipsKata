package com.battleships

import org.assertj.core.api.KotlinAssertions.assertThat
import org.junit.jupiter.api.Test

class CoreBattleshipGameTest {

    @Test
    fun `adds a player`() {

        val game = CoreBattleshipGame()

        game.addPlayerWith("Genoveffo")

        assertThat(game.status).isEqualTo("Player Genoveffo added!")
    }
}