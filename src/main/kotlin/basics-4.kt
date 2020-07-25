package com.nelson

import kotlinx.coroutines.*

val job = GlobalScope.launch {
    delay(1000L)
    println("World!")
}

fun main() {
    println("Hello, ")
    job.join()
}