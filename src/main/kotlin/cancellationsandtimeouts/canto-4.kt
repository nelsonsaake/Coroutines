package cancellationsandtimeouts

import kotlinx.coroutines.*

fun main() = runBlocking {

    val startTime = System.currentTimeMillis()
    val job = launch(Dispatchers.Default){

        try{

            repeat(1000){ i ->

                println("job: I'm sleeping $i ...")
                delay(500L)
            }
        } finally {

            println("job: I'm running finally")
        }
    }
    delay(1300L)
    println("main: I'm tired of waiting!")
    job.cancelAndJoin()
    println("main: Now I can quit.")
}


