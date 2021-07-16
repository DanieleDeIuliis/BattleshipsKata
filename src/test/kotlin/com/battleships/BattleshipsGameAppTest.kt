package com.battleships

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

class BattleshipsGameAppTest {

    private val battleshipGame = mockk<BattleshipsGame>(relaxed = true)
    private val ioStream: IOStream = mockk(relaxed = true)
    private val parser: Parser = mockk(relaxed = true)
    private val game = BattleshipsGameApp(ioStream, parser, battleshipGame)

    @Test
    fun `execute a command and write the current status`() {
        val mockCommand = mockk<Command>(relaxed = true)

        every { ioStream.readInput() } returns "add Paperino"
        every { parser.parse("add Paperino") } returns mockCommand
        every { battleshipGame.status } returns "Player Paperino added!"

        game.start()

        verify { ioStream.writeOutput("Player Paperino added!") }
    }
}