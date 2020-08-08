package ir.ariadeveloper.learnkotlin

fun loop() {
    //Repeat
    repeat(3) {
        println("Repeat $it")
    }

    //While
    var conditionWhile = 10
    while (conditionWhile <= 10) {
        println("this is While Loop")
        conditionWhile++
    }

    //For
    for (i in 1 to 10) {
        println("this is for Loop")
    }

    //When
    val conditionWhen = 5
    when (conditionWhen) {
        1 -> {
            println("this is When 1")
        }
        2 -> {
            println("this is When 2")
        }
        3, 4, 5 -> {
            println("3 or 4 or 5")
        }
        in 0..Int.MAX_VALUE -> {
            println("Positive")
        }
        is Int -> {
            println("is int")
        }
        else -> print("else")
    }

    //Do While
    do {
        println("Do")
    } while (false)


    //Break an Jump
    loop@ for (i in 1 to 100) {
        for (j in 1 to 100) {
            var result = i * j
            if (result > 500) {
                break@loop
            }
            println(result)
        }
    }

    //Continue
    for (i in 1 to 100) {
        if (i < 50) {
            continue
        }
        println(i)
    }
}