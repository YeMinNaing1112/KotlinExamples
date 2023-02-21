package kotlin_eg

class Developer(val name: String) {
    companion object {
        val address = "Yangon"
    }
}

fun main() {
    println("Palindrome -> ${"101".isPalindrome()}")
    println(Developer("Ye Min Naing").getFirstName())
    println(Developer("Ye Min Naing").defaultPosition)
    println(Developer.getAddress())
}

fun String.isPalindrome(): Boolean {
    var reverse = ""
    for (i in this.length - 1 downTo 0) {
        reverse += this[i]

    }
    if (reverse == this) return true
    return false

}

fun Developer.getFirstName(): String {
    return name.split(" ").first()
}

val Developer.defaultPosition: String
    get() = "Mobile Developer"

fun Developer.Companion.getAddress(): String {
    return "I'm from $address"
}