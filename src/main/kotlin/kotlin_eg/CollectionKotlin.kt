package kotlin_eg

//List
val myList= listOf(1,2,3);
val myMutableList= mutableListOf<Int>(1,2,3,4,5)

//Map
val map= mapOf<Int, String>(1 to "kotlin.Name",2 to "Age",3 to "Address")
val myMutableMap= mutableMapOf<String, String>("a " to "apple","b" to "Banana")

//
val set= setOf<Int>(1,1,2,2,3)
val myMutableSet = mutableSetOf<Int>(2,2,1,34,4)
fun main(args: Array<String>) {
    myMutableList.add(8)

    myMutableMap["c"] = "car";
    myMutableMap.put("c","cow")
}