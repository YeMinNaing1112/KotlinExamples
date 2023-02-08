package kotlin_eg

fun main(args: Array<String>) {
    var name = Name("ZanZan",3)

    println(name.id)  
}

class Name(var name: String) {
    var id = -1;

    init {
        println("The name of the Stuent is $name")
    }

    constructor(n: String, id: Int) : this(n) {
        this.id = id
    }
}