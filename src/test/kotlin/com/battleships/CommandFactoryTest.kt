package com.battleships

import io.mockk.mockk
import org.assertj.core.api.KotlinAssertions.assertThat
import org.junit.jupiter.api.Test


class CommandFactoryTest {

    private val battleshipsGame: BattleshipsGame = mockk()
    private val factory = CommandFactory(battleshipsGame)

    @Test
    fun `build an AddCommand`() {

        val command = factory.build("add", "Genoveffo")

        assertThat(command).isEqualTo(AddCommand("Genoveffo", battleshipsGame))
    }
}