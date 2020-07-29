package com.nelson.couroutines.basics

import kotlinx.coroutines.*

fun main() = runBlocking {
    repeat(100_000){
        launch {
            delay(5000L)
            print(".")
        }
    }
}