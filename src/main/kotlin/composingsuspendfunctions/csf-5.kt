package csf5

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking{
    val time = measureTimeMillis {
        println("The answer is ${doSomethingUsefulSum()}")
    }
    println("Completed in $time ms")
}

suspend fun doSomethingUsefulSum(): Int = coroutineScope {
    val one = async{doSomethingUsefulOne()}
    val two = async{doSomethingUsefulTwo()}
    one.await() + two.await()
}

suspend fun doSomethingUsefulOne(): Int {
    delay(1000L)
    return 13
}

suspend fun doSomethingUsefulTwo(): Int {
    delay(1000L)
    return 29
}

