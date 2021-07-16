package com.battleships

interface IOStream {
    fun readInput(): String
    fun writeOutput(output: String)
}