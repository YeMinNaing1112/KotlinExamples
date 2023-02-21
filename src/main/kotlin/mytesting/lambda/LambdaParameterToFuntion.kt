package mytesting

import mytesting.coroutine.playSong

fun main() {
 convert(20.3,{x:Double->x*1.8+32})
}

fun convert(x:Double,convert:(Double)->Double):Double{
   val result =convert(x);
    println("$x is convert to $result")
    return result
}