package com.battleships

import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

class GameParserTest {

    private val factory = mockk<CommandFactory>(relaxed = true)
    private val parser = GameParser(factory)

    @Test
    fun `asks for add command`() {

        parser.parse("add Topolino")

        verify { factory.build("add","Topolino") }
    }
}