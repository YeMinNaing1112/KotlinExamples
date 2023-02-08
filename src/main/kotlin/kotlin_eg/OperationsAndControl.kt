package kotlin_eg

fun main(args: Array<String>) {
    when(10){
    in 1..2->{
        println("Under 2")
    }
    in 1..5->{
        println("Under 5")
    }
    in 1..10->{
        println("Under 10")
    }
     else->{
         println("Over 10")
     }

 }

    val numbers= listOf<Int>(12,3,4,5,6,5)
    for (i in numbers){
        println("$i")
    }
    for (i in numbers.indices){
        println("$i")
    }
    for((index,value ) in numbers.withIndex()){
        print("$index $value")
    }
    println()
    for(i in 0..5){
        print(i)
    }
    println()
    for (i in 0..10 step 2){
        print(i)
    }
    println()
    for (i in 10 downTo 5){
        print(i)
    }
}