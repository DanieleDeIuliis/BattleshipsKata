package com.battleships

class IOConsole: IOStream {
    override fun readInput(): String {
        return readLine() ?: ""
    }

    override fun writeOutput(output: String) {
        println(output)
    }
}