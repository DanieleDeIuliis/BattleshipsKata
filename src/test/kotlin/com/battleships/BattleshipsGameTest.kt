package com.battleships

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

class BattleshipsGameTest {

    private val ioStream: IOStream = mockk(relaxed = true)
    private val parser: Parser = mockk(relaxed = true)
    private val game = BattleshipsGame(ioStream, parser)


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
}