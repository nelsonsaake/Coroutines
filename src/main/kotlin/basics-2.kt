package com.nelson.couroutines.basics

import kotlinx.coroutines.*

fun main(){

    GlobalScope.launch{
        delay(1000L)
        println("World!")
    }
    println("Hello")
    runBlocking{
        delay(2000L)
    }
}
