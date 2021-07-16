package com.battleships

interface CommandFactory {
    fun build(action: String, args: String): Command

}
