package cancellationsandtimeouts

import kotlinx.coroutines.*

fun main() = runBlocking {
   val result = withTimeoutOrNull(1300L) {
       repeat(1000) { i ->
           println("I'm sleeping $i ...")
           delay(500L)
       }
       "Done"
   }
    println("Results is ${result}")
}


