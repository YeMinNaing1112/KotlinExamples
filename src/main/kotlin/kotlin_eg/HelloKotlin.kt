package kotlin_eg

lateinit var value3: String;

fun main(args: Array<String>) {
    val name: String?=null;
    println(name)
    val value1="MgMg"
    //value1="UMya"//compile error
    var value2="AungAung"
    value2="ZawZaw"

    value3 ="AyeAye"
    println(value2+value2+ value3)

    Person.person();
}