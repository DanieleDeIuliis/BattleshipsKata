package com.battleships

import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

class AddCommandTest {

    private val battleshipsGame: BattleshipsGame = mockk(relaxed = true)

    @Test
    fun `add player to battleships game`() {
        val add = AddCommand("PlayerName", battleshipsGame)

        add.execute()

        verify { battleshipsGame.addPlayerWith("PlayerName") }
    }
}