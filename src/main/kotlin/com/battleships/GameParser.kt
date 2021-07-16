package com.battleships

class GameParser(private val factory: CommandFactory) : Parser {

    override fun parse(input: String): Command {
        val (action,argument) = input.split(' ')
        return factory.build(action, argument)
    }

}
