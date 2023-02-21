package mytesting

import mytesting.coroutine.playSong

fun main() {
//    val calculation = { x: Int, y: Int -> x + y }//
//    var result = calculation(1, 2)
//    println(result )
//    val calculation2 :(Int ,Int)-> Int={x,y->x+y}
//    result=calculation2(2,3)


    var addFive={x:Int -> x+5}
    println("Pass 6 to add five: ${addFive(6)}")

    val addInts={x:Int ,y:Int ->x+y}
    val result=addInts.invoke(6,7)
    println("Pass 6, 7 to addInts: $result")

    val intLambda:(Int,Int)->Int={x,y->x*y}
    println("Pass 10,11 to intLambda : ${intLambda(10,11)}")

    val addSeven :(Int)->Int={it + 7}
    println("Pass 12 to addSeven : ${addSeven(12)}")

    val myLambda:() ->Unit ={ print("Hi!")}
    println(myLambda)
}

