package mytesting.scopefunctions

class Person {
    var name = "ZanZan"
    var age = 20;

}

fun main() {
    val person = Person()

//    person.age=21;
//    person.name="YeMinNaing"
//    println(person.age)
//    println(person.name)

//   With
    val fullName = with(person) {
        age = 20
        name = "YeMinNaing"
        println(age)
        println(name)
        name
    }

//apply
    val person1 = Person().apply {
        age = 20
        name = "ZanZan"
    }

    val newPerson = person1.also {
        it.age = 23;
        it.name = "Yeye"

    }

    val name: String? = null;

    name?.let {
        println(it.length)
        println(it.reversed())
    }

    val person2: Person? = null
    person2?.run {
        age = 20
      this.name = "YeMinNaing"
        println(age)
        println(name)
        name
    }

}