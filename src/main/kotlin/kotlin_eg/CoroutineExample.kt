package kotlin_eg

import kotlinx.coroutines.*

//fun main() {
//    GlobalScope.launch {//launch a new coroutine and continue
//        delay(1000L)//none_block delay for 1s(default time unit is ms)
//        println("World")
//    }
//    println("Hello")//main thread continue while coroutine is delay
//    Thread.sleep(2000L)//block main thread for 2s
//}

//fun main(){
//    GlobalScope.launch {//launch a new coroutine and continue
//        delay(1000L)//none_block delay for 1s(default time unit is ms)
//        println("World")
//    }
//
//    println("Hello")//Main Thread continues here immediately
//    runBlocking {//this expression block main thread
//        delay(2000L)//...while we delay for 2 seconds to keep Jvm alive
//    }
//println(over.)
//}


fun doJob() = runBlocking {
    GlobalScope.launch {//launch a new coroutine and continue
        delay(1000L)//none_block delay for 1s(default time unit is ms)
        println("World")
    }

    println("Hello")//main coroutine continue here immediately
    delay(2000L)//delay 2s to keep jvm alive
}

//fun main() {
//    doJob()
//}

////suspending /////

//fun main(): Unit = runBlocking {
//    val job = GlobalScope.launch {
//        delay(5000L)
//        println("World")
//    }
//    println("Hello")
//    job.join()
//    println("Over")
//}

//this is suspending function
//suspend fun doWork() {
//    println("World")
//    delay(16000L)
//
//}


fun main(): Unit = runBlocking {
    launch {
        delay(1000L)
        println("Task from running block")
    }
    coroutineScope {
        launch {
            delay(500L)
            println("Task from nested launch")
        }
        delay(100L)
        println("Task from Coroutine Scope")//This will be printed before the nested launch
    }

    println("Coroutine scope is over")//This line is not printed until the nested launch complete

}

