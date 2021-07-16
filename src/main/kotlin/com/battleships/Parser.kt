package com.battleships

interface Parser {
    fun parse(s: String): Command
}
