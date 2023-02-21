package mytesting.lambda

fun combine(lambda1: (Double) -> Double, lambda2: (Double) -> Double): (Double) -> Double {
    return { x: Double -> lambda2(lambda1(x)) }
}

fun main() {
    val kgsToPounds = { x: Double -> x * 2.204623 }
    val poundsToUsTons = { x: Double -> x / 2000.0 }

    val usTons = combine(kgsToPounds, poundsToUsTons)(1000.0)
    println(usTons)
}