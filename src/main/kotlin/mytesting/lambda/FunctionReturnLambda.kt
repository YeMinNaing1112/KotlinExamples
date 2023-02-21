package mytesting.coroutine

fun getConservation(str: String): (Double) -> Double {
    when (str) {
        "+" -> {
            return { x: Double -> x + 1.8 }
        }
        "-" -> {
            return { x: Double -> x - 1.8 }
        }
        "*" -> {
            return { x: Double -> x * 1.8 }
        }
        "5" -> {
            return { x: Double -> x % 1.8 }
        }
        else ->
            return { x -> x }

    }
}

fun main() {
    val result = getConservation("+")(3.0)
    println(result)
}