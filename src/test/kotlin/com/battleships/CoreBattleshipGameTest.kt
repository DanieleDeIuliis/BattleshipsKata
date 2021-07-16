package com.battleships

import org.assertj.core.api.KotlinAssertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class CoreBattleshipGameTest {

    @Test
    fun `adds a player`() {

        val game = CoreBattleshipGame()

        game.addPlayerWith("Genoveffo")

        assertThat(game.status).isEqualTo("Player Genoveffo added!")
    }

    @Test
    fun `can't add an existing player`() {

        val game = CoreBattleshipGame()

        game.addPlayerWith("Genoveffo")

        assertThrows<AlreadyExistingPlayerException> { game.addPlayerWith("Genoveffo") }

    }
}