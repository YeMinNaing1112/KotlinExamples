package kotlin_eg

fun main() {
    calculate1(40, 2, { first, second -> (first + second) * 3 })
        .toInt()
        .multiplyby5()
        .devi()
        .toString()
        .formatResult()
        .PrintOutPut()
}

fun calculate1(firstNum: Int, SecondNum: Int, calculation: (Int, Int) -> Int): String {
    return calculation(firstNum, SecondNum).toString()

}

fun Int.multiplyby5() = this * 5;
fun Int.devi(): Int = this / 3;
fun String.formatResult() = "The result is $this"
fun String.PrintOutPut() = println(this)
