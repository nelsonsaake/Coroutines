package com.nelson

import kotlinx.coroutines.*

fun main() = runBlocking {

    launch{
        delay(2000L)
        println("World!")
    }
    println("Hello, ")
}