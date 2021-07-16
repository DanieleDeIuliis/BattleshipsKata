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
    fun `when application starts read from input`() {
        game.start()

        verify { ioStream.readInput() }
    }

    @Test
    fun `parse input to retrieve current command`() {
        every { ioStream.readInput() } returns "add Paperino"

        game.start()

        verify { parser.parse("add Paperino") }
    }

    @Test
    fun `execute command`() {
        val mockCommand = mockk<Command>(relaxed = true)

        every { ioStream.readInput() } returns "add Paperino"
        every { parser.parse("add Paperino") } returns mockCommand

        game.start()

        verify { mockCommand.execute() }
    }

    @Test
    fun `ask for status after command execution`() {
        val mockCommand = mockk<Command>(relaxed = true)

        every { ioStream.readInput() } returns "add Paperino"
        every { parser.parse("add Paperino") } returns mockCommand

        game.start()

        verify { battleshipGame.status }
    }
}