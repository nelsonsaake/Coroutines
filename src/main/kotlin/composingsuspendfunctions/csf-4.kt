package csf4

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() {
    val time = measureTimeMillis {
        val one = doSomethingUsefulOneAsync()
        val two = doSomethingUsefulTwoAsync()
        runBlocking {
            println("The answer is ${one.await() + two.await()}")
        }
    }
    println("Completed in $time ms")
}

fun doSomethingUsefulTwoAsync() = GlobalScope.async {
    doSomethingUsefulTwo()
}

fun doSomethingUsefulOneAsync() = GlobalScope.async {
    doSomethingUsefulOne()
}

suspend fun doSomethingUsefulOne(): Int {
    delay(1000L)
    return 13
}

suspend fun doSomethingUsefulTwo(): Int {
    delay(1000L)
    return 29
}

