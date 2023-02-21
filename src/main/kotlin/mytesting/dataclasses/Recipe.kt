package mytesting.dataclasses

 data class Recipe(val title:String, val isVegetarian :Boolean) {

 }
class Recipe1(val title: String,val isVegetarian: Boolean){

}



fun main() {
    val r1=Recipe("Chicken",false)
    val r2=Recipe("Chicken",false)

    val r3=Recipe1("Chicken",false)

    println(r1.toString())
    println(r3.toString())

//    val title=r1.component1()
//    val vegetarina=r1.component2()

//    val (title,vegetarian)=r1
//    println(title)
//    println(r1 == r2)//true //variables are true
//    println(r1 === r2)//false//not same object
}