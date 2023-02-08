package kotlin_eg

var calcuate: (number1: Int, number2: Int, operator: Char) -> Int = { i: Int, i1: Int, c: Char -> 0 }

fun numberListCalculator(numberList: List<Int>, operator: Char, calculate: (Int, Int, operator: Char) -> Int): Int {
    var initialValue = 0
    for (i in numberList) {
        initialValue = calculate(initialValue, i, operator)
    }

    return initialValue
}

fun main(args: Array<String>) {
    val numberList = listOf(1, 2, 3, 4)
    calcuate = { number1: Int, number2: Int, c: Char ->
        when (c) {
            '+' -> number1 + number2
            '-' -> number1 - number2
            '*' -> number1 * number2
            '5' -> number1 % number2
            else -> {
                0
            }
        }
    }


    val result =
        numberListCalculator(
            numberList = numberList,
            operator = '+', calcuate
        )
    println("The Result is $result")
//            calculate = { number1, number2, operator ->
//            when (operator) {
//                '+' -> number1 + number2
//                '-' -> number1 - number2
//                '*' -> number1 * number2
//                '5' -> number1 % number2
//                else -> {
//                    0
//                }
//            }
//
//        })
//
//    println("The Result is $result")

    val result1 =
        numberListCalculator(
            numberList = numberList,
            operator = '+'
        ) { number1, number2, operator ->
            when (operator) {
                '+' -> number1 + number2
                '-' -> number1 - number2
                '*' -> number1 * number2
                '5' -> number1 % number2
                else -> {
                    0
                }
            }
        }
    println(result1)
}