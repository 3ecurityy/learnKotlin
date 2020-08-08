package ir.ariadeveloper.learnkotlin

fun loop() {
    repeat(3) {
        println("Repeat $it")
    }

    var conditionWhile = 10
    while (conditionWhile <= 10) {
        println("this is While Loop")
        conditionWhile++ }

    for (i in 1 to 10) {
        println("this is for Loop")
    }

    val conditionWhen = 5
    when (conditionWhen) {
        1 -> {
            println("this is When 1")
        }
        2 -> {
            println("this is When 2")
        }
        3 -> {
            println("this is When 3")
        }
        4 -> {
            println("this is When 4")
        }
        5 -> {
            println("this is When 5")
        }
    }

    do {
        println("Do")
    } while (false)
}