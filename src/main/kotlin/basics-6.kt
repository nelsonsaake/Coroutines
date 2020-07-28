package com.nelson

import kotlinx.coroutines.*

fun main() = runBlocking{

    launch{
        delay(2000L)
        println("Task from runBlocking")
    }

    coroutineScope{
        launch{
            delay(5000L)
            println("Task from nested launch")
        }

        delay(1000L)
        println("Task from coroutine scope")
    }

    println("Coroutine scope is over")
}