package mytesting.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch {
        // This code runs in a separate coroutine
        delay(4000L) // Suspend the coroutine for 1 second
        println("World!")
    }
    // This code runs in the main thread
    Thread.sleep(5000L)
    println("Hello,")
     // Block the main thread for 2 seconds
}