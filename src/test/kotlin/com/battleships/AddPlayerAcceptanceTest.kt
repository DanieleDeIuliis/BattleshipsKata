package com.battleships

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

@Disabled
class AddPlayerAcceptanceTest {

    private val ioStream: IOStream = mockk(relaxed = true)

    @Test
    fun `happy path`() {
        every { ioStream.readInput() } returns "add Pippo"

        val battleshipGame = CoreBattleshipGame("")
        val consoleApp = BattleshipsGameApp(ioStream, GameParser(CommandFactory(battleshipGame)), battleshipGame)
        consoleApp.start()

        verify { ioStream.writeOutput("Player Pippo added!") }
    }
}

