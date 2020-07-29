package com.nelson.couroutines.basics

import kotlinx.coroutines.*

fun main() = runBlocking {
    GlobalScope.launch{
        repeat(1000){ i ->
            println("I'm sleeping $i ...")
            delay(5000L)
        }
    }
    delay(13000L)
}