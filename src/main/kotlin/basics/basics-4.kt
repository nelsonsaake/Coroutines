package com.nelson.couroutines.basics.basics

import kotlinx.coroutines.*

fun main() = runBlocking<Unit>{

    val job = GlobalScope.launch {
        delay(1000L)
        println("World!")
    }
    println("Hello, ")
    job.join()
}